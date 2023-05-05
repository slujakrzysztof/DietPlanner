package com.sluja.dietplanner.repository;

import com.sluja.dietplanner.entity.BlackList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlackListRepository extends JpaRepository<BlackList, Integer> {
}
