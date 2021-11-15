
public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String name) 
	{
		name = name.toUpperCase();
		Shape shape = null;
		
		switch (name)
		{
		case "SQUARE":
			shape = new Square();
			break;
		case "RECTANGLE":
			shape = new Rectangle();
			break;
		}
		return shape;
	}

}
