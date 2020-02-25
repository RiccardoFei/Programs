/*
 * Riccardo Fei 
 */
package strickeball_client;

import java.util.ArrayList;

public class StrickeBall_Client {

    public static void main(String[] args) throws InterruptedException {
        
        ArrayList<Connection> clients = new ArrayList<Connection>();
      
        for(int i=1;i<10;i++){
            
            Connection conn = new Connection();
        clients.add(conn);
        }
        for(int i=1;i<10;i++){
            
            Connection c = clients.get(i);
            c.connectionClient();
            System.out.println("Client n° " + i + " connesso");
            Thread.sleep(5000);
        }
        
       
    }
    
}
