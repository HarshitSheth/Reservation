package com.train.reservation.dao;

import com.train.reservation.model.Details;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailsDao extends JpaRepository<Details,String> {
}
