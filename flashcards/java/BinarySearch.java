public class BinarySearch {
    public static void main(String[] args){
        int a[] = {7,8,9,10,11,12,13,14,15,16,17,19,20,21};
        int key = 18;
        System.out.print(algorritmo(a, key));
    }

    public static boolean algorritmo(int vec[], int key){
        int mid, lef, hig;
        lef = 0;
        hig = vec.length -  1;

        while(lef <= hig){
            mid = (lef + hig) / 2;
            if(vec[mid] == key)
                return true;
            else{
                if(vec[mid] > key){
                    hig = mid-1;
                }
                else{
                    lef = mid+1;
                }
            }
        }
        return false;
    }
}
