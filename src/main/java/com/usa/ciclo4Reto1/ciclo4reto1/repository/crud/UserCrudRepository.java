package com.usa.ciclo4Reto1.ciclo4reto1.repository.crud;

import com.usa.ciclo4Reto1.ciclo4reto1.model.User;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface UserCrudRepository extends CrudRepository <User, Integer> {
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
    //Optional<User> findByName(String name);
}
