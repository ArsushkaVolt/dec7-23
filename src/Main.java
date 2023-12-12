public class Main {
    public static void main(String[] args) {
        var arr = new ArrayList(new int[] {1,2,3});
        PrintArray(arr);
        arr.Add(new int[] {4,5});
        System.out.println("=====");
        PrintArray(arr);



    }
    public static void PrintArray(ArrayList array)
    {
        for(int i = 0; i < array.Count; i++)
        {
            System.out.println(array.Get(i));
        }

    }
}