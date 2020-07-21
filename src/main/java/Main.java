import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiRequestException;

public class Main {
    public static void main(String[] args) { //создание метода main//
        ApiContextInitializer.init();        //инициализируем апи
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try { //регистрация бота//
            telegramBotsApi.registerBot(new Bot());
        } catch (TelegramApiRequestException e) {
            e.printStackTrace();
        }
    }
}
