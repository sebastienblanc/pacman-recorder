package org.sebi;

import javax.enterprise.context.ApplicationScoped;
import javax.websocket.OnMessage;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/recorder")
@ApplicationScoped
public class PacmanRecorder {
    
    @OnMessage
    public void onMessage(String message) {
        if (message.equalsIgnoreCase("_ready_")) {
            //broadcast("User " + username + " joined");
        } else {
            System.out.println("RECEIVED : " + message);
        }
    }
}
