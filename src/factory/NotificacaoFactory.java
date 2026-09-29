package factory;
import java.util.Map;
import java.util.HashMap;
import java.util.function.Supplier;

public class NotificacaoFactory {

    private final Map<String, Supplier<Notificacao>> notificacoes;

    public NotificacaoFactory() {
        notificacoes = new HashMap<>();

        notificacoes.put("email", EmailNotificacao::new);
        notificacoes.put("sms", SMSNotificacao::new);
        notificacoes.put("push", PushNotificacao::new);
    }

    public Notificacao criarNotificacao(String tipo) {
        return notificacoes.get(tipo).get();
    }
}