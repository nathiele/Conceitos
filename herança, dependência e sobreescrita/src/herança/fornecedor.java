package heran�a;

import javax.swing.JOptionPane;

public class fornecedor extends pessoa {
	private String cnpj;
	private String ie;
	private String contato;

	public fornecedor() {}
	
	public String getcnpj() {
		return cnpj;
	}
	public String getie() {
		return ie;
	}
	public String getcontato() {
		return contato;
	}
	public void inserirDadosFuncionario() {
		this.cnpj = JOptionPane.showInputDialog("Digite aqui o cnpj: ");
		this.ie =JOptionPane.showInputDialog("Digite aqui o ie: ");
		this.contato =JOptionPane.showInputDialog("Digite aqui o contato: ");
		this.codigo =Integer.parseInt(JOptionPane.showInputDialog("Digite aqui seu c�digo: "));
		this.nome =JOptionPane.showInputDialog("Digite seu nome: ");
		this.endereco =JOptionPane.showInputDialog("Digite seu endere�o: ");
		this.bairro =JOptionPane.showInputDialog("Digite seu bairro: ");
		this.cidade =JOptionPane.showInputDialog("Digite sua cidade: ");
		this.uf =JOptionPane.showInputDialog("Digite seu uf: ");
		this.telefone =JOptionPane.showInputDialog("Digite seu telefone: ");
		this.celular =JOptionPane.showInputDialog("Digite seu celular: ");
}
	public void apresentarCliente () {
		JOptionPane.showMessageDialog(null, "CNPJ: "+this.cnpj);
		JOptionPane.showMessageDialog(null, "IE: "+this.ie);
		JOptionPane.showMessageDialog(null, "Contato: "+this.contato);
		JOptionPane.showMessageDialog(null, "C�digo: "+this.codigo);
		JOptionPane.showMessageDialog(null, "Nome: "+this.nome);
		JOptionPane.showMessageDialog(null, "Endere�o: "+this.endereco);
		JOptionPane.showMessageDialog(null, "Bairro: "+this.bairro);
		JOptionPane.showMessageDialog(null, "Cidade: "+this.cidade);
		JOptionPane.showMessageDialog(null, "UF: "+this.uf);
		JOptionPane.showMessageDialog(null, "Telefone: "+this.telefone);
		JOptionPane.showMessageDialog(null, "Celular: "+this.celular);
	}
 }
