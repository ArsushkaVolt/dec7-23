public class ArrayList
{
    private int[] _array;
    private int _size; // размер массивов
    public int Count; // кол-во элементов

    public ArrayList() // конструктор для целых числах
    {
        _array = new int[10];
        Count = 0;
    }

    public ArrayList(int elements) // конструктор для строк
    {
        _array = new int[(int)(elements.length * 1.5)];
        System.arraycopy(elements, 0, _array, 0, elements.length);
        Count = elements.length;
    }
}
