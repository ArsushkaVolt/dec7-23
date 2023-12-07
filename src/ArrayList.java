public class ArrayList
{
    private int[] _array;
    public int Count; // кол-во элементов


    public ArrayList() // конструктор для целых числах
    {
        _array = new int[10];
        Count = 0;
    }
    public ArrayList(int element) // конструктор для целых числах
    {
        _array = new int[10];
        _array[0] = element;
        Count = 1;
    }

    public ArrayList(int[] element) // конструктор для строк
    {
        _array = new int[(int)(element.length * 1.5)];
        System.arraycopy(element, 0, _array, 0, element.length);
        Count = element.length;
    }
    public int Get(int index)
    {
        if(index < 0 || index >= Count)
        {
            throw new IndexOutOfBoundsException("Bad index");
        }
        return _array[index];
    }

    public void Add(int element)
    {
        if(Count >= _array.length)
        {
            IncreaseLength(1);

        }
        _array[Count] = element;
        Count ++;

    }
    private  void IncreaseLength(int elementCount)
    {
        int newLength = (int) ((_array.length + elementCount) * 1.5 );
        int[] newArray = new int[newLength];
        System.arraycopy(_array, 0, newArray, 0, _array.length);
    }
}

//1)проверяем можем ли вы добавить элемент
//2) если места нету, вызываем метод увеличения длины массива
// int[] newArr = new int[_array_Length * 1,5 +1]
// copy _array -> newArray; _array = newArray;