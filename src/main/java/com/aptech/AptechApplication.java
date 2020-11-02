package com.aptech;

import com.aptech.view.LoginFrame;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AptechApplication {

	public static void main(String[] args) {
		SpringApplication.run(AptechApplication.class, args);
                System.setProperty("java.awt.headless", "false");
SwingUtilities.invokeLater(() -> {
    LoginFrame f = new LoginFrame();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
});
       

}
}
