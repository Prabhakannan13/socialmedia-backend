package com.nestdigital.socialmedianewbackend.Controller;

import com.nestdigital.socialmedianewbackend.Dao.AddDao;
import com.nestdigital.socialmedianewbackend.Model.AddModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddController {
    @Autowired
    private AddDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/adduser",consumes = "application/json",produces = "application/json")
    public String adduser(@RequestBody AddModel add){
        System.out.println(add.toString());
        dao.save(add);
        return "{status:'success}";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/login",consumes = "application/json",produces = "application/json")
    public List<AddModel>login(@RequestBody AddModel add){
        return (List<AddModel>) dao.login(add.getEmail(), add.getPassword());
    }
}
