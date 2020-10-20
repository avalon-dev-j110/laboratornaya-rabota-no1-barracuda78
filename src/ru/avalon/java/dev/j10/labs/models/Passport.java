package ru.avalon.java.dev.j10.labs.models;

import java.util.Calendar;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
 */
public class Passport {
    
     /*
     * TODO(Студент): Закончить определение класса.
     *
     * 1. Объявить атрибуты класса.
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     *
     * 3. Создайте все необходимые конструкторы класса.
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечте возможность использования класса за
     *    пределами пакета.
     */
    
    //fields
    private String series;
    private int passportNumber;
    private String firstName;
    private String lastName;
    private String secondFirstName; //отсутствует в конструкторе. 
    private String middleName;     
    private Calendar dateOfBirth;
    private Calendar dateOfIssue;
    private IssuingDepartment issuingDepartment;

    //constructor01 - we have all data
    public Passport(String series, int passportNumber, String firstName, String lastName, String middleName, String secondFirstName, Calendar dateOfBirth, Calendar dateOfIssue, IssuingDepartment issuingDepartment) {
        this.series = series;
        this.passportNumber = passportNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.secondFirstName = secondFirstName;
        this.dateOfBirth = dateOfBirth;
        this.dateOfIssue = dateOfIssue;
        this.issuingDepartment = issuingDepartment;
    }
    
    //constructor02 - we do not have middlename
    public Passport(String series, int passportNumber, String firstName, String lastName,  String secondFirstName, Calendar dateOfBirth, Calendar dateOfIssue, IssuingDepartment issuingDepartment) {
        this.series = series;
        this.passportNumber = passportNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.secondFirstName = secondFirstName;
        this.dateOfBirth = dateOfBirth;
        this.dateOfIssue = dateOfIssue;
        this.issuingDepartment = issuingDepartment;
    }

    //constructor03 - we do not have passport data
    public Passport(String firstName, String lastName, String secondFirstName, Calendar dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.secondFirstName = secondFirstName;
        this.dateOfBirth = dateOfBirth;
    }

    //constructor4 - we do not have passport data and do not have secondFirstName
    public Passport(String firstName,String lastName, Calendar dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    
    
    
    //setters
    public void setSeries(String series) {
        this.series = series;
    }

    public void setPassportNumber(int passportNumber) {
        this.passportNumber = passportNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSecondFirstName(String secondFirstName) {
        this.secondFirstName = secondFirstName;
    }
    
        public void setMiddleName(String middleName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(Calendar dateOfBirth) {
        this.middleName = middleName;
    }

    public void setDateOfIssue(Calendar dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public void setIssuingDepartment(IssuingDepartment issuingDepartment) {
        this.issuingDepartment = issuingDepartment;
    }
    
    
    

    //getters
    public String getSeries() {
        return series;
    }

    public int getPassportNumber() {
        return passportNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSecondFirstName() {
        return secondFirstName;
    }
    
    public String getMiddleName() {
        return middleName;
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    public Calendar getDateOfIssue() {
        return dateOfIssue;
    }

    public IssuingDepartment getIssuingDepartment() {
        return issuingDepartment;
    }


}



