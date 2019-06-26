package com.train.reservation.dao;

import com.train.reservation.model.Details;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailsDaoImpl{

    @Autowired
    DetailsDao detailsDao;

    public boolean writeToDb(Details details)
    {
        detailsDao.save(details);
        return true;
    }
}
