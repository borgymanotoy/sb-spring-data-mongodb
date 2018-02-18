package com.ploverbay.ticketing.authentication.service;

import com.ploverbay.ticketing.authentication.model.User;
import com.ploverbay.ticketing.authentication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User service class
 * Purpose:
 * Description:
 *
 * @author Eric Jose E. Salip Ahmad
 */
@Service("userService")
public class UserService {

    @Autowired
    private UserRepository m_userRepository;


    public  User findByUserId(String userId) {
        return m_userRepository.findByUserId(userId);
    }

    public User findByEmail(String email) {
        return m_userRepository.findByEmail(email);
    }

    public User findByName(String firstName, String lastName) {
        return m_userRepository.findByUserDetailsFirstNameAndUserDetailsLastName(firstName, lastName);
    }

    public List<User> listUsers() {
        return m_userRepository.findAll();
    }

    public User saveUser(User user) {
        return m_userRepository.save(user);
    }

    public void removeUser(String userId) {
        m_userRepository.delete(userId);
    }

}