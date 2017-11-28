                                //PROJECT CHATAPP
//--------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------
package chatapp;

import com.sun.xml.internal.ws.resources.SenderMessages;
import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import org.omg.PortableInterceptor.USER_EXCEPTION;

public class Server extends JFrame 
{
    private JTextField userText;
    private JTextArea chatWindow;
    private ObjectOutputStream output;
    private ObjectInputStream input;
    private ServerSocket server;
    private Socket connection;
    
    //CONSTRUCTOR---------------------------
    public Server()
    {
      super("DEEP's Messanger");
      userText=new JTextField();
      userText.setEditable(false);
      userText.addActionListener(
                            
                           new ActionListener()
                           {
                             public void actionPerformed(ActionEvent event)
                             {
                                 sendMessage(event.getActionCommand());
                                 userText.setText("");
                             }                                                       
                           }
                                 );
      add(userText,BorderLayout.NORTH);
      chatWindow=new JTextArea();
      add(new JScrollPane(chatWindow));
      setSize(300, 150);
      setVisible(true);     
    }
    
    //SET up and Run the server---------------
      public void startRunning()
     {
      try{
           server=new ServerSocket(6789,100); 
         while(true)
         {         
           try { waitForConnection();
                setupStream();
                whileChatting();                
               } 
           catch (Exception eofException) 
                { showMessage("\n Server ended the connection!");
                }
           finally{ closeCrap();
                 }
          }
        } 
           catch(
                   IOException IOException)
            {
               IOException.printStackTrace();               
            }  
      }
     
    
      //wait for connection, then display connection information--------
        private void waitForConnection() throws IOException
        {
          showMessage("Waiting for someone to connect...\n");
           connection =server.accept();
          showMessage("Now connected to "+connection.getInetAddress().getHostName());                   
        }    
      
        //get stream to send and receive data----------------
          private void setupStream() throws IOException
          {
            output=new ObjectOutputStream(connection.getOutputStream());
            output.flush();
            input=new ObjectInputStream(connection.getInputStream());          
            showMessage("\nStreams are now setup!\n");           
          }       
          
        //durig the chat conversation-----------
          private void whileChatting() throws IOException
          {
             String message ="You are now connected!";
             sendMessage(message);
             ableToType(true);
             
              do{
                  try {
                       message=(String)input.readObject();
                      showMessage("\n"+message);
                      } catch (ClassNotFoundException classNotFoundException) {
                        showMessage("\n idk what that user send!");                  
                         }
                }while(!message.equals("CLIENT"));
          }       
          
           //close streams and sockets after chatting
             private void closeCrap()
             {
               showMessage("\n Closing connections...\n");
               ableToType(false);
                 try {
                      output.close();
                      input.close();
                      connection.close();
                 } catch (IOException iOException) {
                    iOException.printStackTrace();             
                 }
             }
             
            //send a message to client 
             private void sendMessage(String message)  
             {
                 try {
                      output.writeObject("SERVER - " + message);
                      output.flush();
                      showMessage("\nSERVER - " + message);
                     
                 } catch (IOException iOException) {
                    chatWindow.append("\n ERROR: I CANT SEND THAT MESSAGE");
                 }             
             }    
             
           //update chatwindow 
            private void showMessage(final String text) 
            {
               SwingUtilities.invokeLater(
                  new Runnable()
                  {
                    public void run()
                    {
                      chatWindow.append(text);                    
                    }                  
                  }     
               );
            }

           //let the user type stuff into their box
             private void ableToType(final boolean tof)
              {
                SwingUtilities.invokeLater(
                   new Runnable()
                   {
                     public void run()
                      {
                        userText.setEditable(tof);
                      }                                    
                   }    
                                         );                          
              }       

        
    public static void main(String[] args) 
    {
       new Server(); 
    }
}
