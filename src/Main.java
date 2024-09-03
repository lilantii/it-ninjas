import adressbuch.Adressbook;
import adressbuch.Person;
import patient.Checkup;
import patient.Patient;

public class Main {
    public static void main(String[] args) {
        // Patient patient = new Patient("John Doe", 180, 80, 36.8f, true);
        // Checkup checkup = new Checkup();
        // checkup.checkUp(patient);

        Adressbook adressbook = new Adressbook();
        Person person = new Person("Erik", "Range", "erik.range@gmail.com", "0791234567");
        Person person2 = new Person("Erik", "Range", "n.l@gmail.com", "0791234567");

        adressbook.countContacts();
        adressbook.addContact(person);
        adressbook.addContact(person2);
        adressbook.countContacts();
        adressbook.findContact("Peter", "Lustig");
        adressbook.findContact("Julia", "Traurig");
        adressbook.removeContact("n.l@gmail.com");
        adressbook.removeContact("ivan@gmail.com");
        adressbook.listContacts();
    }
}