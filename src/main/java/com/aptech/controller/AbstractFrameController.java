/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aptech.controller;

import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author ducsang
 */
public abstract class AbstractFrameController {
    public abstract void prepareAndOpenFrame();

    protected void registerAction(JButton button, ActionListener listener) {
        button.addActionListener(listener);
    }
}
