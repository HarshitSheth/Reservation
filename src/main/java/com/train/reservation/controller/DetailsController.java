package com.train.reservation.controller;

import com.train.reservation.dao.DetailsDaoImpl;
import com.train.reservation.model.Details;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class DetailsController {

    @Autowired
    DetailsDaoImpl detailsDao;

    @PostMapping("/post")
    public boolean write(@RequestBody Details details, Model model){
        Details details1 = details;
        return detailsDao.writeToDb(details1);
    }

    @RequestMapping("/post")
    public String get(){
        return "Get Working";
    }
}
