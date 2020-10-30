package ru.avalon.java.dev.j10.labs.commons;
/*
 * TODO(Студент): Создайте класс Address.
 *
 * 1. Добавте файл в пакет ru.avalon.java.dev.j10.labs.commons.
 *
 * 2. Создайте класс, видимый за пределами пакета. Подумайте о том
 *    Какое имя должен иметь класс, если он объявленн в этом
 *    файле.
 *
 * 3. Подумайте над тем, какие переменные должены быть
 *    определены в классе.
 *
 * 4. Подумайте над тем, какие методы должны быть объявлены
 *    в классе.
 */
public class Address{
    private int index;
    private String country;
    private String city;
    private String street;
    private int building;
    private int flat;

    public int getIndex() {
        return index;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getBuilding() {
        return building;
    }

    public int getFlat() {
        return flat;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setBuilding(int building) {
        this.building = building;
    }

    public void setFlat(int flat) {
        this.flat = flat;
    }
    
    @Override
    public String toString(){
        return "zipCode = " + index + ",country = " + country + ", city = " + city + ", street = " + street +", building = "+ building +", flat = "+ flat;
    }
    
}