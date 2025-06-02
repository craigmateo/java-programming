public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World.");

        if (args.length > 0) {
            System.out.println("Arguments passed:");
            for (String arg : args) {
                System.out.println(arg);
            }
        } else {
            System.out.println("No arguments passed.");
        }
    }
}
