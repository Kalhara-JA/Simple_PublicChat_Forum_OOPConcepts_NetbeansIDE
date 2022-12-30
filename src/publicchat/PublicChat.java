/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicchat;

/**
 *
 * @author Kalhara
 */
public class PublicChat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ChatController chatController=new ChatController();
        chatController.addChatObserver(new ChatClientWindow("Danapala", chatController) );
        chatController.addChatObserver(new ChatClientWindow("Gunapala", chatController) );
    }
    
}
