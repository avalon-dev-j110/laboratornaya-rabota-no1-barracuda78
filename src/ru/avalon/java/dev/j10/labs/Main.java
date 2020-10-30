package ru.avalon.java.dev.j10.labs;

import java.util.Calendar;
import java.util.GregorianCalendar;
import ru.avalon.java.dev.j10.labs.commons.Address;
import ru.avalon.java.dev.j10.labs.models.Passport;
import ru.avalon.java.dev.j10.labs.models.Person;
import ru.avalon.java.dev.j10.labs.models.IssuingDepartment;

public class Main {

    /*
     * FIXME(Студент): Измените определение метода так, чтобы он стал точкой входа в приложение.
     */
    public static void main(String[] args) {
        
        Person ivanov = null;
        Person smith = null;
        
         /*
         * TODO(Студент): Создайте экземпляры класса 'Person'
         *
         * 1. Проинициализируейте переменную 'ivanov', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'Иванов Иван Иванович'.
         *
         * 2. Проинициализируейте переменную 'smith', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'John Edvard Smith'.
         */

        //for ivanov:
        Address ivanovAddress = new Address();
        ivanovAddress.setIndex(195095);
        ivanovAddress.setCountry("Russia");
        ivanovAddress.setCity("Saint-Petersburg");
        ivanovAddress.setStreet("Pravdy street");
        ivanovAddress.setBuilding(12);
        ivanovAddress.setFlat(4);
        Calendar dobIvanov = new GregorianCalendar(1980, 0 , 25);
        Calendar doiIvanov = new GregorianCalendar(2003, 11 , 03);
        Passport ivanovPassport = new Passport("АК", 123456, "Иван", "Иванов", "Иванович", "", dobIvanov, doiIvanov, IssuingDepartment.POLICEDEPARTMENT01);
        
        ivanov = new Person(ivanovPassport, ivanovAddress);
        
        //for smith:
        Address smithAddress = new Address();
        smithAddress.setIndex(38555);
        smithAddress.setCountry("UK");
        smithAddress.setCity("Saint-Hill");
        smithAddress.setStreet("Dirty road");
        smithAddress.setBuilding(55);
        smithAddress.setFlat(77);
        Calendar dobSmith = new GregorianCalendar(1955, 3 , 14);
        Calendar doiSmith = new GregorianCalendar(1975, 10 , 27);
        Passport smithPassport = new Passport("DD", 999777, "John", "Smith", "Edvard", dobSmith, doiSmith, IssuingDepartment.POLICEDEPARTMENT02);
        
        smith = new Person(smithPassport, smithAddress);
        
        
        /*
         * TODO(Студент): Создайте несколько строковых переменных:
         *
         * 1. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 2. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         *
         * 3. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 4. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         */

        String fullName01 = ivanov.getFullName();
        String fullName02 = smith.getFullName();
        
        String address01 = ivanov.getAddress();
        String address02 = smith.getAddress();
        
        /*
         * TODO(Студент): Выведите в консоль значения созданных строковых переменных:
         *
         * Значение каждой переменной должно быть выведено на
         * отдельной строке.
         */
        
        System.out.printf("%s%n%s%n%s%n%s%n", fullName01, fullName02, address01, address02);
    }
}
