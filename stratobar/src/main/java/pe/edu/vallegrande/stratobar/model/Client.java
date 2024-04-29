package pe.edu.vallegrande.stratobar.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "client")

public class Client {
    @Id
    @Column(name ="id")
    private String id = UUID.randomUUID().toString();

    @Column(name ="name")
    private String name;

    @Column(name ="last_names")
    private String last_names;

    @Column(name ="cellphone")
    private String cellphone;

    @Column(name ="type_document")
    private String type_document;

    @Column(name ="number_document")
    private String number_document;

    @Column(name ="email")
    private String email;

    @Column(name ="birthdate")
    private LocalDate birthdate;

    @Column(name ="active")
    private String active;

}
