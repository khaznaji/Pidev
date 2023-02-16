package com.example.intermove.Repositories;

import com.example.intermove.Entities.EventsAndComplaints.Events;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EventRepository extends JpaRepository<Events,Integer>{
    @Query("SELECT u FROM Events u WHERE u.title LIKE %:title% ")
    List<Events> findByTitle(@Param("title") String title);
}
