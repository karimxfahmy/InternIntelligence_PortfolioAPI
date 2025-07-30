package com.portfolioapi.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "skills")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String level;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Skill() {}

    public Skill(String name, String level, User user) {
        this.name = name;
        this.level = level;
        this.user = user;
    }

    public Long getId() { return id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getLevel() { return level; }

    public void setLevel(String level) { this.level = level; }

    public User getUser() { return user; }

    public void setUser(User user) { this.user = user; }
}
