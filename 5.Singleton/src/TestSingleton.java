public class TestSingleton {
    public static void main(String[] args) {
        System.out.println(classic.Singleton.getInstance());
        System.out.println(classic.Singleton.getInstance());

        System.out.println(synchronizedSingleton.Singleton.getInstance());
        System.out.println(synchronizedSingleton.Singleton.getInstance());

        System.out.println(createOnInit.Singleton.getInstance());
        System.out.println(createOnInit.Singleton.getInstance());

        System.out.println(block.Singleton.getInstance());
        System.out.println(block.Singleton.getInstance());
    }
}
