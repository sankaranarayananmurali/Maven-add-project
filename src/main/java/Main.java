package jar;

public class Main {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        App app = new App();
        int result = app.add(num1, num2);

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
    }
}

