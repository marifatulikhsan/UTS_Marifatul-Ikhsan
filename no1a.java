package utsno1;
public class no1a {
    public static void main(String[] args){
        int[] data = {3,10,42,8,13};
        for (int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
        for (int i=0; i<data.length-1; i++){
            int indeksKecil = i;
            for (int j=i+1; j<data.length; j++){
                if (data[j]<data[indeksKecil]){
                    indeksKecil = j;
                }
            }
            int temp = data[i];
            data[i] = data[indeksKecil];
            data[indeksKecil] = temp;
        }
        System.out.println("\n");
        System.out.println("*** Selection Sort ***");
        for (int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
        System.out.println("\n");
        System.out.println("Marifatul Ikhsan");
    }
    
}
