public class BMITracker {

    private double weight;
    private double height;
    private double bmi;
    private String classification;

    BMITracker(double weight, double height) {
        this.weight = weight;
        this.height = height;
        calculateBMI();
        classifyBMI();
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
        calculateBMI();
        classifyBMI();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        calculateBMI();
        classifyBMI();
    }

    public double getBmi() {
        return bmi;
    }

    public String getClassification() {
        return classification;
    }

    private void calculateBMI() {
        if (height <= 0) {
            throw new IllegalArgumentException("Height Must be greater than zero");
        }
        this.bmi = weight / (height * height);
    }

    private void classifyBMI() {
        if (bmi < 18.5)
            classification = "underwieght";
        else if (bmi >= 18.5 && bmi < 24.9)
            classification = "normal weight";
        else if (bmi >= 25 && bmi < 29.9)
            classification = "overweight";
        else
            classification = "obese";
    }

    @Override
    public String toString() {
        return String.format("Weight: %.2f kg, Height: %.2f m, BMI: %.2f (%s)", weight, height, bmi, classification);
    }
}
