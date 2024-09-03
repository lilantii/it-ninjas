package adressbuch;

import java.util.ArrayList;
import java.util.List;

public class Adressbook {
    Person person = new Person("Peter","Lustig", "p.l@gmail.com", "0797277813");
    Person person2 = new Person("Hannah","Sauer", "hannah.s@gmail.com", "0777777777");
    Person person3 = new Person("Justus","Ju", "just@gmail.com", "0799299807");
    Person person4 = new Person("Nina","Lustig", "n.l@gmail.com", "0797277823");

    List<Person> persons = new ArrayList<>();

    public Adressbook() {
        persons.add(person);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
    }

    public void countContacts(){
        System.out.println("Contacts: " + persons.size());
    }

    public void addContact(Person newPerson){
        for(Person person : persons){
            if(person.geteMail().equals(newPerson.geteMail())){
                System.out.println("Contact with this email already exists");
                return;
            }
        }
        persons.add(newPerson);
        System.out.println("New contact created");
    }

    public void findContact(String firstname, String lastname) {
        for (Person person : persons) {
            if (person.getFirstName().equals(firstname) && person.getLastName().equals(lastname)) {
                System.out.println("Contact found!");
                System.out.println("Firstname: " + person.getFirstName());
                System.out.println("Lastname: " + person.getLastName());
                System.out.println("Email: " + person.geteMail());
                System.out.println("Phone number: " + person.getPhoneNumber());
                return;
            }
        }
        System.out.println("Person not found");
    }

    public void removeContact(String eMail){
        boolean removed = persons.removeIf(person -> person.geteMail().equals(eMail));
        if (removed) {
            System.out.println("Contact removed");
        } else {
            System.out.println("No contact with this email found");
        }
    }

    public void listContacts() {
        System.out.println(persons.toString());
    }
}
