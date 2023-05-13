package patternt_iterator.iterator;

import patternt_iterator.implementation.Order;

/**
 * Паттерн Iterator задает способ перебора некоторого множества объектов.
 * Интерфейс Iterator предоставляет методы для перебора коллекций такие как:
 * boolean hasNext()
 * Order next();
 * При создании экземпляра Iterator указатель находится в начале списка
 */
public interface Iterator {
    /**
     * Этот метод проверяет, присутствует ли следующий элемент
     * @return Если элемент присутствует, возвращает true иначе false
     */
    boolean hasNext();
    /**
     * Этот метод возвращает текущий элемент и преходит на следующий
     * @return Текущий элемент
     * @exception В случае если метод вернул последний элемент списка,
     *            то повторный его вызов выбросит исключение типа NoSuchElementException
     */
    Order next();
}
