package com.dileepa.dataLoader;

import com.dileepa.domain.PersonBean;

import java.util.ArrayList;
import java.util.List;

/**
 * USER : Dileepa
 * DATE : 4/26/15
 * TIME : 12:47 PM
 */
public class PersonLoader
{
    public static List loadAllPersons()
    {
        List personList = new ArrayList<PersonBean>();

        PersonBean person1 = new PersonBean();
        PersonBean person2 = new PersonBean();
        PersonBean person3 = new PersonBean();
        PersonBean person4 = new PersonBean();
        PersonBean person5 = new PersonBean();

        person1.setId(1);
        person1.setAge(27);
        person1.setJob("Software Engineer");
        person1.setName("Dileepa");
        person1.setCity("Matara");

        person2.setId(2);
        person2.setAge(28);
        person2.setJob("Software Engineer");
        person2.setName("Amila");
        person2.setCity("Naththandiya");

        person3.setId(3);
        person3.setAge(27);
        person3.setJob("QA Engineer");
        person3.setName("Anujula");
        person3.setCity("Narammala");

        person4.setId(4);
        person4.setAge(28);
        person4.setJob("QA Engineer");
        person4.setName("Roshan");
        person4.setCity("Hikkaduawa");

        person5.setId(5);
        person5.setAge(26);
        person5.setJob("QA Engineer");
        person5.setName("Rachitha");
        person5.setCity("Mathugama");

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);

        return personList;

    }

}
