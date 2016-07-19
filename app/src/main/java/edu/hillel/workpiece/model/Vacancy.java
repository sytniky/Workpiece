package edu.hillel.workpiece.model;

import java.io.Serializable;

/**
 * Created by yuriy on 17.07.16.
 */
public class Vacancy implements Serializable {

    public static final long serialVersionUID = 42L;

    private int companyIconId;
    private String companyName;
    private String position;
    private String typeOfVessel;
    private String dateOfDeparture;
    private String englishLevel;
    private double salary;
    private String navigationArea;
    private int yearOfBuilt;
    private int dwt;
    private String mainEngine;
    private String nameOfVessel;
    private String durationOfContract;
    private String crewingAgency;

    public Vacancy(int companyIconId,
                   String companyName,
                   String position,
                   String dateOfDeparture,
                   String typeOfVessel,
                   String englishLevel,
                   double salary,
                   String navigationArea,
                   int yearOfBuilt,
                   int dwt,
                   String mainEngine,
                   String nameOfVessel,
                   String durationOfContract,
                   String crewingAgency) {

        this.companyIconId = companyIconId;
        this.companyName = companyName;
        this.position = position;
        this.dateOfDeparture = dateOfDeparture;
        this.typeOfVessel = typeOfVessel;
        this.englishLevel = englishLevel;
        this.salary = salary;
        this.navigationArea = navigationArea;
        this.yearOfBuilt = yearOfBuilt;
        this.dwt = dwt;
        this.mainEngine = mainEngine;
        this.nameOfVessel = nameOfVessel;
        this.durationOfContract = durationOfContract;
        this.crewingAgency = crewingAgency;
    }

    public int getCompanyIconId() {
        return companyIconId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getPosition() {
        return position;
    }

    public String getDateOfDeparture() {
        return dateOfDeparture;
    }

    public String getTypeOfVessel() {
        return typeOfVessel;
    }

    public String getEnglishLevel() {
        return englishLevel;
    }

    public double getSalary() {
        return salary;
    }

    public String getNavigationArea() {
        return navigationArea;
    }

    public int getYearOfBuilt() {
        return yearOfBuilt;
    }

    public int getDwt() {
        return dwt;
    }

    public String getMainEngine() {
        return mainEngine;
    }

    public String getNameOfVessel() {
        return nameOfVessel;
    }

    public String getDurationOfContract() {
        return durationOfContract;
    }

    public String getCrewingAgency() {
        return crewingAgency;
    }
}
