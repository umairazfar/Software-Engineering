
public class FactoryProducer {
	
	public AbstractFactory getFactory(String name)
	{
		AbstractFactory factory = null;
		
		name = name.toUpperCase();
		
		switch(name)
		{
		case "SHAPEFACTORY":
			factory = new ShapeFactory();
			break;
		case "ROUNDEDSHAPEFACTORY":
			factory = new RoundedShapeFactory();
			break;
		}
		
		
		return factory;
	}
}
