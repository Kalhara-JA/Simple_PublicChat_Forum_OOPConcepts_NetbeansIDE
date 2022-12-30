/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicchat;

import java.util.ArrayList;

/**
 *
 * @author Kalhara
 */
public class ChatController {
    private final ArrayList<ChatObserver>chatList=new ArrayList<>();
    
    public void addChatObserver(ChatObserver chatObserver){
        chatList.add(chatObserver);
    }
    public void removeChatObserver(ChatObserver chatObserver){
        chatList.remove(chatObserver);
    }
    public void setMessage(String message){
        notifyObservers(message);
    }

    private void notifyObservers(String message) {
        for (ChatObserver chatObserver : chatList) {
            chatObserver.sendMessage(message);
        }
    }
    
}
