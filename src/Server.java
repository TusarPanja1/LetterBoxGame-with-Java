import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import javax.swing.JOptionPane;
//import MainGame;
public class Server {
        public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(7777);
        System.out.println("ServerSocket awaiting connections...");
        Socket socket = ss.accept();
        System.out.println("Connection from " + socket + "!");
        InputStream inputStream = socket.getInputStream();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        String message = (String)dataInputStream.readUTF();
        System.out.println("The message sent from the socket was: " + message);
        String guess[]=new String[5000];
        int score=0;
        String line="";
        String path="E:\\JavaNetbeans\\LetterBoxGame\\src\\Answers.txt";

        try{
            BufferedReader br=new BufferedReader(new FileReader(path));
            while((line=br.readLine())!=null)
            {
               guess= line.split(" ");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
            /*if(Arrays.asList(guess).contains(message))
            {
                OutputStream outputStream = socket.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.writeUTF("Found");
            dataOutputStream.flush();
                    dataOutputStream.close();
                    score++;
            }
            else
            {
             OutputStream outputStream = socket.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.writeUTF("None");
            dataOutputStream.flush();
                    dataOutputStream.close();
            }

        //dataOutputStream.close();
        if(score==5)
        {
        dataInputStream.close();
        ss.close();
        socket.close();
        }*/
            if(Arrays.asList(guess).contains(message))
            {
                OutputStream outputStream = socket.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.writeUTF("Found");
            dataOutputStream.flush();
                    dataOutputStream.close();
                    score++;
            }
            else
            {
             OutputStream outputStream = socket.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.writeUTF("None");
            dataOutputStream.flush();
                    dataOutputStream.close();
            }

        //dataOutputStream.close();
        dataInputStream.close();
        ss.close();
        socket.close();
    }
}
