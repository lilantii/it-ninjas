package patient;

public class Patient {
    private String name;
    private int height;
    private int weight;
    private float temperature;
    private boolean isVaccinated;

    public Patient(String name, int height, int weight, float temperature, boolean isVaccinated) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.temperature = temperature;
        this.isVaccinated = isVaccinated;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public float getTemperature() {
        return temperature;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }
}

