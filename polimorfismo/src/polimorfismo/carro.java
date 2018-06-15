package polimorfismo;

public class carro {

	public static void main(String[] args) {
		public interface Carro
		{
		public void acelerar();
		}
		public Ferrari implements Carro
		{
		public void acelerar()
		{
		System.out.println("Ferrari acelerando...");
		}
		}
		public Fusca implemets Carro
		{
		public void acelerar()
		{
		System.out.println("Fusca tentando acelerar...");
		}
		}
		Carro c = new Ferrari();
		c.acelerar();
		c = new Fusca();
		c.acelerar();

	}

}
