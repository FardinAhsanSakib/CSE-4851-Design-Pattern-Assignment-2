import java.util.*;  
public class Composite implements Shape {
	String name;
	List<Shape> shapes= new ArrayList<>();
	
	public Composite(String name) {
		super();
		this.name = name;
	}
	public void addShape(Shape shape)
	{
		shapes.add(shape);
	}
		public String shapeReturn() {
		return name;
	}

	public void shapeDescription() {
		System.out.println(name+" is built using : ");
		for(Shape a : shapes)
		{
			String name = a.shapeReturn();
			System.out.println( name +"\n");
		}
		System.out.println("\n");
	}

}
