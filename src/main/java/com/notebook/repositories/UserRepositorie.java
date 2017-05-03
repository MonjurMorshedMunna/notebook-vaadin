package com.notebook.repositories;

import com.notebook.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by monju on 01-May-17.
 */
@Repository
public interface UserRepositorie extends JpaRepository<User, Long> {
}
