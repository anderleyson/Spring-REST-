package services;

import models.Cliente;
import notification.Notificador;
import notification.NotificadorEmail;

public class AtivacaoClienteService {
    
    private Notificador notificador;

    public AtivacaoClienteService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void ativar(Cliente cliente) {
        cliente.ativar();
       
        notificador.notificar(cliente, "Sua mãe dá o bumbum pro pedreiro\n");   
    }

}
