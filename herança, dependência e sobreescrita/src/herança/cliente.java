package herança;

import javax.swing.JOptionPane;

public class cliente extends pessoa {
	private double limiteCredito;
	private double rendaMensal ;
	private String rg ;
	private String cpf ;
	
	public cliente() {}
	
	public double getlimiteCredito() {
		return limiteCredito;
	}
	public double getrendaMensal() {
		return rendaMensal;
	}
	public String getrg() {
		return rg;
	}
	public String getcpf() {
		return cpf;
	}
	public void inserirDadosCliente() {
		this.limiteCredito =Double.parseDouble( JOptionPane.showInputDialog("Digite aqui o limite de crédito: "));
		this.rendaMensal =Double.parseDouble( JOptionPane.showInputDialog("Digite aqui a sua renda mensal: "));
		this.rg =JOptionPane.showInputDialog("Digite aqui seu RG: ");
		this.cpf =JOptionPane.showInputDialog("Digite aqui o seu CPF: ");
		this.codigo =Integer.parseInt(JOptionPane.showInputDialog("Digite aqui seu código: "));
		this.nome =JOptionPane.showInputDialog("Digite seu nome: ");
		this.endereco =JOptionPane.showInputDialog("Digite seu endereço: ");
		this.bairro =JOptionPane.showInputDialog("Digite seu bairro: ");
		this.cidade =JOptionPane.showInputDialog("Digite sua cidade: ");
		this.uf =JOptionPane.showInputDialog("Digite seu uf: ");
		this.telefone =JOptionPane.showInputDialog("Digite seu telefone: ");
		this.celular =JOptionPane.showInputDialog("Digite seu celular: ");
		
	}
	
	public void apresentarCliente () {
		JOptionPane.showMessageDialog(null, "Limite de Crédito: "+this.limiteCredito);
		JOptionPane.showMessageDialog(null, "Renda Mensal: "+this.rendaMensal);
		JOptionPane.showMessageDialog(null, "RG: "+this.rg);
		JOptionPane.showMessageDialog(null, "CPF: "+this.cpf);
		JOptionPane.showMessageDialog(null, "Código: "+this.codigo);
		JOptionPane.showMessageDialog(null, "Nome: "+this.nome);
		JOptionPane.showMessageDialog(null, "Endereço: "+this.endereco);
		JOptionPane.showMessageDialog(null, "Bairro: "+this.bairro);
		JOptionPane.showMessageDialog(null, "Cidade: "+this.cidade);
		JOptionPane.showMessageDialog(null, "UF: "+this.uf);
		JOptionPane.showMessageDialog(null, "Telefone: "+this.telefone);
		JOptionPane.showMessageDialog(null, "Celular: "+this.celular);
	}
	
	
}


