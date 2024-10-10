import java.awt.*;
import java.awt.event.*;

class LoginFrame extends MyFrame implements ActionListener{
        TextField  username,password;
    Label Username,Password;
    Button signup;




LoginFrame(){
    super("Login Frame ");
    Label loginmess = new Label("Login your Account ");
  
    
    username = new TextField(30);
    password = new TextField(30);

    add(username);
    add(password);



    Username = new Label("Username :");
    Password = new Label("Password :");

    add(Username);
    add(Password);
    add(loginmess);
    loginmess.setBounds(160,190,220,30);
    loginmess.setForeground(Color.blue);

    loginmess.setFont(new Font("Arail",Font.PLAIN,22));




    username.setBounds(230,250,180,30);
    password.setBounds(230,300,180,30);


    username.setForeground(Color.blue);
    password.setForeground(Color.blue);



    Username.setBounds(100,250,180,30);
    Password.setBounds(100,300,180,30);



    username.setFont(new Font("Arail",Font.BOLD,19));
    password.setFont(new Font("Arail",Font.BOLD,19));





    Username.setFont(new Font("Arail",Font.BOLD,16));
    Password.setFont(new Font("Arail",Font.BOLD,16));

signup = new Button("Login");
signup.setBackground(Color.blue);
signup.setForeground(Color.white);
  signup.setFont(new Font("Arail",Font.BOLD,16));
Label mess = new Label("Don't hava an Account ? ");
Label loginMess = new Label("SignUp");
loginMess.setForeground(Color.blue);

add(signup);
add(mess);
add(loginMess);

 signup.setBounds(100,350,110,30);
  mess.setBounds(220,360,155,16);
   loginMess.setBounds(375,350,190,30);
     loginMess.setFont(new Font("Arail",Font.BOLD,16));







       signup.addActionListener(new  ActionListener(){
public void actionPerformed(ActionEvent e)
{


 
     String s1=username.getText();
     String s2=password.getText();
     System.out.println(s1+s2);
     

  System.out.println("btn clicked !");
}
     });



     loginMess.addMouseListener(new MouseAdapter(){

       public void mouseClicked(MouseEvent e)

      {
        dispose();
        new RegisFrame();
        System.out.println("label clickeed");
        
        
      
      }
     
     });
     
     



}





public void actionPerformed(ActionEvent e)
{
  
   

}



}