
public class Singleton {
	private static Singleton instance = new Singleton();
	
	private	Singleton()
	{
		
	}
	
	public static Singleton getInstance()
	{
		return instance;
	}
	
	public static void Info()
	{
		System.out.println("Singleton");
	}
}
