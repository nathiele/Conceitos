package herança;

public class principal {

	public static void main(String[] args) {
		
		cliente cli = new cliente ();
			cli.inserirDadosCliente();
			cli.apresentarCliente();
			
		pessoa pessoa = new pessoa();
			pessoa.mostrarTelefones();
			
		funcionario func = new funcionario();
			func.inserirDadosFuncionario();
			func.apresentarCliente();
			func.mostrarTelefones();
			
		fornecedor forn = new fornecedor();
			forn.inserirDadosFuncionario();
			func.apresentarCliente();
		
	}

}
