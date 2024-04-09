package com.org.dashboard.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.org.dashboard.model.UserInfo;

public interface UserRepo extends JpaRepository<UserInfo, Long>{
	
	@Query(value= "select * from `user-data-dashboard`e where e.topic =:topic ",nativeQuery = true)
	List<UserInfo> findByFilterData(@Param("topic") String topic);

}
