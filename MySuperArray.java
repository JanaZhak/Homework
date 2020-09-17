package MySuperArray;

public interface MySuperArray {

    int getLength();//получить текущую длинну массива

    void addElement(int o); //добавить элемент.длинна массва увеличится на 1

    Object getElement(int index); //получить элемент по индексу

    void removeAllElements();//удалить все текущие элементы (длинна массива будет 0 после)

    Object[] getAllElements();//вернуть в массив текуущие элементы

}
