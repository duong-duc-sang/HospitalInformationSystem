/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aptech.service.impl;

import com.aptech.entity.UserEntity;
import com.aptech.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author ducsang
 */
public class BaseServiceFactory {
    protected void save(Object ob){
        if(ob instanceof UserEntity){
            userRepository.save((UserEntity)ob);
        }
    }
    @Autowired
    protected UserRepository userRepository;
}
