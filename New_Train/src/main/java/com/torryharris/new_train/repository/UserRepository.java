package com.torryharris.new_train.repository;

import com.torryharris.new_train.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends JpaRepository<UserModel,String> {
    UserModel findByUserNameAndPassword(String userName,String password);
}
