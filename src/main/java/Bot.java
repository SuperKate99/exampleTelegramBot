import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;

public class Bot extends TelegramLongPollingBot {


    public void onUpdateReceived(Update update) {  //метод для приема сообщений (получение обновлений через LongPoll)
    }

    public String getBotUsername() { return "MyTestVebinarBot"; } //метод,чтобы мы могли вернуть имя бота,указанного при регистрации

    public String getBotToken() { return "1085100804:AAE5PkXwMtM4I7g7IZJ7MF4eFDZ8zEJ1Yg4";}
}

