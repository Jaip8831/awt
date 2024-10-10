import java.awt.*;
import java.awt.event.*;


class MyFrame extends Frame{

    MyFrame(String title){
setVisible(true);
setTitle(title);
setSize(540,560);
setLocation(500,10);
setLayout(null);
setResizable(false);




addWindowListener(new WindowAdapter(){
    public void windowClosing(WindowEvent we )
    {
        dispose();
    }
});

    }
}