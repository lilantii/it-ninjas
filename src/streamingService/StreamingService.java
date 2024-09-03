package streamingService;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class StreamingService {
    Movie movie1 = new Movie(
            "Silent Nights",
            "Anna Kristensen",
            Duration.ofHours(1).plusMinutes(45),
            Genre.DRAMA,
            Language.DANISH,
            1
    );

    Movie movie2 = new Movie(
            "The Haunted Forest",
            "Lucio Vargas",
            Duration.ofHours(2).plusMinutes(10),
            Genre.HORROR,
            Language.SPANISH,
            32
    );

    Movie movie4 = new Movie(
            "Chasing Shadows",
            "Marta Novak",
            Duration.ofHours(1).plusMinutes(55),
            Genre.THRILLER,
            Language.CROATIAN,
            76
    );

    Movie movie5 = new Movie(
            "The Laughing Man",
            "Jean-Luc Dubois",
            Duration.ofHours(1).plusMinutes(30),
            Genre.COMEDY,
            Language.FRENCH,
            1000
    );

    Movie movie6 = new Movie(
            "Legends of the West",
            "John Marston",
            Duration.ofHours(2).plusMinutes(40),
            Genre.WESTERN,
            Language.ENGLISH,
            9087531
    );

    Movie movie7 = new Movie(
            "Whispers of the Old World",
            "Giovanni Rossi",
            Duration.ofHours(2).plusMinutes(5),
            Genre.FANTASY,
            Language.ITALIAN,
            1234
    );

    Movie movie8 = new Movie(
            "The Last Puzzle",
            "Gregor Müller",
            Duration.ofHours(2).plusMinutes(25),
            Genre.MYSTERY,
            Language.GERMAN,
            0
    );

    Movie movie9 = new Movie(
            "Night Watchers",
            "Paulo Mendes",
            Duration.ofHours(1).plusMinutes(50),
            Genre.ACTION,
            Language.PORTUGUESE,
            123124
    );

    Movie movie10 = new Movie(
            "Winter's End",
            "Katri Virtanen",
            Duration.ofHours(1).plusMinutes(35),
            Genre.DRAMA,
            Language.FINNISH,
            33
    );

    CreditCard creditCard1 = new CreditCard("1234567890", "08/27");
    CreditCard creditCard2 = new CreditCard("1234589535", "08/27");
    CreditCard creditCard3 = new CreditCard("9876543213", "08/27");
    CreditCard creditCard4 = new CreditCard("0987654321", "08/27");

    User user1 = new User("peter", "peter", "peter@peter.peter", creditCard1, true, Payment.MONTHLY);
    User user2 = new User("hans", "hans", "hans@hans.hans", creditCard2, true, Payment.MONTHLY);
    User user3 = new User("just", "doit", "hello@hello.ch", creditCard3, false, Payment.NONE);
    User user4 = new User("hannah", "sauer", "hello@bye.ch", creditCard4, true, Payment.YEARLY);

    List<Movie> movies = new ArrayList<>();
    List<User> users = new ArrayList<>();

    public StreamingService() {
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie4);
        movies.add(movie5);
        movies.add(movie6);
        movies.add(movie7);
        movies.add(movie8);
        movies.add(movie9);
        movies.add(movie10);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
    }

    public void amountOfSubscription() {
        int amount = 0;
        for (User user : users) {
            if (user.isHasSubscription()) {
                amount++;
            }
        }
        System.out.println("The amount of subscriptions is: " + amount);
    }

    public void registerUser(User user) {
        for (User user1 : users) {
            if (user1.getEmail().equals(user.getEmail())) {
                System.out.println("The user is already registered");
                return;
            }
        }
        users.add(user);
        System.out.println("New user added");
    }

    public void deleteUser(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                users.remove(user);
                System.out.println("User removed");
                return;
            }
        }
        System.out.println("The user is not registered");
    }

    public void getMovie(String title) {
        for (Movie movie : movies) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                System.out.println(movie);
                return;
            }
        }
        System.out.println("Movie not found");
    }

    public void findMovieByGenre(Genre genre) {
        for (Movie movie : movies) {
            if (movie.getGenre().equals(genre)) {
                System.out.println(movie);
                return;
            }
        }
        System.out.println("No movie found");
    }

    public void showViewsOfMovie(String movieTitle) {
        for (Movie movie : movies) {
            if (movie.getTitle().equalsIgnoreCase(movieTitle)) {
                System.out.println("Views: " + movie.getViews());
                return;
            }
        }
        System.out.println("Movie not found");
    }

    public void getCreditCards() {
        List<CreditCard> creditCards = new ArrayList<>();
        for (User user : users) {
            if (user.getPayment().equals(Payment.MONTHLY)) {
                creditCards.add(user.getCreditCard());
            }
        }
        System.out.println(creditCards);
    }
}
