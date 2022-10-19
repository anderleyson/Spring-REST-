package services;

import models.Cliente;
import notification.NotificadorEmail;

public class AtivacaoClienteService {
    
    public void ativar(Cliente cliente) {
        cliente.ativar();
        NotificadorEmail notificador = new NotificadorEmail();
        notificador.notificar(cliente, "Sua mãe dá o bumbum pro pedreiro\n");   
    }

}
