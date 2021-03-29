package com.example.myspring01.repository;

import com.example.myspring01.entity.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User,Long> {
}