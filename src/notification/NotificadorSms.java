package notification;

import models.Cliente;

public class NotificadorSms implements Notificador{
    
    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando %s através do telefone %s \nMensagem: %s ",
            cliente.getNome(), cliente.getTelefone(), mensagem);
    }

}
