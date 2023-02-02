public class InsertionSortTest {
    public static void main(String[] args) {
        int[] arr ={4,3,5,6,7,2,9,11};
        InsertionSort sortEngine = new InsertionSort();
        int[] sortedArr = sortEngine.insertionSort(arr);
        for(int i =0 ;i < sortedArr.length;i++)
        {
            System.out.println(sortedArr[i]);
        }
    }
}
