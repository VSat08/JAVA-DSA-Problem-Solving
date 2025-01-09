
interface Answerable {

    String answer();
}

interface Predicate {

    boolean test(Integer n);
}

public class LambdaFunction {

    public static void main(String[] args) {
        Answerable lambdaFunction = () -> {
            return "This is a Lambda function";
        };

        Predicate isOdd = (n) -> n % 2 != 0;

        System.out.println(lambdaFunction.answer());
        System.out.println(isOdd.test(5));
    }
}
