public class bai2{
       public static void merge(int[] n1, int m, int[] n2, int n) {
        //Tham số	Ý nghĩa
//n1	Mảng chính, có chỗ trống để chèn
//m	Số phần tử đang có trong n1
//n2	Mảng chứa các phần tử cần thêm
//n	Số phần tử của n2
        for ( int  ai : n2){
            //Lấy lần lượt từng phần tử trong n2 và gán vào ai.
            chenptuvaomang(ai,n1,m);
            //Lấy ai chèn vào mảng n1, trong đó hiện tại có m phần tử.
            m++;
        }
    }
    private static void chenptuvaomang(int x, int[] a, int m) {
        //Chèn x vào mảng a sao cho mảng vẫn tăng dần.
        //x	Phần tử cần chèn
        //a	Mảng cần chèn
        //m	Số phần tử hiện đang có
        boolean timthay = false;
        for ( int k =0; k < m; k++){
            
            if ( a[k] > x ){
                timthay = true;
            for ( int i = m-1; i >= k; i--){
                a[i+1] = a[i];
            }
            a[k] = x;
                break; // thoát khỏi vòng for 
            }
        }
        if(timthay == false){
            a[m] = x;
        }
    }

    public static void main(String[] args){
        int[] n1 = {2,3,4,5,0,0,0};
        int[] n2 = {3,0,6};
        merge(n1, 4, n2, 5);
        System.out.println("DONE");
    }
}