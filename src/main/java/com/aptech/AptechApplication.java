package com.aptech;

import com.aptech.controller.UserController;
import com.aptech.entity.UserEntity;
import com.aptech.repository.UserRepository;
import com.aptech.service.impl.UserServiceImpl;
import com.aptech.view.LoginFrame;
import com.aptech.view.UserFrame;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.delivery.request"})
@EntityScan("com.delivery.domain")
@EnableJpaRepositories("com.delivey")
public class AptechApplication {

    public static void main(String[] args) {
        SpringApplication.run(AptechApplication.class, args);
        System.setProperty("java.awt.headless", "false");
        SwingUtilities.invokeLater(() -> {
            UserFrame f = new UserFrame();
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setVisible(true);

        });
    }
    
}
