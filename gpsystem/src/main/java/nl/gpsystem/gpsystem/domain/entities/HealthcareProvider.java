package nl.gpsystem.gpsystem.domain.entities;

import java.time.LocalDate;

public class HealthcareProvider extends Person{

    private final String bicNumber;


    public HealthcareProvider(String firstName, String callSign, String prefix, String lastName, String genderBio, String genderChosen, LocalDate dateOfBirth, String streetName, String houseNumber, String city, String telNumber, String email, String bsn, String bicNumber) {
        super(firstName, callSign, prefix, lastName, genderBio, genderChosen, dateOfBirth, streetName, houseNumber, city, telNumber, email, bsn);
        this.bicNumber = bicNumber;
    }

    public String getBicNumber() {
        return bicNumber;
    }
}
