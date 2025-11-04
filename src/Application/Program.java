package Application;

import Entities.Rectangle;
import java.util.*;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		System.out.println("Enter rectangle and height: ");
		rectangle.Width = sc.nextDouble();
		rectangle.Height = sc.nextDouble();
		
		rectangle.Area();
		System.out.println("AREA:" + rectangle.Area());			
		
		rectangle.Perimeter(); 
		System.out.println("PERMITER: " + rectangle.Perimeter());
		
		rectangle.Diagonal();
		System.out.println("DIAGONAL: " + rectangle.Diagonal());
		
		sc.close();
	}

}
