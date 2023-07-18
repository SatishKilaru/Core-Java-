import java.net.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
 
public class Client extends Frame implements ActionListener, Runnable {
 
    Socket socket;
    Panel topControlsP, bottomControlsP;
    List chatsL;
    TextField ipTF, portTF, messageTF;
    Button connectB, sendB, exitB;
    BufferedReader bufferedReader;
    BufferedWriter bufferedWriter;
    Thread th;
 
    public Client(String str) {
        super(str);
        //creating controls objects
        topControlsP = new Panel();
        ipTF = new TextField(15);
        portTF = new TextField(5);
        connectB = new Button("Connect");
        chatsL = new List();
        bottomControlsP = new Panel();
        messageTF = new TextField(20);
        sendB = new Button("Send");
        exitB = new Button("Exit");
        //adding controls to Panel
        topControlsP.add(ipTF);
        topControlsP.add(portTF);
        topControlsP.add(connectB);
        //adding controls to Panel
        bottomControlsP.add(messageTF);
        bottomControlsP.add(sendB);
        bottomControlsP.add(exitB);
        //adding to controls and panel to Frame
        add(topControlsP, BorderLayout.NORTH);
        add(chatsL, BorderLayout.CENTER);
        add(bottomControlsP, BorderLayout.SOUTH);
        //adding listeners on Connect, Send and Exit Button        
        connectB.addActionListener(this);
        sendB.addActionListener(this);
        exitB.addActionListener(this);
 
        setSize(300, 300);//setting size of frame/window
        setLocation(300, 0);//setting location of frame/window on the screen
        setBackground(Color.MAGENTA);//setting background for frame/window
        setVisible(true);//setting it to visible state       
    }
 
    public void actionPerformed(ActionEvent event) {
        if (event.getSource().equals(exitB)) {
            System.exit(0);
        } else if (event.getSource().equals(connectB)) {
            try {
                socket = new Socket(ipTF.getText(), Integer.parseInt(portTF.getText()));
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                ipTF.setText("Connected");
                th = new Thread(this);
                th.start();
            } catch (IOException ioe) {
                ipTF.setText(ioe.getMessage());
            }
        } else {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.write(messageTF.getText());
                    bufferedWriter.newLine();
                    bufferedWriter.flush();
                    chatsL.add("You: " + messageTF.getText());
                    messageTF.setText("");
                }
            } catch (IOException ioe) {
                ipTF.setText(ioe.getMessage());
            }
        }
    }
 
    public void run() {
        try {
            socket.setSoTimeout(1);
        } catch (Exception e) {
            ipTF.setText(e.getMessage());
        }
        while (true) {
            try {
                String message = bufferedReader.readLine();
                if(message == null) {
                    break;
                }
                chatsL.add("Server: " + message);
            } catch (Exception e) {
                
            }            
        }
    }
 
    public static void main(String[] ar) {
        new Client("Client Program");
    }
}