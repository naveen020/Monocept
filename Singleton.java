package hello;

public class Singleton {
	public static Singleton instance = null;

	Singleton() {

	}

	public static Singleton getInstance() {

		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;

	}

}
