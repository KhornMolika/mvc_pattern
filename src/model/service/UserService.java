package model.service;

import model.User;
import model.dto.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> getAllUsers();
    void addNewUser(User user);
    void deleteUser(Integer id);
    void updateUser(User user);
}
