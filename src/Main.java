import java.util.Scanner;
import javax.swing.*;

class Window {
    static String[] keywords = {"Hallo", "Nikl"};
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocation(100,100);
        frame.setDefaultLookAndFeelDecorated(true);

        JLabel header = new JLabel("Hallo, mein Name ist " + keywords[0]);
        header.setBounds(50, 50, 200, 50);

        frame.add(header);
        frame.setVisible(true);
        second();
    }
    public static void getProfile() {
        String name = "Nikl"
    }
}
