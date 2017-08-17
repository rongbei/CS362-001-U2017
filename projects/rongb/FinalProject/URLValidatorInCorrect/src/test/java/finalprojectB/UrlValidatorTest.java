
package finalprojectB;

import java.util.Random;
import java.lang.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import finalprojectB.RegexValidator;
import finalprojectB.UrlValidator;
import junit.framework.TestCase;





/**
 * Performs Validation Test for url validations.
 *
 * @version $Revision: 1128446 $ $Date: 2011-05-27 13:29:27 -0700 (Fri, 27 May 2011) $
 */
public class UrlValidatorTest extends TestCase {
    private boolean printStatus = false;
    private boolean printIndex = false;//print index that indicates current scheme,host,port,path, query test were using.

    private static String[] testUrlScheme = null;
    private static String[] testUrlAuthority = null;
    private static String[] testUrlPort = null;
    private static String[] testUrlPath = null;
    private static String[] testUrlQuery = null;

    private static String[] rightUrlScheme = {"", "http://", "https://", "ftp://", "file:///"};
    private static String[] rightUrlAuthority = {"www.*", "*.com", "*.org", "localhost", "255.255.255.255", "0.0.0.0"};
    private static String[] rightUrlPort = {"", "^:(\\d{1,5})$", ""};
    private static String[] rightUrlPath = {"", "*/*", "*/*.html"};
    private static String[] rightUrlQuery = {"", "?action=view", "?action=edit&mode=up"};

    private static String[] wrongUrlScheme = {"://", "http/", "https/", "ftp/", "http:", "https:", "ftp:", "http:/", "https:/", "ftp:/"};
    private static String[] wrongUrlAuthority = {"", "1.2.3.4", "256.256.256.256"};
    private static String[] wrongUrlPort = null;
    private static String[] wrongUrlPath = {"*/.*", "*/..", "*/../*", "*//*"};
    private static String[] wrongUrlQuery = null;

    private static Object[] testParts = {testUrlScheme, testUrlAuthority, testUrlPort, testUrlPath, testUrlQuery};

    public static boolean match(String pattern, String str) {
        if (pattern == null || str == null)
            return false;

        boolean result = false;
        char c;
        boolean beforeStar = false;
        int back_i = 0;
        int back_j = 0;
        int i, j;
        for (i = 0, j = 0; i < str.length();) {
            if (pattern.length() <= j) {
                if (back_i != 0) {
                    beforeStar = true;
                    i = back_i;
                    j = back_j;
                    back_i = 0;
                    back_j = 0;
                    continue;
                }
                break;
            }

            if ((c = pattern.charAt(j)) == '*') {
                if (j == pattern.length() - 1) {
                    result = true;
                    break;
                }
                beforeStar = true;
                j++;
                continue;
            }

            if (beforeStar) {
                if (str.charAt(i) == c) {
                    beforeStar = false;
                    back_i = i + 1;
                    back_j = j;
                    j++;
                }
            } else {
                if (c != '?' && c != str.charAt(i)) {
                    result = false;
                    if (back_i != 0) {
                        beforeStar = true;
                        i = back_i;
                        j = back_j;
                        back_i = 0;
                        back_j = 0;
                        continue;
                    }
                    break;
                }
                j++;
            }
            i++;
        }

        if (i == str.length() && j == pattern.length())
            result = true;
        return result;
    }

    public UrlValidatorTest(String testName) {
        super(testName);
    }

