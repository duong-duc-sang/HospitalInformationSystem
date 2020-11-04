/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aptech.controller;

import com.aptech.view.UserFrame;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

/**
 *
 * @author ducsang
 */
@Controller
@AllArgsConstructor
public class UserController extends AbstractFrameController{
    private UserFrame userFrame;

    @Override
    public void prepareAndOpenFrame() {
        userFrame.setVisible(true);
    }
    
}
