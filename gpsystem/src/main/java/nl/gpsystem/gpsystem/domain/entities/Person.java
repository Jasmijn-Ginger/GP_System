package nl.gpsystem.gpsystem.domain.entities;

import java.time.LocalDate;

public abstract class Person {

    private final String firstName;
    private final String callSign;
    private final String prefix;
    private final String lastName;
    private final String genderBio;
    private final String genderChosen;
    private final LocalDate dateOfBirth;
    private final String streetName;
    private final String houseNumber;
    private final String city;
    private final String telNumber;
    private final String email;
    private final String bsn;

    public Person(String firstName, String callSign, String prefix, String lastName, String genderBio, String genderChosen, LocalDate dateOfBirth, String streetName, String houseNumber, String city, String telNumber, String email, String bsn) {
        this.firstName = firstName;
        this.callSign = callSign;
        this.prefix = prefix;
        this.lastName = lastName;
        this.genderBio = genderBio;
        this.genderChosen = genderChosen;
        this.dateOfBirth = dateOfBirth;
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.city = city;
        this.telNumber = telNumber;
        this.email = email;
        this.bsn = bsn;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getCallSign() {
        return callSign;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName(){
        return firstName + " " + prefix + " " + lastName + " - Roepnaam: " + callSign;
    }
    public String getGenderBio() {
        return genderBio;
    }

    public String getGenderChosen() {
        return genderChosen;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getCity() {
        return city;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getBsn() {
        return bsn;
    }
}