    public void testManualTest()
    {
        UrlValidator urlVal1 = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
        assertTrue(urlVal1.isValid("http://www.amazon.com"));

        System.out.println(UrlValidator.getInstance());

        UrlValidator urlVal2 = new UrlValidator();
        assertTrue(urlVal2.isValid("http://www.apache.org/test/index.html"));
        assertTrue(urlVal2.isValid("https://www.apache.org/test/index.html#1"));
        assertFalse(urlVal2.isValid("ftp://guest:123@192.168.1.1/"));
        assertFalse(urlVal2.isValid("file:///C:/some.file"));
        assertFalse(urlVal2.isValid("http://localhost/test/index.html"));
        assertFalse(urlVal2.isValid("http://somewhere.com/pathxyz//file(1).html"));
        assertFalse(urlVal2.isValid("http://61.135.169.125:8080/"));
        assertTrue(urlVal2.isValid("http://www.logoworks.comwww.logoworks.comwww.org#1#2"));

        String[] schemes1 = {"http", "lalalala", "Q1q2-+-..."};
        UrlValidator urlVal3 = new UrlValidator(schemes1);
        assertTrue(urlVal3.isValid("http://tech.yahoo.com/rc/desktops/102;_ylt=Ao8yevQHlZ4On0O3ZJGXLEQFLZA5"));
        assertTrue(urlVal3.isValid("lalalala://ftp.fakesite.org"));
        assertFalse(urlVal3.isValid("http://somewhere.com/pathxyz//file(1).html"));
        assertTrue(urlVal3.isValid("Q1q2-+-...://ftp.fakesite.org"));

        UrlValidator urlVal4 = new UrlValidator(UrlValidator.ALLOW_2_SLASHES);
        assertTrue(urlVal4.isValid("http://somewhere.com/pathxyz//file(1).html"));
        assertTrue(urlVal4.isValid("http://somewhere.com////(/)///...///(p)athxyz///...///file(1)()///...///html"));

        String[] schemes2 = {"http", "https"};
        UrlValidator urlVal5 = new UrlValidator(schemes2, UrlValidator.NO_FRAGMENTS);
        assertTrue(urlVal5.isValid("http://www.logoworks.comwww.logoworks.comwww.org"));
        assertFalse(urlVal5.isValid("http://www.logoworks.comwww.logoworks.comwww.org#1"));

        RegexValidator regex1 = new RegexValidator(new String[] {"localhost", ".*\\.new_test"});
        UrlValidator urlVal6 = new UrlValidator(regex1, 0);
        assertTrue(urlVal6.isValid("http://localhost/test/index.html"));
        assertTrue(urlVal6.isValid("https://first.new_test/test/index.html"));
        assertTrue(urlVal6.isValid("ftp://sup3r.new_test/test/index.html"));
        assertFalse(urlVal6.isValid("http://broke.my_test/test/index.html"));
        assertTrue(urlVal6.isValid("http://www.apache.org/test/index.html"));

        String[] schemes3 = {"http"};
        RegexValidator regex2 = new RegexValidator(new String[] {"localhome", ".*\\.my-test"});
        UrlValidator urlVal7 = new UrlValidator(schemes3, regex2, 0);
        assertTrue(urlVal7.isValid("http://localhome/test/index.html"));
        assertFalse(urlVal7.isValid("ftp://localhome/test/index.html"));
        assertFalse(urlVal7.isValid("https://first.my-test/test/index.html"));
        assertTrue(urlVal7.isValid("http://sup3r.my-test/test/index.html"));
        assertFalse(urlVal7.isValid("http://broke.new-test/test/index.html"));
        assertTrue(urlVal7.isValid("http://www.apache.org/test/index.html"));

        String urx1 = "file:///C:/some.file";
        String urx2 = "http1://www.apache.org/test/index.html";
        String urx3 = "ftp://hostname/test/index.html";
        String urx4 = "http://www.apache.org/../index.html";
        String urx5 = "https://www.gogo.com:-80/ this/?.html";
        String urx6 = "http://www.google.com";
        UrlValidator urlVal8 = new UrlValidator();
        assertFalse(urlVal8.isValid(null));
        assertFalse(urlVal8.isValid(urx1));
        assertFalse(urlVal8.isValid(urx2));
        assertFalse(urlVal8.isValid(urx3));
        assertFalse(urlVal8.isValid(urx4));
        assertFalse(urlVal8.isValid(urx5));
        assertTrue(urlVal8.isValid(urx6));

        UrlValidator urlVal9 = new UrlValidator();
        assertFalse(urlVal9.isValidScheme(null));
        assertFalse(urlVal9.isValidAuthority(null));
        assertFalse(urlVal9.isValidPath(null));
        assertTrue(urlVal9.isValidQuery(null));
        assertTrue(urlVal9.isValidFragment(null));

        String URL_REGEX = "^(([^:/?#]+):)?(//([^/?#]*))?([^?#]*)(\\\\?([^#]*))?(#(.*))?";
        Matcher urlMatcher = Pattern.compile(URL_REGEX).matcher("..111file!!!gogo.html   \\go.html");
        assertTrue(urlMatcher.matches());

        String SCHEME_REGEX = "^\\p{Alpha}[\\p{Alnum}\\+\\-\\.]*";
        Matcher schemeMatcher = Pattern.compile(SCHEME_REGEX).matcher("q1q2http123+-.");
        assertTrue(schemeMatcher.matches());

        String AUTHORITY_CHARS_REGEX = "\\p{Alnum}\\-\\.";
        String AUTHORITY_REGEX = "^([" + AUTHORITY_CHARS_REGEX + "]*)(:\\d*)?(.*)?";
        Matcher authorityMatcher = Pattern.compile(AUTHORITY_REGEX).matcher("*&^%$1_1.goo   gle.2!2");
        assertTrue(authorityMatcher.matches());

    }



