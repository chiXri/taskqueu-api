package com.marco.taskqueue_api.repository;

import com.marco.taskqueue_api.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
