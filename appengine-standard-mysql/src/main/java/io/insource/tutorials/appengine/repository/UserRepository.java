package io.insource.tutorials.appengine.repository;

import io.insource.tutorials.appengine.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
