package com.ket.todo_management_tool.repository;

import com.ket.todo_management_tool.model.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodoRepository extends MongoRepository<Todo, String> {

}
