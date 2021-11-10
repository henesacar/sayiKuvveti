import java.util.Scanner;
public class Usler {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int i=1,j=1,k,l;
        System.out.print("Taban sayısını girin: ");
        int data =scn.nextInt();
        System.out.print("Üs sayısını girin: ");
        int data2 = scn.nextInt();
        for(i = 1;i<=data2;i++){
            j*=data;
        }
        System.out.print(data+ " sayısının " +data2+". kuvveti: " +j);
    }
}
