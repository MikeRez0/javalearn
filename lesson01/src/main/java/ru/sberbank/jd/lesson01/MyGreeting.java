package ru.sberbank.jd.lesson01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MyGreeting implements Greeting{
    /**
     * Получение имени.
     */
    @Override
    public String getFirstName() {
        return "Mikhail";
    }

    /**
     * Получение фамилии.
     */
    @Override
    public String getLastName() {
        return "Mysurname";
    }

    /**
     * Получение года рождения.
     */
    @Override
    public int getBirthYear() {
        return 1985;
    }

    /**
     * Получение набора хобби.
     */
    @Override
    public Collection<String> getHobbies() {
        var res = new ArrayList<String>();
        res.add("Programming");
        res.add("Gaming");
        res.add("Skiing");
        res.add("Biking");
        return res;
    }

    /**
     * Получение имени репозитория.
     */
    @Override
    public String getRepoUrl() {
        return "https://github.com/MikeRez0/javalearn.git";
    }

    /**
     * Получение телефона.
     */
    @Override
    public String getPhone() {
        return "+79991234567";
    }

    /**
     * Получение набора ожиданий от курса.
     */
    @Override
    public Collection<String> getCourseExpectations() {
        var res = new ArrayList<String>();
        res.add("Освоить программирование на Java");
        res.add("Структурировать знания");
        res.add("Выполнить мини-проект");
        return res;
    }
}
