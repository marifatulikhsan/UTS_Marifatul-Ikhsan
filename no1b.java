package utsno1;

import java.util.Scanner;

public class no1b {
    public static void binarySearch(int[] data, int key){
        int indexAwal = 0;
        int indexAkhir = data.length-1;
        int middle = 0;
        int found = 0;
        while((indexAwal<=indexAkhir) && (found == 0)){
            middle = (indexAwal+indexAkhir)/2;
            System.out.println("nilai tengah = "+middle);
            if (key == data[middle]){
                System.out.println("nilai "+key+", berada di indeks ke-"+middle);
                found = 1;
            }
            else{
                if (key < data[middle]){
                    System.out.println("<- kiri");
                    indexAkhir = middle-1;
                }
                else{
                    System.out.println("kanan ->");
                    indexAwal = middle+1;
                }
            }
        }
        if (found == 1){
            System.out.println("data telah ditemukan");
        }
        else{
            System.out.println("data tidak ditemukan");
        }
    }
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int[] nilai = {3,10,4,2,8,13};
        System.out.println("before");
        System.out.print(nilai);
        System.out.println("\nafter");
        System.out.print(nilai);
        
        System.out.println("\nmasukan data yang ingin di cari:");
        int key = input.nextInt();
        System.out.println("\n");
        System.out.println("Marifatul Ikhsan");
        
        binarySearch(nilai, key);
    }
    
}
