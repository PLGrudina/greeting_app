import org.apache.log4j.Logger;

import javax.swing.*;
import java.awt.*;

/**
 * Created by PavelGrudina on 19.08.2017.
 */
public class AppRun extends JFrame {

    final static Logger logger = Logger.getLogger(AppRun.class);

    public AppRun() {
        super("Salutation");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JLabel message = new JLabel(new Message().getMessage(), SwingConstants.CENTER);
        Font font = new Font("Verdana", Font.BOLD, 40);
        message.setFont(font);
        getContentPane().add(message);
        pack();
        logger.info("Window was created!");
    }

    public static void main(String[] args) {
        AppRun app = new AppRun();
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        logger.info("User saw the message");

    }

}

