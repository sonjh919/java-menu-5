package menu.global.exception;

import java.util.function.Predicate;

public class ValidatorBuilder<T> {
    private final T value;

    private ValidatorBuilder(final T value) {
        this.value = value;
    }

    public static <T> ValidatorBuilder<T> from(final T value) {
        return new ValidatorBuilder<>(value);
    }

    public ValidatorBuilder<T> validate(final Predicate<T> condition, final ExceptionMessage exception) {
        if (condition.test(value)) {
            throw new IllegalArgumentException(exception.message);
        }
        return this;
    }

    public T get() {
        return value;
    }
}
