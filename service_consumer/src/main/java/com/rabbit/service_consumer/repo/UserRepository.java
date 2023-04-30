package com.rabbit.service_consumer.repo;

import com.rabbit.service_consumer.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
