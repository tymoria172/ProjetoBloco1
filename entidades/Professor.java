package entidades;

public class Professor extends Usuario {//Heran�a com a classe m�e Usuario
	
	private String especializacao;//atributos da classe professor

	public Professor(){//construtor generico
	}
	//Construtor da classe Professor
	public Professor(String nome, String nomeInstituicao, String especializacao) {
		super(nome, nomeInstituicao);//Construtor do Usuario
		this.especializacao = especializacao;
	}
	//Demais metodos da classe Professor
	public String getEspecializacao() {
		return especializacao;
	}

	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}
	// Metodo agradecer
	@Override
	public void agradecer(){
		System.out.println("Obrigado " + getNome() + "! por utilizar o nosso sitema para ajudar seus alunos da instituicao " + getNomeInstituicao());
	}

}
