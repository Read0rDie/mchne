package com.mchne.core.data.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mchne.core.data.persistence.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

}
