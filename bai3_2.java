public class bai3_2{
public static int removeElement(int[] a, int val) {
        int n = a.length;
        for(int i = 0; i < n; ){
            if(a[i] == val){
                for(int j = i; j <= (n - 2); j++){
                    a[j] = a[j + 1];
                }
                n--;
            }
            else{
                i++;
            }
        }
        return n;
    }

    public static int removeElement2(int[] a, int x) {
        int k =0;

        for(int i = 0; i < a.length; i++){
            if(a[i] != x){
                a[k] = a[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args){
        int[] a = {3,2,2,3};
        System.out.println(removeElement(a, 2));
        System.out.println(removeElemen2(a, 2));
        System.out.println("DONE");
    }
}