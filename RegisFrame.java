import java.awt.*;
import java.awt.event.*;
class RegisFrame extends MyFrame implements ActionListener
{
    TextField  name, email,mob,username,password;
    Label Name,Email,Mob,Username,Password;
    Button signup,cancel;
    UserDB userdb = new UserDB();

RegisFrame(){
    super("Registration Frame ");
    name = new TextField(30);
    email = new TextField(30);
    mob = new TextField(10);
    username = new TextField(30);
    password = new TextField(30);
    add(name);
    add(email);
    add(mob);
    add(username);
    add(password);


    //all lebel of this frame 
    Name = new Label("Name :");
    Email = new Label("Email :");
    Mob = new Label("Mobile No. :");
    Username = new Label("Username :");
    Password = new Label("Password :");
    add(Name);
    add(Email);
    add(Mob);
    add(Username);
    add(Password);




    name.setBounds(230,100,180,30);
    email.setBounds(230,150,180,30);
    mob.setBounds(230,200,180,30);
    username.setBounds(230,250,180,30);
    password.setBounds(230,300,180,30);

    name.setForeground(Color.blue);
    email.setForeground(Color.blue);
    mob.setForeground(Color.blue);
    username.setForeground(Color.blue);
    password.setForeground(Color.blue);


    Name.setBounds(100,100,180,30);
    Email.setBounds(100,150,180,30);
    Mob.setBounds(100,200,180,30);
    Username.setBounds(100,250,180,30);
    Password.setBounds(100,300,180,30);

    name.setFont(new Font("Arail",Font.BOLD,19));
    email.setFont(new Font("Arail",Font.BOLD,19));
    mob.setFont(new Font("Arail",Font.BOLD,19));

    username.setFont(new Font("Arail",Font.BOLD,19));
    password.setFont(new Font("Arail",Font.BOLD,19));



    Name.setFont(new Font("Arail",Font.BOLD,16));
    Email.setFont(new Font("Arail",Font.BOLD,16));
    Mob.setFont(new Font("Arail",Font.BOLD,16));

    Username.setFont(new Font("Arail",Font.BOLD,16));
    Password.setFont(new Font("Arail",Font.BOLD,16));

signup = new Button("Sign Up");
signup.setBackground(Color.blue);
signup.setForeground(Color.white);
  signup.setFont(new Font("Arail",Font.BOLD,16));
Label mess = new Label("Hava an Account ? ");
Label loginMess = new Label("Login now");
loginMess.setForeground(Color.blue);

add(signup);
add(mess);
add(loginMess);

 signup.setBounds(100,350,110,30);
  mess.setBounds(220,350,120,30);
   loginMess.setBounds(340,350,190,30);
     loginMess.setFont(new Font("Arail",Font.BOLD,16));



     signup.addActionListener(new  ActionListener(){
public void actionPerformed(ActionEvent e)
{


     String s1=name.getText();
     String s2=email.getText();
     String s3=mob.getText();
     String s4=username.getText();
     String s5=password.getText();
     System.out.println(s1+s2+s3+s4+s5);
     userdb.addUser(s1,s2,s3,s4,s5);
     

  System.out.println("btn clicked !");
}
     });



     loginMess.addMouseListener(new MouseAdapter(){

       public void mouseClicked(MouseEvent e)
      {
        dispose();
        new LoginFrame();
      }
     
     });
     
     





}





public void actionPerformed(ActionEvent e)
{
  
    System.out.println(e.getActionCommand());
  
}






}