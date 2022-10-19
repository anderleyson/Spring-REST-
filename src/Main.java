import models.Cliente;
import services.AtivacaoClienteService;

public class Main {
    
    public static void main(String[] args) {
        Cliente joao = new Cliente("João", "joaoxerapo@gmail.com", "11996683439");
        Cliente maria = new Cliente("Maria Geme Grosso", "maria.boquetin@gmail.com", "11996683439");

        AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService();
        ativacaoCliente.ativar(joao);
        ativacaoCliente.ativar(maria);
    }

}
