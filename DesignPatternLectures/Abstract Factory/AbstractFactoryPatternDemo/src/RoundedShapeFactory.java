
public class RoundedShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String name) {
		name = name.toUpperCase();
		Shape shape = null;
		switch (name)
		{
		case "ROUNDEDSQUARE":
			shape = new RoundedSquare();
			break;
		case "ROUNDEDRECTANGLE":
			shape = new RoundedRectangle();
			break;
		}
		return shape;
	}

}
