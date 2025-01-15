package com.videocallapp.videocallapp.repo;

import com.videocallapp.videocallapp.entiity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users, Long> {
    public Users findByUid(Long id);
    public Users findByEmail(String email);
}
