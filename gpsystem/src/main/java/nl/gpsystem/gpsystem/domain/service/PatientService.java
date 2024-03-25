package nl.gpsystem.gpsystem.domain.service;

import jdk.jshell.spi.ExecutionControl;
import nl.gpsystem.gpsystem.domain.entities.Patient;

import java.time.LocalDate;
import java.util.Optional;

public interface PatientService {
    Optional<Patient> getPatient(LocalDate dayOfBirth, String lastName);

    Patient getPatient(long id) throws ExecutionControl.NotImplementedException;
}
