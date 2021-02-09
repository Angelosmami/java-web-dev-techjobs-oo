package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return id == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    public int getId() {
        return id;
    }

    public String getName() {
        if (name == null) return "Data not available";
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return this.employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return this.location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return this.positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return this.coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }


    @Override
    public String toString() {
        String Id = "\nID: " + this.getId();
        String stringName;
        String stringEmployer;
        String stringLocation;
        String stringPositionType;
        String stringCoreCompetency;

        if (this.getName() == null) {
            stringName = "\nName: " + "Data not available";
        } else {
            stringName = "\nName: " + this.getName();

            if (employer.getValue().equals("") ) {
                stringEmployer = "\nEmployer: " + "Data not available";
            } else {
                stringEmployer = "\nEmployer: " + this.getEmployer();
            }
            if (location.getValue().equals("")) {
                stringLocation = "\nLocation: " + "Data not available";
            } else {
                stringLocation = "\nLocation: " + this.getLocation();
            }
            if (positionType.getValue().equals("")) {
                stringPositionType = "\nPosition Type: " + "Data not available";
            } else {
                stringPositionType = "\nPosition Type: " + this.getPositionType();
            }
            if (coreCompetency.getValue().equals("")) {
                stringCoreCompetency = "\nCore Competency: " + "Data not available";
            } else {
                stringCoreCompetency = "\nCore Competency: " + this.getCoreCompetency();
            }
            return Id + stringName + stringEmployer + stringLocation + stringPositionType + stringCoreCompetency;
        }
        return "Id + stringName + stringEmployer + stringLocation + stringPositionType + stringCoreCompetency";
    }
}

