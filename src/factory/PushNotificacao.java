package factory;

public class PushNotificacao implements Notificacao{

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando a mensagem por Push: " + mensagem);
    }
}
