package uz.example;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class MainApplication {
    public static void main(String[] args) {
        System.out.println("go");

        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(new ExampleBot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

    }
}
