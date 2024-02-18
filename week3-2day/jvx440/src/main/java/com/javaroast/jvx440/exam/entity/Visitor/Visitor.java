package com.javaroast.jvx440.exam.entity.Visitor;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Exam_Visitor")
@Setter
@Getter
@ToString
public class Visitor {
    @Id
    @Column(name = "visitorId")
    private String visitorId;

    @Column(name = "email")
    private String email;

    @Column(name = "userDevice")
    private String userDevice;

    @Column(name = "referer")
    private String referer;

    @Column(name = "requestURI")
    private String requestURI;

    @Column(name = "clientIP")
    private String clientIP;
}

