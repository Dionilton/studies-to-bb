public class InsertionSort {
    public static void main(String[] args){
        int a[] = {5,1,4,8,18,1,8,1,8,8441,45,11,4,7,6,987,41,7,1,6,4,95,9,164};
        for(int i=0; i<a.length; i++)
            System.out.printf("%d ", a[i]);
        System.out.println();
        a = algorritmo(a);
        for(int i=0; i<a.length; i++)
            System.out.printf("%d ", a[i]);
    }

    public static int[] algorritmo(int vec[]){

        for (int i=1; i< vec.length; i++){
            int key =  vec[i];
            int j = i-1;
            while(j >=0 && vec[j] > key){
                vec[j+1] = vec[j];
                j--;
            }
            vec[j+1] = key;

        }

        return vec;
    }
}
