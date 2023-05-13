package patternt_iterator.exception;

public class NoSuchElementException extends RuntimeException {
    public NoSuchElementException() {
        super("Итерируемые элементы закончились");
    }
}
