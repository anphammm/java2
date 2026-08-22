public class bai5{
       public static  int maximumWealth(int[][] a) {
        int sokhachhang = a.length;
        int songanhang = a[0].length;
        int [] tong =  new int[sokhachhang];

        for (int i = 0; i < sokhachhang; i++) {
            int tinhtonghang = 0;
            for (int j = 0; j < songanhang; j++) {
                tinhtonghang += a[i][j];
            }
            tong[i] = tinhtonghang;

    }
    int max = 0;
    for (int i = 0; i < sokhachhang; i++) {
        System.out.println("Tổng tài sản của khách hàng " + (i + 1) + " là: " + tong[i]);
        if (tong[i] > max) {
            max = tong[i];
        }
    }
    return max;
       }
    

        public static void main(String[] args){
           
            int[][] b = {{1, 5},{7,3},{3,5}};
          System.out.println( "Tài sản lớn nhất: " + maximumWealth(b) );
          
        }
    }
  //  public static void main(String[] args){
        //int [][] a = {{1,2,3},{3,2,1}};
        //int [][] b = new int[2][3];

       //int sohang = a.length;
       // int socot = a[0].length;
       // System.out.println("Số hàng: " + sohang);
       // System.out.println("Số cột: " + socot);

       // for (int i = 0; i < sohang; i++){
         //   for (int j = 0; j < socot; j++){
           //   System.out.print(a[i][j] + " ");
          //  }
          //  System.out.println();
      //  }
//}