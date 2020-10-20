package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.Address;

/**
 * Представление о человеке.
 * <p>
 * С точки зрения задания человек представляется как сущность,
 * наделённая:
 * <ol>
 *     <li>паспортными данными;
 *     <li>пропиской по месту жительства.
 * </ol>
 */
public class Person {
    private String lastName;
    private String firstName;
    private String secondFirstName;
    private String middleName;
    private Passport passport;
    private Address address;

    public Person(Passport passport, Address address){
           this.passport = passport;
           this.address = address;
           
           lastName = passport.getLastName();
           firstName = passport.getFirstName();
           secondFirstName = passport.getSecondFirstName();
           
           if(passport.getMiddleName() != null)
                middleName = passport.getMiddleName();
    }
    
    
    /**
     * Возврвщает полное имя человека.
     * <p>
     * Если у человека есть Имя, Фамилия и Отчество, то
     * возвращет Имя, Фимилию и Отчество, разделённые пробелом.
     * <p>
     * Если у человека нет Отчества, но есть второе имя, то
     * возвращает Имя, Первую букву второго имени, и Фамилию,
     * разделённые пробелом. После Инициала второго имени
     * должна стоять точка. Например, "Джером К. Джером".
     * <p>
     * Если у человека нет ни Отчества ни Второго имени, а
     * есть только Имя и Фамилия, то возвращает их, разделённые
     * пробелом.
     *
     * @return имя человека в виде строки.
     */
    public String getFullName() {
        /*
         * TODO(Студент): Закончить определение метода 'getFullName()' класса 'Person'
         */
        
        //     * Если у человека есть Имя, Фамилия и Отчество, то
        //     * возвращет Имя, Фимилию и Отчество, разделённые пробелом.
        if(lastName != null && firstName != null  && middleName != null ){ //|| !middleName.equals("")
            return String.join(" ", firstName, lastName, middleName);
            
        //     * Если у человека нет Отчества, но есть второе имя, то
        //     * возвращает Имя, Первую букву второго имени, и Фамилию,
        //     * разделённые пробелом. После Инициала второго имени
        //     * должна стоять точка. Например, "Джером К. Джером".
        }else if(middleName == null && secondFirstName != null){
            StringBuilder sb = new StringBuilder();
            return sb.append(firstName).append(" ").append(secondFirstName.substring(0, 1)).append(". ").append(lastName).toString();

        //* Если у человека нет ни Отчества ни Второго имени, а
        //* есть только Имя и Фамилия, то возвращает их, разделённые
        //* пробелом.    
        }else if(middleName == null || middleName.equals("") && secondFirstName == null || secondFirstName.equals("") && firstName != null || !firstName.equals("") && lastName != null || !lastName.equals("")){
            return firstName + " " + lastName;
        }
        
        return null;
    }

    /**
     * Возвращает адрес, по которому проживает человек.
     * <p>
     * Возвращаемый адрес соответствует месту постоянной
     * регистрации человека, согласно паспортным данным.
     *
     * @return адрес регистрации в виде строки.
     */
    public String getAddress() {
        /*
         * TODO(Студент): Закончить определение метода 'getAddress()' класса 'Person'
         */
        return address.toString();
    }
}