package com.notebook.repositories;

import com.notebook.models.Plan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by monju on 01-May-17.
 */
@Repository
public interface PlanRepository extends JpaRepository<Plan, Long> {

}
