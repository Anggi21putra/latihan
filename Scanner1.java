//Scanner Pada Java
//Perulangan

import java.util.Scanner;
public class Scanner1{
public static void main(String args[]){
String nama="";
Scanner simpan=new Scanner(System.in);
System.out.print("Masukkan nama : ");
nama=simpan.nextLine();
System.out.print("Nama anda : "+nama);
}
}