package com.leanstev.app.rest.Repository;

import com.leanstev.app.rest.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Task, Long> {

}
