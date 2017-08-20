package com.cdac.gist.mapping.onetomany.unidirectional;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Kapil Gupta <Kapil gupta at CDAC-GIST,Pune>
 */
@Entity
public class Chapter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int chapterid;
    private String name;
//    Many to One Unidirectional Relationship
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "BOOK_CHAPTER_FK")

//    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @JoinTable(name = "BOOK_CHAPTER_JOIN_TABLE", joinColumns = {
//        @JoinColumn(name = "chapterid")}, inverseJoinColumns = {
//        @JoinColumn(name = "id")})
    private Book book1;

    public int getChapterid() {
        return chapterid;
    }

    public void setChapterid(int chapterid) {
        this.chapterid = chapterid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book getBook1() {
        return book1;
    }

    public void setBook1(Book book1) {
        this.book1 = book1;
    }

    @Override
    public String toString() {
        return "Chapter{" + "id=" + chapterid + ", name=" + name + '}';
    }

//    public Book getBook() {
//        return book;
//    }
//
//    public void setBook(Book book) {
//        this.book = book;
//    }
}
