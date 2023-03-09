public class BubbleSort {
    public static void main(String[] args){
        int a[] = {15,5,1,54,87,645,54,1,2,5,1541,5,1,5,1,5151,1,51,15,4,5,9,3,7,74,15};
        for(int i=0; i<a.length; i++)
            System.out.printf("%d ", a[i]);
        System.out.println();
        a = algorritmo(a);
        for(int i=0; i<a.length; i++)
            System.out.printf("%d ", a[i]);

    }

    public static int[] algorritmo(int vec[]){
        for(int i = vec.length-1; i >= 0; i--){
            for(int j=0; j<i;j++ ){
                if(vec[j] > vec[j+1]){
                    int temp = vec[j];
                    vec[j] = vec[j+1];
                    vec[j+1] = temp;
                }
            }
        }
        return vec;
    }

}