    public void testYourFirstPartition()
    {
        RegexValidator regex = new RegexValidator(new String[] {"hostname", "localhost", ".*\\.new-test"});
        UrlValidator urlValidator = new UrlValidator(regex, 0);

        // RegexValidator

        assertTrue(urlValidator.isValid("http://hostname/test/index.html"));

        assertTrue(urlValidator.isValid("http://localhost/test/index.html"));

        assertTrue(urlValidator.isValid("http://first.new-test/test/index.html"));

        assertTrue(urlValidator.isValid("http://sup3r.new-test/test/index.html"));

        assertFalse(urlValidator.isValid("http://broke.my-test/test/index.html"));

        assertFalse(urlValidator.isValid("http://machinename/test/index.html"));

        assertTrue(urlValidator.isValid("http://www.apache.org/test/index.html"));

        // ALLOW_LOCAL_URLS 1

        urlValidator = new UrlValidator(UrlValidator.ALLOW_LOCAL_URLS);

        assertFalse(urlValidator.isValid("http://hostname/test/index.html"));

        assertFalse(urlValidator.isValid("http://localhost/test/index.html"));

        assertTrue(urlValidator.isValid("http://first.new-test/test/index.html"));

        assertTrue(urlValidator.isValid("http://sup3r.new-test/test/index.html"));

        assertTrue(urlValidator.isValid("http://broke.my-test/test/index.html"));

        assertFalse(urlValidator.isValid("http://machinename/test/index.html"));

        assertTrue(urlValidator.isValid("http://www.apache.org/test/index.html"));

        // ALLOW_LOCAL_URLS 2

        urlValidator = new UrlValidator(regex, UrlValidator.ALLOW_LOCAL_URLS);

        assertTrue(urlValidator.isValid("http://hostname/test/index.html"));

        assertTrue(urlValidator.isValid("http://localhost/test/index.html"));

        assertTrue(urlValidator.isValid("http://first.new-test/test/index.html"));

        assertTrue(urlValidator.isValid("http://sup3r.new-test/test/index.html"));

        assertTrue(urlValidator.isValid("http://broke.my-test/test/index.html"));

        assertFalse(urlValidator.isValid("http://machinename/test/index.html"));

        assertTrue(urlValidator.isValid("http://www.apache.org/test/index.html"));

        // OFF ALLOW_LOCAL_URLS

        urlValidator = new UrlValidator(0);

        assertFalse(urlValidator.isValid("http://hostname/test/index.html"));

        assertFalse(urlValidator.isValid("http://localhost/test/index.html"));

        assertFalse(urlValidator.isValid("http://first.new-test/test/index.html"));

        assertFalse(urlValidator.isValid("http://sup3r.new-test/test/index.html"));

        assertFalse(urlValidator.isValid("http://broke.my-test/test/index.html"));

        assertFalse(urlValidator.isValid("http://machinename/test/index.html"));

        assertTrue(urlValidator.isValid("http://www.apache.org/test/index.html"));

    }

