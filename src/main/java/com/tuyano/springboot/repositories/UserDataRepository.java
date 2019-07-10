package com.tuyano.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tuyano.springboot.data.UserData;

@Repository
public interface UserDataRepository extends JpaRepository<UserData,Long>{
	
}