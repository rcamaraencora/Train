package task2;

import java.util.*;
import java.util.stream.Collectors;

public class Calculator {

    public static float average(List<Person> list){
        float  sum=0;
        for(Person p : list)
        {
            sum = sum+p.getAge();
        }

        return sum/list.size();
    }


    public static int mariosCounter(List<Person> list){
        int counter=0;
        for(Person p : list) {
           if (p.getName().equalsIgnoreCase("MARIO"))
               counter++;
        }

        return counter;
    }

    public static int brotherSisterCounter(List<Person> list){
        int counter=0;

        List<Person> cl = list.stream().filter(person -> person instanceof Child).collect(Collectors.toList());

        for(Person p : cl ) {
            Child c = (Child)p;
            if(c.isHasBotherOrSister())
                counter++;
        }

        return counter;
    }
}