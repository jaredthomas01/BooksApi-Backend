package api.books.service;

import api.books.entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface UsersService {
    UserEntity createUser(UserEntity userEntity);
    Optional<UserEntity> getUserById(Long id);
    List<UserEntity> getAllUsers();
    UserEntity updateUser(Long id, UserEntity user);
    void deleteUser(Long id);
}
