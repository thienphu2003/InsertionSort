public class InsertionSort {
    public InsertionSort(){};
    public int[] insertionSort(int[] array)
    {
        for(int i = 1 ;i<array.length;i++)
        {
            int x =array[i];
            int pos = i;
            while(pos>0 && x<array[i-1])
            {
                array[pos]=array[pos-1];
                pos--;
            }
            array[pos] =x;
        }
        return array;
    }
}
