package com.nestdigital.socialmedianewbackend.Dao;

import com.nestdigital.socialmedianewbackend.Model.AddModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AddDao extends CrudRepository<AddModel,Integer> {

    @Query(value = "SELECT `id`, `dob`, `email`, `name`, `password`, `phnno`, `place` FROM `user` WHERE `email`=:email AND`password`=:password",nativeQuery = true)
    List<AddModel>login(String email, String password);
}
