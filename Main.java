class Main {
  public static void main(String[] args) {

    Pessoa P1 = new Pessoa();
    
    Pessoa P2 = new Pessoa();

    Pessoa P3 = new Pessoa();

    P1.setNome("Gabriel");
    P2.setNome("Mariana");
    P3.setNome("Hope");

    P1.setIdade(20);
    P2.setIdade(35);
    P3.setIdade(2);

    P1.setSexo("Masculino");
    P2.setSexo("Feminino");
    P3.setSexo("Feminino");

    P1.setAltura(180);
    P2.setAltura(160);
    P3.setAltura(50);

    P1.setPeso(90);
    P2.setPeso(60);
    P3.setPeso(5);

    P1.Mostrar();
    P2.Mostrar();
    P3.Mostrar();

  }
}