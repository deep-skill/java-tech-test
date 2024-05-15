package com.javatech.client.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Client extends Person {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer clientId;

    private Boolean status;

    private String password;

    public Client(Client client) {
        super(client);
        this.clientId = client.getClientId();
        this.status = client.getStatus();
        this.password = client.getPassword();
    }

    public Client() {}

    public void update(Client client) {
        super.name = client.getName();
        super.age = client.getAge();
        super.address = client.getAddress();
        super.genre = client.getGenre();
        super.identification = client.getIdentification();
        super.phoneNumber = client.getPhoneNumber();
        this.status = client.getStatus();
        this.password = client.getPassword();
    }

    public Boolean getStatus() {
        return status;
    }

    public String getPassword() {
        return password;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

}
