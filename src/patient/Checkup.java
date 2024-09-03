package patient;

public class Checkup {

    public void checkUp(Patient patient) {
        System.out.println("Checking up...");
        System.out.println("Patient name: " + patient.getName());
        System.out.println("Patient height: " + patient.getHeight());
        System.out.println("Patient weight: " + patient.getWeight());
        System.out.println("Patient temperature: " + patient.getTemperature());

        String isVaccinated;
        isVaccinated = patient.isVaccinated() ? "Yes" : "No";

        System.out.println("Patient isVaccinated: " + isVaccinated);
    }
}
