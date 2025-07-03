
package com.aap.registration.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Member {
    @Id @GeneratedValue
    private Long id;
    private String assemblyConstituency;
    private String boothNumber;
    private String name;
    private String address;
    private String talukaWard;
    private String whatsapp;
    private String epicId;
    private LocalDate dob;
    private String formFiller;
    private String signature;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getAssemblyConstituency() { return assemblyConstituency; }
    public void setAssemblyConstituency(String val) { this.assemblyConstituency = val; }
    public String getBoothNumber() { return boothNumber; }
    public void setBoothNumber(String val) { this.boothNumber = val; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public String getTalukaWard() { return talukaWard; }
    public void setTalukaWard(String tw) { this.talukaWard = tw; }
    public String getWhatsapp() { return whatsapp; }
    public void setWhatsapp(String whatsapp) { this.whatsapp = whatsapp; }
    public String getEpicId() { return epicId; }
    public void setEpicId(String epicId) { this.epicId = epicId; }
    public LocalDate getDob() { return dob; }
    public void setDob(LocalDate dob) { this.dob = dob; }
    public String getFormFiller() { return formFiller; }
    public void setFormFiller(String ff) { this.formFiller = ff; }
    public String getSignature() { return signature; }
    public void setSignature(String signature) { this.signature = signature; }
}
