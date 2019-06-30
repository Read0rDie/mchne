package com.mchne.coredata.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mchne.coredata.persistence.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
