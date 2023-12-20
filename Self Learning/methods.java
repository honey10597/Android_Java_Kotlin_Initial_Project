class Scratch {
    public static void main(String[] args) {
        function();
        log(stringFunction());
        log(addNumbers(1, 9));
    }

    static void function() {
        log("This is simple function");
    }

    static String stringFunction() {
        String str = "This is return string";
        return str;
    }

    static int addNumbers(int a, int b) {
        return a + b;
    }

    static void log(Object anything) {
        System.out.println(anything);
    }
}