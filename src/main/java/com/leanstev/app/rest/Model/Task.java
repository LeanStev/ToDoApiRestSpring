package com.leanstev.app.rest.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "tasktable")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String tittle;
    @Column
    private String description;

    public Task() {
    }

    public Task(long id, String tittle, String description) {
        this.id = id;
        this.tittle = tittle;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
