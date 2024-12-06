package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Department {

    @Id
    private int id;
    private String name;

    public Department(int id, String name){
        this.id = id;
        this.name = name;
    }

    //require for Hibernate
    public Department(){};

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

}
