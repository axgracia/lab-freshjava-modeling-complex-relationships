package com.ironhacklab.Modeling.Relationships.model;

import jakarta.persistence.*;
import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Entity
@Table(name = "chapters")
public class Chapter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String district;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "president_id", referencedColumnName = "id")
    private Member president;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "chapter_id")
    private List<Member> members;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setPresident(Member president) {
        this.president = president;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDistrict() {
        return district;
    }

    public Member getPresident() {
        return president;
    }

    public List<Member> getMembers() {
        return members;
    }
}
        this.name = name;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setPresident(Member president) {
        this.president = president;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Member getPresident() {
        return president;
    }

    public void setPresident(Member president) {
        this.president = president;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
