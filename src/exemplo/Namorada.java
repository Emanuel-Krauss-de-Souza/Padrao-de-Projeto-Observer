package exemplo;

public class Namorada implements ChegadaAniversarianteObserver{

	@Override
	public void chegou(ChegadaAniversarianteEvent event) {
		System.out.println("Apaguem as luzes...");
		System.out.println("SHiiiuu!!");
		System.out.println("Não façam barulho...");
		System.out.println("SURPRESAA!!!");
	}
}
