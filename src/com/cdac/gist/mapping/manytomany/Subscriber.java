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

/**
 *
 * @author Kapil Gupta <Kapil gupta at CDAC-GIST,Pune>
 */
@Entity
public class Subscriber {

    public Subscriber() {
    }

    public Subscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int sid;

    private String subscriberName;
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "subscribers",fetch = FetchType.EAGER)
//    @JoinTable(name = "PUB_SUB_JOIN", joinColumns = {
//        @JoinColumn(name = "sid")}, inverseJoinColumns = {
//        @JoinColumn(name = "pid")})

    private List<Publisher> publishers = new ArrayList<>();

    public List<Publisher> getPublishers() {
        return publishers;
    }

    public void setPublishers(List<Publisher> publishers) {
        this.publishers = publishers;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSubscriberName() {
        return subscriberName;
    }

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public String toString() {
        return "Subscriber{" + "sid=" + sid + ", subscriberName=" + subscriberName + ", publishers=" + publishers + '}';
    }

 

}
