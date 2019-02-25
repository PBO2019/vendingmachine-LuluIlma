import java.util.Scanner;
import java.util.ArrayList;

public class KedaiKopi{
	public static void main (String[] args){
		
		ArrayList<String> kopi= new ArrayList<String>();
		ArrayList<String> topping= new ArrayList<String>();

        MesinKopi robusta = new MesinKopi();
        robusta.setJenisKopi("Robusta");
        robusta.setJumlahStokKopi(40);
        kopi.add(robusta.getJenisKopi());
		robusta.setTopping("cream");
		topping.add(robusta.getTopping());
		
	for(int i=0; i< kopi.size();i++){
         int j= i+1;
		 System.out.println("Menu kopi adalah "+j+" "+kopi.get(i));
    }

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Masukan kopi yang mau dipilih ");
        int pilihanKopi = keyboard.nextInt() -1;
		

		
		MesinKopi Flores = new MesinKopi();
        robusta.setJenisKopi("Flores");
        robusta.setJumlahStokKopi(40);
        kopi.add(robusta.getJenisKopi());
		robusta.setTopping("gula");
		topping.add(robusta.getTopping());
		
		
		MesinKopi Arabica = new MesinKopi();
        robusta.setJenisKopi("Arabica");
        robusta.setJumlahStokKopi(40);
        kopi.add(robusta.getJenisKopi());
		robusta.setTopping("susu");
		topping.add(robusta.getTopping());
		
		for(int i=0; i< topping.size();i++){
            int j= i+1;
            System.out.println("Menu kopi adalah "+j+" "+topping.get(i));
           System.out.println("Masukan Topping yang mau dipilih ");
           int pilihanTopping = keyboard.nextInt() -1;
		   System.out.println("pesanan anda adalah kopi"+ " "+kopi.get(pilihanKopi) +" "+" Dengan Topping"+" "+topping.get(pilihanTopping));
		


	    }
	}
}