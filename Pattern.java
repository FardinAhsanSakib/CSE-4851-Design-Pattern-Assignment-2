
public class Pattern implements Shape {
	String name;
	
	public Pattern(String name) {
		super();
		this.name = name;
	}

	public void shapeDescription() {
		System.out.println(name);
	}
	public String shapeReturn() {
		return name;
	}

}
