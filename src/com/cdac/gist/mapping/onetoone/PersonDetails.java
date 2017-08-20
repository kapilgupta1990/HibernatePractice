//package com.cdac.gist.mapping.onetoone;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
//
///**
// *
// * @author Kapil Gupta <Kapil gupta at CDAC-GIST,Pune>
// */
//@Entity
//public class PersonDetails {
//
//    @Id
//    private int id;
//
//    private String fatherName;
//    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY,mappedBy = "pDetails")
//    private Person person;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getFatherName() {
//        return fatherName;
//    }
//
//    public void setFatherName(String fatherName) {
//        this.fatherName = fatherName;
//    }
//
//    public Person getPerson() {
//        return person;
//    }
//
//    public void setPerson(Person person) {
//        this.person = person;
//    }
//
//    @Override
//    public String toString() {
//        return "PersonDetails{" + "id=" + id + ", fatherName=" + fatherName + '}';
//    }
//
//}
