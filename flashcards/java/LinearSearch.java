public class LinearSearch {
    public static void main(String[] args){
        int a[] = {21,22,23,27,29,75,135};
        int chave = 30;
        System.out.println(linearSearch(a, chave));
    }

    public static boolean linearSearch(int vec[], int key){
        for(int i=0; i< vec.length; i++){
            if(vec[i] == key)
                return true;
        }
        return false;
    }
}

