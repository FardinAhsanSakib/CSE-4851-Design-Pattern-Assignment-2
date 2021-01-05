/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
public static void main(String[] args)
	{
		Shape square = new Pattern("square");
		Shape rectangle = new Pattern("rectangle");
		Shape triangle = new Pattern("triangle");
		Shape line = new Pattern("line");
		Shape circle = new Pattern("circle");
		Shape oval = new Pattern("oval");
		
		Composite house1 = new Composite("House 1");
		System.out.println("Building House 1");
		house1.addShape(rectangle);
		house1.addShape(triangle);
		System.out.println("Built House 1");
		house1.shapeDescription();
        
		
		Composite house2 = new Composite("House 2");
		System.out.println("Building House 2");
		house2.addShape(square);
		house2.addShape(square);
		house2.addShape(triangle);
		System.out.println("Built House 2");
		house2.shapeDescription();
		
		Composite tree = new Composite("Tree");
		System.out.println("Building Tree");
		tree.addShape(line);
		tree.addShape(circle);
        System.out.println("Built Tree");
		tree.shapeDescription();
		
		Composite River = new Composite("River");
		System.out.println("Building River");
		River.addShape(line);
		River.addShape(oval);
        System.out.println("Built River");
		River.shapeDescription();
		
		Composite market = new Composite("Market");
		System.out.println("Building Market");
		market.addShape(house2);
		market.addShape(River);
        System.out.println("Built Market");
		market.shapeDescription();
		
		
		Composite village = new Composite("Village");
		System.out.println("Building Village");
	    village.addShape(house1);
        village.addShape(market);
		village.addShape(River);
        System.out.println("Built Village");
		village.shapeDescription();
		
		
	
	}
}
