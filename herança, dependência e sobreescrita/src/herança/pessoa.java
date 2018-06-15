package herança;

public class pessoa {
	protected int codigo;
	protected String nome;
	protected String endereco;
	protected String bairro;
	protected String cidade;
	protected String uf;
	protected String telefone;
	protected String celular;
	
	public pessoa() {}
	
	public int getcodigo() {
		return codigo;
	}
	public String getnome() {
		return nome;
	}
	public String getendereco() {
		return endereco;
	}
	public String getbairro() {
		return bairro;
	}
	public String getcidade() {
		return cidade;
	}
	public String getuf() {
		return uf;
	}
	public String gettelefone() {
		return telefone;
	}
	public String getcelular() {
		return celular;
	}
	
	public void mostrarTelefones() {
		System.out.println("Telefone da pessoa.,: "+this.telefone);
	}

}
