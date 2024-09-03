import adressbuch.Adressbook;
import adressbuch.Person;
import patient.Checkup;
import patient.Patient;
import streamingService.*;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Patient patient = new Patient("John Doe", 180, 80, 36.8f, true);
        // Checkup checkup = new Checkup();
        // checkup.checkUp(patient);

        // Adressbook adressbook = new Adressbook();
        // Person person = new Person("Erik", "Range", "erik.range@gmail.com", "0791234567");
        // Person person2 = new Person("Erik", "Range", "n.l@gmail.com", "0791234567");

        /*
        adressbook.countContacts();
        adressbook.addContact(person);
        adressbook.addContact(person2);
        adressbook.countContacts();
        adressbook.findContact("Peter", "Lustig");
        adressbook.findContact("Julia", "Traurig");
        adressbook.removeContact("n.l@gmail.com");
        adressbook.removeContact("ivan@gmail.com");
        adressbook.listContacts();
         */

        CreditCard creditCard = new CreditCard("123412341234", "08/24");
        User user = new User("Sodaba", "Bashiri", "sodaba.bashiri@gmail.com",creditCard, true, Payment.MONTHLY);

        StreamingService streamingService = new StreamingService();
        streamingService.amountOfSubscription();
        streamingService.registerUser(user);
        streamingService.deleteUser("hello@hello.ch");
        streamingService.getMovie("Silent Nights");
        streamingService.getMovie("No");
        streamingService.findMovieByGenre(Genre.ACTION);
        streamingService.findMovieByGenre(Genre.ROMANCE);
        streamingService.showViewsOfMovie("Silent Nights");
        streamingService.getCreditCards();
    }
}