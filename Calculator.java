import java.util.function.*;

public class Calculator implements Supplier {

    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> {
        try {
            if (y == 0)
                throw new ArithmeticException();
            return x / y;
        } catch (ArithmeticException e) {
            System.out.print("Ошибка - на 0 делить нельзя ");
            return 0;
        }
    };
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;

    public Calculator() {
        instance = instance;
    }

    @Override
    public Supplier get() {
        return instance;
    }
}
