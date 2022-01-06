package uz.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class ExampleBot extends TelegramLongPollingBot {
    @Override
    public String getBotUsername() {
        return "Example Bot";
    }

    @Override
    public String getBotToken() {
        return "5034551629:AAEa_Oc44fZ7VSiK0QKb23puTXqzMe653VQ";
    }

    @Override
    public void onUpdateReceived(Update update) {

        Message message = update.getMessage();
        if (message != null && message.getText() != null) {
            if (message.getText().equals("/start")) {
                SendMessage sendMessage = new SendMessage();
                sendMessage.setText("ЗДРАВСТВУЙТЕ");
                sendMessage.setChatId(message.getChatId().toString());

                try {
                    execute(sendMessage);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
