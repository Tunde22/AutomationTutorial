package ObjectData;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class RegisterObject {

    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String phoneNumber;
    private String gender;
    private List<String> hobbyValues;
    private List<String> languageValues;
    private String skills;
    private String country;
    private String year;
    private String month;
    private String day;

    public RegisterObject(HashMap<String, String> testData) {
        populateData(testData);
    }

    public void populateData(HashMap<String, String> testData) {
        for (String key : testData.keySet()) {
            switch (key) {
                case "firstName":
                    setFirstName(testData.get(key));
                    break;
                case "lastName":
                    setLastName(testData.get(key));
                    break;
                case "address":
                    setAddress(testData.get(key));
                    break;
                case "email":
                    setEmail(testData.get(key));
                    break;
                case "phoneNumber":
                    setPhoneNumber(testData.get(key));
                    break;
                case "gender":
                    setGender(testData.get(key));
                    break;
                case "hobbyValues":
                    setHobbyValues(testData.get(key));
                    break;
                case "languageValues":
                    setLanguageValues(testData.get(key));
                    break;
                case "skills":
                    setSkills(testData.get(key));
                    break;
                case "country":
                    setCountry(testData.get(key));
                    break;
                case "year":
                    setYear(testData.get(key));
                    break;
                case "month":
                    setMonth(testData.get(key));
                    break;case "day":
                    setDay(testData.get(key));
                    break;
            }
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getHobbyValues() {
        return hobbyValues;
    }

    public void setHobbyValues(String hobbyValues) {
        this.hobbyValues = Arrays.asList(hobbyValues.split(","));
    }

    public List<String> getLanguageValues() {
        return languageValues;
    }

    public void setLanguageValues(String languageValues) {
        this.languageValues = Arrays.asList(languageValues.split(","));
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skill) {
        this.skills = skill;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
