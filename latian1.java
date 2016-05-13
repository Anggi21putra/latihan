//Test
//Latihan 2, Logika if else
//dengan perintah input menggunakan
//Buffered Reader !

import java.io.*;
public class latian1{
public static void main(String args[]){

//deklarasi buffered reader
BufferedReader simpan = new BufferedReader
(new InputStreamReader (System.in));

String nilaiString = "";
Byte nilai = 0;

System.out.print("Masukkan Nilai : ");
try{
nilaiString = simpan.readLine();
}
catch(IOException e){
System.out.println("Salah");
}

//konversi dari string ke byte
nilai = new Byte(nilaiString);

if(nilai >80){
System.out.println("Nilai anda A");
System.out.print("Dengan Nilai : ");
System.out.println(""+nilai+"!!!");
}
else if(nilai >70 ){
System.out.println("Nilai anda B");
System.out.print("Dengan Nilai : ");
System.out.println(""+nilai+"!!!");
}
else if(nilai >60 ){
System.out.println("Nilai anda C");
System.out.print("Dengan Nilai : ");
System.out.println(""+nilai+"!!!");
}
else if(nilai >55 ){
System.out.println("Nilai anda D");
System.out.print("Dengan Nilai : ");
System.out.println(""+nilai+"!!!");
}
else if(nilai >54 ){
System.out.println("Nilai anda E");
System.out.print("Dengan Nilai : ");
System.out.println(""+nilai+"!!!");
}
else if(nilai >53 ){
System.out.println("Anda Tidak Lulus");
System.out.print("Dengan Nilai : ");
System.out.println(""+nilai+"!!!");
}
}
}