    public void testYourSecondPartition()
    {
        String[] schemes = {"http", "test", "file"};
        RegexValidator regex = new RegexValidator(new String[] {"localhost", ".*\\.new-test"});
        UrlValidator urlValidator = new UrlValidator(schemes, regex, 0);

        assertTrue(urlValidator.isValid("file://localhost/c:/WINDOWS/clock.avi"));

        assertTrue(urlValidator.isValid("file:///c:/WINDOWS/clock.avi"));

        assertTrue(urlValidator.isValid("file://"));

        assertTrue(urlValidator.isValid("file:///"));

        assertTrue(urlValidator.isValid("test://localhost/"));

        assertFalse(urlValidator.isValid("test123://github.com/"));

        assertFalse(urlValidator.isValid("https://github.com/"));

        assertFalse(urlValidator.isValid("http://hostname/test/index.html"));

        assertTrue(urlValidator.isValid("http://localhost/test/index.html"));

        assertTrue(urlValidator.isValid("http://first.new-test/test/index.html"));

        assertFalse(urlValidator.isValid("ftp://localhost/test/index.html"));

        // ALLOW_LOCAL_URLS 1

        urlValidator = new UrlValidator(schemes, UrlValidator.ALLOW_LOCAL_URLS);

        assertFalse(urlValidator.isValid("file://localhost/c:/WINDOWS/clock.avi"));

        assertTrue(urlValidator.isValid("file:///c:/WINDOWS/clock.avi"));

        assertTrue(urlValidator.isValid("file://"));

        assertTrue(urlValidator.isValid("file:///"));

        assertFalse(urlValidator.isValid("test://localhost/"));

        assertFalse(urlValidator.isValid("test123://github.com/"));

        assertFalse(urlValidator.isValid("https://github.com/"));

        assertFalse(urlValidator.isValid("http://hostname/test/index.html"));

        assertFalse(urlValidator.isValid("http://localhost/test/index.html"));

        assertTrue(urlValidator.isValid("http://first.new-test/test/index.html"));

        assertFalse(urlValidator.isValid("ftp://localhost/test/index.html"));

        // ALLOW_LOCAL_URLS 2

        urlValidator = new UrlValidator(schemes, regex, UrlValidator.ALLOW_LOCAL_URLS);

        assertTrue(urlValidator.isValid("file://localhost/c:/WINDOWS/clock.avi"));

        assertTrue(urlValidator.isValid("file:///c:/WINDOWS/clock.avi"));

        assertTrue(urlValidator.isValid("file://"));

        assertTrue(urlValidator.isValid("file:///"));

        assertTrue(urlValidator.isValid("test://localhost/"));

        assertFalse(urlValidator.isValid("test123://github.com/"));

        assertFalse(urlValidator.isValid("https://github.com/"));

        assertFalse(urlValidator.isValid("http://hostname/test/index.html"));

        assertTrue(urlValidator.isValid("http://localhost/test/index.html"));

        assertTrue(urlValidator.isValid("http://first.new-test/test/index.html"));

        assertFalse(urlValidator.isValid("ftp://localhost/test/index.html"));

        // OFF ALLOW_LOCAL_URLS

        urlValidator = new UrlValidator(schemes, 0);

        assertFalse(urlValidator.isValid("file://localhost/c:/WINDOWS/clock.avi"));

        assertTrue(urlValidator.isValid("file:///c:/WINDOWS/clock.avi"));

        assertTrue(urlValidator.isValid("file://"));

        assertTrue(urlValidator.isValid("file:///"));

        assertFalse(urlValidator.isValid("test://localhost/"));

        assertFalse(urlValidator.isValid("test123://github.com/"));

        assertFalse(urlValidator.isValid("https://github.com/"));

        assertFalse(urlValidator.isValid("http://hostname/test/index.html"));

        assertFalse(urlValidator.isValid("http://localhost/test/index.html"));

        assertFalse(urlValidator.isValid("http://first.new-test/test/index.html"));

        assertFalse(urlValidator.isValid("ftp://localhost/test/index.html"));

    }

    public void testYourThirdPartition(){
        UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);

        assertTrue(urlVal.isValid("https://1.190.0.40"));

