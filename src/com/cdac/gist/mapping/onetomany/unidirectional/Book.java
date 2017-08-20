package com.cdac.gist.mapping.onetomany.unidirectional;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author Kapil Gupta <Kapil gupta at CDAC-GIST,Pune>
 */
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String book;

    //  Using foreign Key
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "book1")
//    @JoinColumn(name = "BOOK_CHAPTER_FK")

//    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//    @JoinTable(name = "BOOK_CHAPTER_JOIN_TABLE",joinColumns = {@JoinColumn(name = "id")},inverseJoinColumns = {@JoinColumn(name = "chapterid")})
    private List<Chapter> chapters = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public List<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(List<Chapter> chapters) {
        this.chapters = chapters;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", book=" + book + '}';
    }

}
