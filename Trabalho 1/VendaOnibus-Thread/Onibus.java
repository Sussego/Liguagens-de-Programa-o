public class Onibus {
  private static Lugar[] lugares = new Lugar[20];
  
  public Onibus(){
    for(int i = 0 ; i < 20 ; i++){
      lugares[i] = new Lugar();
    }
  }
  
      public void ConsultarLugares(){
      for(int i = 0 ; i < 20 ; i++){
        //if(lugares[i].isOcupado() == false){
          System.out.println("Poltrona " + (i+1) + "\nOcupando:" + lugares[i].getDono() + "\n");
        //}
      }
    }
  
    public void comprarLugar(int i, String nome){
      System.out.println(nome + " quer comprar comrpar lugar:" + i);
      if(lugares[i-1].isOcupado()==false){
        lugares[i-1].setOcupado();
        lugares[i-1].setDono(nome);
        System.out.println(nome + " comprou poltrona: " + i);
      }else{
        System.out.println(nome + " tentou comprar lugar indisponivel!");
      }
    }
  }