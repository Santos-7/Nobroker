package com.Nobroker.repositery;

import com.Nobroker.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositery  extends JpaRepository<User,Long> {
}
