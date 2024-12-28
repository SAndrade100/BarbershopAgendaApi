package com.ads.p5._42.barbershop.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private LocalDateTime date;
    private String serviceType;
    private String status;

    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;  // Mudado de 'user' para 'person'

    public Appointment() {}

    public Appointment(Person person, String status, String serviceType, LocalDateTime date, UUID id) {
        this.person = person;
        this.status = status;
        this.serviceType = serviceType;
        this.date = date;
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Person getPerson() {  // Atualizado para refletir a mudança de 'user' para 'person'
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
