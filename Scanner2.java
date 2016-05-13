import java.util.Scanner;
class Scanner2{
public static void main(String args[]){
int Panjang,Lebar,Pilihan,Hasil,Waktu,Jarak;
int Luas=0;
Scanner save=new Scanner(System.in);
System.out.println("1.Menghitung Luas Persegi");
System.out.println("2.Menghitung Kecepatan");
System.out.println("3.Exit");
System.out.print("Masukkan Pilihan : ");
Pilihan=save.nextInt();
if(Pilihan==1){
System.out.print("Masukkan Panjang : ");
Panjang=save.nextInt();
System.out.print("Masukkan Lebar : ");
Lebar=save.nextInt();
Hasil=Panjang*Lebar;
System.out.print("Luas Persegi : "+Hasil);}
if(Pilihan==2){
System.out.print("Masukkan Jarak : ");
Jarak=save.nextInt();
System.out.print("Masukkan Waktu : ");
Waktu=save.nextInt();
Hasil=Jarak/Waktu;
System.out.print("Kecepatan : "+Hasil);
}
}
}