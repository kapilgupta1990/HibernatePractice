package com.cdac.gist.mapping.manytomany;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import org.hibernate.annotations.ManyToAny;

@Entity
public class Publisher {

    public Publisher() {
    }

    public Publisher(String pName) {
        this.pName = pName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int pid;
    private String pName;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "PUB_SUB_JOIN", joinColumns = {
        @JoinColumn(name = "pid")}, inverseJoinColumns = {
        @JoinColumn(name = "sid")})
    private List<Subscriber> subscribers = new ArrayList<>();

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    @Override
    public String toString() {
        return "Publisher{" + "pid=" + pid + ", pName=" + pName + ", subscribers=" + +'}';
    }

    public List<Subscriber> getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(List<Subscriber> subscribers) {
        this.subscribers = subscribers;
    }

}
