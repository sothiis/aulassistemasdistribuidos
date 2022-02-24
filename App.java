
import data.GerenciaClientes;

public class App {
    public static void main(String[] args) {
     GerenciaClientes clientes = new GerenciaClientes();
      clientes.cadastrar("Paxx", 10, 500);

      System.out.println(clientes.consulta("Paxx"));
      System.out.println(clientes.consulta("Bellinha"));


    }
}
