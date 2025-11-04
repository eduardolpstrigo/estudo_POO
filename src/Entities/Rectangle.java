package Entities;

public class Rectangle {
	public double Width;
	public double Height;
	
	public double Area() {
		return Width * Height;
	}
	
	public double Perimeter() {
		return (2 * Width) + (2 * Height);
	}
	
	public double Diagonal() {
		return Math.sqrt((Height * Height) + (Width * Width));
	}
	
}
