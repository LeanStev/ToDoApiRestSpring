package com.leanstev.app.rest.Controller;

import com.leanstev.app.rest.Model.Task;
import com.leanstev.app.rest.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private TodoRepository todoRepository;
    @GetMapping(value = "/")
    public  String holamundo(){
        return  "Hola mundo!";
    }

    @GetMapping(value = "/tasks")
        public List<Task> getTask() {
        return todoRepository.findAll();
    }
    @PostMapping (value = "/savetask")
    public String saveTask(@RequestBody Task task){
        todoRepository.save(task);
        return "save task";
    }

    @PutMapping (value = "/update/{id}")
    public String updateTask (@PathVariable long id,@RequestBody Task task){
        Task updateTask = todoRepository.findById(id).get();
        updateTask.setTittle(task.getTittle());
        updateTask.setDescription(task.getDescription());
        todoRepository.save(updateTask);
        return  "update task";
    }

    @DeleteMapping (value = "/delete/{id}")
    public String deleteTask (@PathVariable long id,@RequestBody Task task){
        Task deleteTask = todoRepository.findById(id).get();
        todoRepository.delete(deleteTask);
        return "delete task";
    }


}

