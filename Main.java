class Main {
  public static void main(String[] args) {
    
    Pessoa pessoa = new Pessoa("danilo" , "5265364" , 2005 , 1.78);
    
    System.out.println("seu nome é: " + pessoa.getNome());
    System.out.println("seu cpf é: " + pessoa.getCpf());
    System.out.println("seu ano de nscimento foi em: " + pessoa.getAnoDeNascimento());
    System.out.println("Sua idade é: " + pessoa.setidade(2021));
  }
}