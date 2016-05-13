//latihan  3, Logika Switch

import java.io.*;
class switch1{
public static void main(String args[]){

BufferedReader input = new BufferedReader
(new InputStreamReader(System.in));

String angkaString = "";
Byte angka = 0;

System.out.print("Masukkan angka : ");
try{
angkaString = input.readLine();
}
catch(IOException e){
System.out.print("salah");
}

angka = new Byte (angkaString);
switch(angka){
case 0: System.out.print("nol");
break;
case 1: System.out.print("satu");
break;
case 2: System.out.print("dua");
break;
default: System.out.print("tidak ada");
}
}}