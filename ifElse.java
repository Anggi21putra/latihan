//Latihan 2, Logika if else
//dengan perintah input menggunakan
//Buffered Reader !

import java.io.*;
public class ifElse{
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

if(nilai >=80){
System.out.println("Selamat Anda Lulus, Anton bangga sama Kamu");
System.out.print("Dengan Nilai : ");
System.out.println(""+nilai+"!!!");
}
else{
System.out.println("Anda Tidak Lulus, coba lagi aja lah");
System.out.print("karena nilai anda : ");
System.out.println(""+nilai+"!!!");
}
}
}