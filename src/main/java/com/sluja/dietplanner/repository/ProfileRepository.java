package com.sluja.dietplanner.repository;

import com.sluja.dietplanner.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Integer> {
}
