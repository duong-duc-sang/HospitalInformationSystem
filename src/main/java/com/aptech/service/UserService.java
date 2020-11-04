/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aptech.service;

import com.aptech.entity.UserEntity;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author ducsang
 */
public interface UserService {
    public void save(UserEntity userEntity);
    public void delete(int id);
    public List<UserEntity> fillAll();
}
