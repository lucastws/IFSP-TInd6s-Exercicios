package exemploassociacao;
import java.util.*;
 
class Cidade {
    private String cidadeNome;
  
    public String getCidadeNome() {
        return cidadeNome;
    }
  
    public void setCidadeNome(String cidadeNome) {
        this.cidadeNome = cidadeNome;
    }
    
    @Override
    public String toString() {
        return cidadeNome;
    }
}
 
class Estado {
    private String estadoNome;
     
    List<Cidade> cidades;
  
    public String getEstadoNome() {
        return estadoNome;
    }
  
    public void setEstadoNome(String estadoNome) {
        this.estadoNome = estadoNome;
    }
    public List<Cidade> getCidades() {
        return cidades;
    }
    public void setEstado(List<Cidade> cidades) {
        this.cidades = cidades;
    }
}
 
public class ExemploAssociacao {
      public static void main(String[] args) {
            Estado estado = new Estado();
            estado.setEstadoNome("São Paulo");
             
             
            Cidade cidade = new Cidade();
            cidade.setCidadeNome("Capivari");
            Cidade cidade2 = new Cidade();
            cidade2.setCidadeNome("Santa Bárbara d'Oeste");
             
            List<Cidade> lista = new ArrayList<Cidade>();
            lista.add(cidade);
            lista.add(cidade2);
 
            estado.setEstado(lista);
                
            System.out.println(estado.getCidades() + " são cidades do estado " + estado.getEstadoNome());
      }
}