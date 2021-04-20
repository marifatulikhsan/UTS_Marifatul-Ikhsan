package utsno1;
public class no1c {
    public static void main(String args[]){
        int A[]= {3,10,4,2,8,13};
        int cari = 8;
        int ketemu = 0;
        System.out.println("Data yang sedang dicari");
        System.out.println("");
        for (int i = 0; i < A.length; i++) {
            if (A[i] == cari ) {
                ketemu = 1;
                System.out.print("8");
                break;
            }
        }
    }
}