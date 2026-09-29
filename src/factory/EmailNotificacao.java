package factory;

public class EmailNotificacao implements Notificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando notificação por e-mail: " + mensagem);
    }
}
