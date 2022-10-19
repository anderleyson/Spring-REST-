import models.Cliente;
import notification.Notificador;
import notification.NotificadorEmail;
import notification.NotificadorSms;
import services.AtivacaoClienteService;

public class Main {
    
    public static void main(String[] args) {
        Cliente joao = new Cliente("João", "joaoxerapo@gmail.com", "11996683439");
        Cliente maria = new Cliente("Maria Geme Grosso", "maria.boquetin@gmail.com", "11961670970");

        Notificador notificador = new NotificadorSms();

        AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService(notificador);
        ativacaoCliente.ativar(joao);
        ativacaoCliente.ativar(maria);
    }
        
}