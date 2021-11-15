
public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		
		FactoryProducer fp= new FactoryProducer();
		
		AbstractFactory factory = null;
		
		factory = fp.getFactory("ShapeFactory");
		
		Shape shape = factory.getShape("square");
		
		shape = factory.getShape("rectangle");
		
		factory = fp.getFactory("RoundedShapeFactory");
		
		shape = factory.getShape("roundedsquare");
		
		shape = factory.getShape("roundedrectangle");

	}

}
