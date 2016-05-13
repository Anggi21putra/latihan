import java.util.Scanner;
public class ujian2{
	public static void main(String[]args){
	Scanner input=new Scanner(System.in);
	String nama;
	int absensi;
	int tugas,uts,uas,total1,total2,total3,total4,total;
	System.out.print("masukan nama anda = ");
	nama= input.nextLine();
	System.out.print("masukan banyaknya absensi = ");
	absensi= input.nextInt();
	System.out.print("masukan nilai tugas= ");
	tugas= input.nextInt();
	System.out.print("masukan nilai uts= ");
	uts= input.nextInt();
	System.out.print("masukan nilai uas= ");
	uas= input.nextInt();
	
	total1=(absensi/18)*10;
	total2=(tugas*20)/100;
	total3=(uts*30)/100;
	total4=(tugas*40)/100;
	
	total=total1+total2+total3+total4;
	
	System.out.println("nama = "+nama);
	System.out.println("kehadiran = "+absensi);
	System.out.println("total = "+total);
	
	
	if (total >=80){
		System.out.println("Selamat anda lulus dengan grade anda A");		
		}
	else if (total >=70){
		System.out.println("Selamat anda lulus dengan grade anda B");
	}
	else if (total >=60){
		System.out.println("Selamat anda lulus dengan grade anda C");
	}
	else if (total >=55){
		System.out.println("Selamat anda lulus dengan grade anda D");
	}
	else 
	{
		System.out.println("maaf anda tidak lulus grade anda E");	
	}
	}
}