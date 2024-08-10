package com.Rest.Courses.Courses.Entities;

public class Course {
    private int id;
    private String tittle;
    private String description;

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", tittle='" + tittle + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Course() {
        super();
    }
    public Course(int id, String tittle, String description) {
        this.id = id;
        this.tittle = tittle;
        this.description = description;
    }
}
