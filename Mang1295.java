public class Mang1295 {

    public int findNumbers(int[] nums) {
        int biendem = 0;

        for (int a : nums) {
            int soluongchuSo = tinhsochuSo(a);

            if (soluongchuSo % 2 == 0) {
                biendem++;
            }
        }

        return biendem;
    }

   private int tinhsochuSo(int a) {
        int biendem = 0;
        int kq = a; // Declare kq and initialize it with a's value


        while (kq != 0) {
            kq = kq / 10; // Fix: use kq instead of a for division
            biendem++;
        }

        return biendem;
    }

}