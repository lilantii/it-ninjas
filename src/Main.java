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

        adressbook.countContacts();
        adressbook.addContact(person);
        adressbook.countContacts();
        adressbook.findContact("Peter", "Lustig");
        adressbook.removeContact("n.l@gmail.com");
        adressbook.listContacts();
    }
}