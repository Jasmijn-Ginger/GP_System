package nl.gpsystem.gpsystem.domain.entities;

import java.time.LocalDate;

public class Patient extends Person{

    private final String healthInsuranceNumber;


    public Patient(String firstName, String callSign, String prefix, String lastName, String genderBio, String genderChosen, LocalDate dateOfBirth, String streetName, String houseNumber, String city, String telNumber, String email, String bsn, String healthInsuranceNumber) {
        super(firstName, callSign, prefix, lastName, genderBio, genderChosen, dateOfBirth, streetName, houseNumber, city, telNumber, email, bsn);
        this.healthInsuranceNumber = healthInsuranceNumber;
    }

    public String getHealthInsuranceNumber() {
        return healthInsuranceNumber;
    }
}
