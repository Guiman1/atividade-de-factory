package factory;

public class SMSNotificacao implements Notificacao{

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando a mensagem por SMS: " + mensagem);
    }
}
