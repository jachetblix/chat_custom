package com.egorovnaumenko.chat.client.app;

import com.egorovnaumenko.chat.client.controllers.ChatController;
import com.egorovnaumenko.chat.client.views.ChatView;

public class ClientApp {
    public static void main(String[] args) {
        ChatView chatView = new ChatView();
        ChatController chatController = new ChatController(chatView);
        chatView.createUI("1");
    }
}
