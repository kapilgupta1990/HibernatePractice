package com.cdac.gist.mapping.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Kapil Gupta <Kapil gupta at CDAC-GIST,Pune>
 */
@Entity
public class Person {

    @Id
    private int id;

    private String name;

//    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private PersonDetails pDetails;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public PersonDetails getpDetails() {
//        return pDetails;
//    }
//
//    public void setpDetails(PersonDetails pDetails) {
//        this.pDetails = pDetails;
//    }

//    @Override
//    public String toString() {
//        return "Person{" + "id=" + id + ", name=" + name + ", pDetails=" + pDetails + '}';
//    }

}
