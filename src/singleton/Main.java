package singleton;

import factory.Notificacao;
import factory.NotificacaoFactory;

public class Main{

    public static void main(String[] args) {

        NotificacaoFactory factory = new NotificacaoFactory();

        Notificacao notificacao =
                factory.criarNotificacao("email");

        notificacao.enviar("Seu pedido foi enviado!");
    }
}