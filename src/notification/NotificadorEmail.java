package notification;

import models.Cliente;

public class NotificadorEmail {
    
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando %s através do email %s \nMensagem: %s ",
            cliente.getNome(), cliente.getEmail(), mensagem);
    }

}
