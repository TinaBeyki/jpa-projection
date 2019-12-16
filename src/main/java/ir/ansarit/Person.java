package ir.ansarit;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Person implements Serializable {

    @Id
    private int id;
    private String name;
    private String surname;


    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