        assertTrue(urlVal.isValid("https://255.255.255.255"));

        assertFalse(urlVal.isValid("https://-1.190.30.40"));

        assertFalse(urlVal.isValid("https://255.-25.255.255"));

        assertFalse(urlVal.isValid("https://256.256.256.256"));

        assertFalse(urlVal.isValid("https://900.255.255.255"));

    }


    public void testIsValid(Object[] testObjects, long options)
    {
        StringBuffer testBuffer = new StringBuffer();
        boolean[] part = {false, false, false, false, false};
        boolean result = false;

        UrlValidator urlVal = new UrlValidator(null, null, options);
//	   System.out.println(urlVal.isValid("http://www.amazon.com"));

        for(int i=0; i<rightUrlScheme.length-1; i++)
        {
            if(match(rightUrlScheme[i], (String) testObjects[0]))
                part[0] = true;
        }

        for(int i=0; i<wrongUrlScheme.length-1; i++)
        {
            if(match(wrongUrlScheme[i], (String) testObjects[0]))
                part[0] = false;
        }

        for(int i=0; i<rightUrlAuthority.length-1; i++)
        {
            String[] patterns = {"", "^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$", ""};
            boolean b = false;

            for(int j=0; j<patterns.length-1; j++)
            {
                Pattern p = Pattern.compile(patterns[j]);
                Matcher m = p.matcher((String) testObjects[1]);
                b = m.matches();
            }

            if(match(rightUrlAuthority[i], (String) testObjects[1]) || b==true)
                part[1] = true;

        }

        for(int i=0; i<wrongUrlAuthority.length-1; i++)
        {
            if(match(wrongUrlAuthority[i], (String) testObjects[1]))
                part[1] = false;
        }

        for(int i=0; i<rightUrlPort.length-1; i++)
        {
            Pattern p = Pattern.compile(rightUrlPort[i]);
            Matcher m = p.matcher((String) testObjects[2]);
            boolean b = m.matches();
            if(b==true)
                part[2] = true;
        }

        for(int i=0; i<rightUrlPath.length-1; i++)
        {
            if(match(rightUrlPath[i], (String) testObjects[3]))
                part[3] = true;
        }

        for(int i=0; i<wrongUrlPath.length-1; i++)
        {
            if(match(wrongUrlPath[i], (String) testObjects[3]))
                part[3] = false;
        }

        for(int i=0; i<rightUrlQuery.length-1; i++)
        {
            if(match(rightUrlQuery[i], (String) testObjects[4]))
                part[4] = true;
        }

        for(int i=0; i<5; i++)
        {
            testBuffer.append((String) testObjects[i]);
            result = part[0] && part[1] && part[2] && part[3] && part[4] && urlVal.isValid(testBuffer.toString());
        }

        System.out.println(testBuffer.toString() + "     ---     *** this Url is: " + result + " ***" + " (" + part[0] + "," + part[1] + "," + part[2] + "," + part[3] + "," + part[4] + ")");

    }

    public void testAnyOtherUnitTest()
    {

    }
    /**
     * Create set of tests by taking the testUrlXXX arrays and
     * running through all possible permutations of their combinations.
     *
     * @param testObjects Used to create a url.
     */

    public void testUrl1()
    {
        Object[] testObjects = {"http://", "www.google.com", "", "/a/oregonstate.edu/acs", ""};
        testIsValid(testObjects, UrlValidator.ALLOW_ALL_SCHEMES);
    }

    public void testUrl2()
    {
        Object[] testObjects = {"http://", "www.logoworks.comwww.logoworks.comwww.org", "", "", ""};
        testIsValid(testObjects, UrlValidator.ALLOW_ALL_SCHEMES);
    }

    public void testUrl3()
    {
        Object[] testObjects = {"https:", "www.google.com", ":8080", "/../", ""};
        testIsValid(testObjects, UrlValidator.ALLOW_ALL_SCHEMES);
    }

    public void testUrl4()
    {
        Object[] testObjects = {"https://", "202.96.92.100", ":-3000", "", ""};
        testIsValid(testObjects, UrlValidator.ALLOW_ALL_SCHEMES);
    }

}
