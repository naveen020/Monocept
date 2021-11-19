package hello;

public class SingletonClassEx {

	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		System.out.println("instance" + instance);

		Singleton secondInstance = Singleton.getInstance();
		System.out.println("instance" + secondInstance);

	}
}
