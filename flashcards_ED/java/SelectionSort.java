public class SelectionSort {
    public static void main(String[] args){
        int a[] = {5,6,5,6,2,1,7,9,5,4,55,8,14,56,8,9,1,8,1,7,92,78,78,57,5,1,2,1,4,9,8};
        for(int i=0; i<a.length; i++)
            System.out.printf("%d ", a[i]);

        System.out.println();

        a = algorritmo(a);
        for(int i=0; i<a.length; i++)
            System.out.printf("%d ", a[i]);
    }

    public static int[] algorritmo(int vec[]){
        for(int i=0; i<vec.length; i++){
            int menor = vec[i], ind = i;
            for(int j= i+1; j<vec.length; j++){
                if(vec[j] < menor){
                    menor = vec[j];
                    ind = j;
                }
            }
            int temp = vec[i];
            vec[i] = vec[ind];
            vec[ind] = temp;
        }

        return vec;
    }
}
