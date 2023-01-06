class Pessoa {
  private String nome;
  private String cpf;
  private int anoDeNascimento;
  private double altura;
      


  public Pessoa( String nome , String cpf , int anoDeNascimento , double altura  ){
    
    this.nome = nome;
    
    this.cpf = cpf;
    
    this.anoDeNascimento = anoDeNascimento;
    
    this.altura = altura;
    
    
  }
  
  public String getNome(){
    return nome;
    
  }

  public void setNome( String nome){
    this.nome = nome;
    
  }
  
  public String getCpf(){
    return cpf;
    
  }
  
  public void setCpf( String cpf){
    this.cpf = cpf;
    
  }
  
  public int getAnoDeNascimento(){
    return anoDeNascimento;
    
  } 
  
  public void setAnoDeNascimento( int anoDeNascimento ){
    this.anoDeNascimento = anoDeNascimento;
    
  }  
  
  
  public double getAltura(){
    return altura;
    
  }  

  public void setAltura( double altura){
    this.altura = altura;
    
  }
  
  public int setidade( int ano){
    return ano - anoDeNascimento;
    
    
    //não consegui formatar a data:
    
    /*Date hoje = new Date(); //pegar a data de hoje- Date
    
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    formato.format(hoje);// formatar a data de hoje 
    
    
    
    // inputar a data de dataDeNascimento
    
    Date nascimento = new Date( dataDeNascimento ); //pegar a data de hoje- Date
    SimpleDateFormat formato2 = new SimpleDateFormat("dd/MM/yyyy");
    formato2.format(nascimento);
    
    // comparar as datas para obter a idade
    
      int idade = nascimento.compareTo(hoje);
    
    return idade;*/
    
  }
}
    