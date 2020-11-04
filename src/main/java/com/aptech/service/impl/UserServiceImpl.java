/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aptech.service.impl;

import com.aptech.entity.UserEntity;
import com.aptech.repository.UserRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.aptech.service.UserService;
import java.util.List;

/**
 *
 * @author ducsang
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    
    @Override
    public void delete(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public void save(UserEntity userEntity) {
        userRepository.save(userEntity);
    }

    @Override
    public List<UserEntity> fillAll() {
        return userRepository.findAll();
    }
    
  }

