public class Algorritmo {
    public static void main(String[] args){
        int a[] = {21,22,23,27,29,75,135};
        int chave = 30;
        System.out.println(algorritmo(a, chave));
    }

    public static boolean algorritmo(int vec[], int key){
        for(int i=0; i< vec.length; i++){
            if(vec[i] == key)
                return true;
        }
        return false;
    }
}

