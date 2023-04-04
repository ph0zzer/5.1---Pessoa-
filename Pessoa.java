class Pessoa{

  private String nome;
  private int idade;
  private String sexo;
  private float altura;
  private float peso;

  public String getNome() {
		return nome;
	}
  
	public void setNome(String nome) {
		this.nome = nome;
	}

  public int getIdade(){
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public String getSexo() {
		return sexo;
	}
  
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

  public float getAltura(){
    return altura;
  }

  public void setAltura(float altura) {
    this.altura = altura;
  }

  public float getPeso(){
    return peso;
  }

  public void setPeso(float peso) {
    this.peso = peso;
  }

  public void Mostrar(){
      System.out.println(this.nome + " - "+ this.idade + " Anos -  "+ this.sexo + " - "+this.altura + " cm - "+this.peso + " KG");
    }

  
}