package heran�a;

import javax.swing.JOptionPane;

public class funcionario extends pessoa {
	private double salarioBase ;
	private double salarioFinal ;
	
	public funcionario() {}
	
	public double getsalarioBase() {
		return salarioBase;
	}
	public double getsalarioFinal() {
		return salarioFinal;
	}

	public void inserirDadosFuncionario() {
		this.salarioBase =Double.parseDouble( JOptionPane.showInputDialog("Digite aqui o sal�rio base: "));
		this.salarioFinal =Double.parseDouble( JOptionPane.showInputDialog("Digite aqui o sal�rio final: "));
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
		JOptionPane.showMessageDialog(null, "Sal�rio Base: "+this.salarioBase);
		JOptionPane.showMessageDialog(null, "Sal�rio Final: "+this.salarioFinal);
		JOptionPane.showMessageDialog(null, "C�digo: "+this.codigo);
		JOptionPane.showMessageDialog(null, "Nome: "+this.nome);
		JOptionPane.showMessageDialog(null, "Endere�o: "+this.endereco);
		JOptionPane.showMessageDialog(null, "Bairro: "+this.bairro);
		JOptionPane.showMessageDialog(null, "Cidade: "+this.cidade);
		JOptionPane.showMessageDialog(null, "UF: "+this.uf);
		JOptionPane.showMessageDialog(null, "Telefone: "+this.telefone);
		JOptionPane.showMessageDialog(null, "Celular: "+this.celular);
	}
		@Override
	public void mostrarTelefones() {
		System.out.println("Telefone do Fornecedor: "+this.telefone);
	}
	}
