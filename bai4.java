public class bai4{

    public static void merge(int[] n1, int m, int[] n2, int n){
        //n1: mảng thứ nhất
        //m: số phần tử thực sự có dữ liệu trong n1
        //n2: mảng thứ hai
        //n: số phần tử của n2

        int i =m -1; //i dùng để trỏ vào phần tử cuối cùng đang có dữ liệu của n1.
        int j = n -1; //j dùng để trỏ vào phần tử cuối cùng của n2.
        int k = ( m + n )-1; //k là vị trí mà chúng ta sẽ đặt phần tử lớn nhất tiếp theo vào n1.

        while(k>=0){
            if(j<0){
                n1[k] = n1[i];
                i--;
            } else if(i<0){
                n1[k] = n2[j];
                j--;
            } else if(n1[i] > n2[j]){
                n1[k] = n1[i];
                i--;
            } else {
                n1[k] = n2[j];
                j--;
            }
            k--;
        }
    }
    public static void main(String[] args){
        int[] n1 = {1,2,3,0,0,0};
        int[] n2 = {2,5,6};

        merge(n1,3,n2,3);
        System.out.println("DONE");
    }
}
