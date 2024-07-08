package se.lexicon;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
        ex5();

    }

    public static void ex1() {
        List<String> daysOfTheWeek = new ArrayList<>();
        daysOfTheWeek.add("Monday");
        daysOfTheWeek.add("Tuesday");
        daysOfTheWeek.add("Wednesday");
        daysOfTheWeek.add("Thursday");
        daysOfTheWeek.add("Friday");
        daysOfTheWeek.add("Saturday");
        daysOfTheWeek.add("Sunday");

        System.out.println(daysOfTheWeek);

    }

    public static void ex3() {
        List<String> daysOfTheWeek = new ArrayList<>();
        daysOfTheWeek.add("Monday");
        daysOfTheWeek.add("Tuesday");
        daysOfTheWeek.add("Wednesday");
        daysOfTheWeek.add("Friday");
        daysOfTheWeek.add("Saturday");
        daysOfTheWeek.add("Sunday");

        System.out.println(daysOfTheWeek);

        List<String> dayOfTheWeek = new ArrayList<>();
        dayOfTheWeek.add("Thursday");
        daysOfTheWeek.addAll(3,dayOfTheWeek);

        for (String days : daysOfTheWeek);
        System.out.println(daysOfTheWeek);

    }

    public static void ex5() {

        HashSet<String> daysOfTheWeek = new HashSet<>();
        daysOfTheWeek.add("Monday");
        daysOfTheWeek.add("Tuesday");
        daysOfTheWeek.add("Wednesday");
        daysOfTheWeek.add("Thursday");
        daysOfTheWeek.add("Friday");
        daysOfTheWeek.add("Saturday");
        daysOfTheWeek.add("Sunday");

        System.out.println(daysOfTheWeek);
    }
}
