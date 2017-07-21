package edu.osu.cs362;

public class Calculator {
	private double x;
	private double y;
	private static int result;
	
	public double getX() {
		return x;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setY(double y) {
		this.y = y;
	}

	public double add1(double x , double y) {
		return x + y;
	}
	
	public void add2(int n) {
		result = result + n;
	}
	
	public double reduction1(double x , double y) {
		return x - y;
	}
	
	public void reduction2(int n) {
		result = result - 1;     //  Bug: should be "result = result - n"
	}
	
	public double multiply1(double x , double y) {
		return x * y;
	}
	
	public void multiply2(int n) {
		// not finish method
	}
	
	public double division1(double x , double y) {
		return x / y;
	}
	
	public void division2(int n) {
		result = result / n;
	}
	
	public void square() {
		int[] a = new int[4];
		int[] b = {5,6,7,8};
		for(int i=0; i<4; i++)
		{
			a[i] = b[i]+1;
			result += a[i] * a[i];
		}
		
	}
	
	public void squareRoot(int n) {
		for(;;);     // Bug: dead loop
	}
	
	public void clear() {
		result = 0;     // clear result
	}
	
	public int getResult() {
		return result;
	}
		
	public static void main(String args[]) {
		Cat cat1 = new Cat(1,2,3);				
		System.out.println(cat1.Color+cat1.height+cat1.weight);		
	}	
}

class Cat{
	int Color;
	int height,weight;
	
	Cat(int color, int height, int weight){
		this.Color = color;
		this.height = height;
		this.weight = weight;
	}
}