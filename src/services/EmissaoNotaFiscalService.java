package services;

import models.Cliente;
import models.Produto;
import notification.Notificador;

public class EmissaoNotaFiscalService {
    
    private Notificador notificador;

    public EmissaoNotaFiscalService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void emitir(Cliente cliente, Produto produto) {
        //TODO emitir nota fiscal aqui

        notificador.notificar(cliente, "Nota fiscal do produto " + produto.getNome() + " foi emitida!");
    }

}
