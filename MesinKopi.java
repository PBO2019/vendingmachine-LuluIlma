public class MesinKopi{
	private String JenisKopi;
	private String Topping;
	private int JumlahStokKopi=0;
	
	public void setJenisKopi(String JenisKopi){
		this.JenisKopi=JenisKopi;
	}
	public String getJenisKopi(){
		return JenisKopi;
	}
	public void setJumlahStokKopi( int jumlah){
		this.JumlahStokKopi=JumlahStokKopi;
	}
	public int getJumlahStokKopi(){
		return JumlahStokKopi;
	}
	public void setTopping( String Topping){
		this.Topping=Topping;
	}
	public String getTopping(){
		return Topping;
	}
}