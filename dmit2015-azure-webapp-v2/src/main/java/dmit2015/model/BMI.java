package dmit2015.model;

/**
 * This class calculates a person's body mass index (BMI) and their BMI Category
 * @author Christopher Glinka
 * @version 2023/01/23
 */
public class BMI {
    private int weight;
    private int height;

    public int getWeight() {
        return weight;
    }

    /**
     * Change the weight for the calculation
     * @param weight the new weight for the calculation
     */
    public void setWeight(int weight) {
        if ( weight <= 0) {
            throw new RuntimeException("Weight must be a positive non-zero number");
        }
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    /**
     * Change the height for the calculation
     * @param height the new height for the calculation
     */
    public void setHeight(int height) {
        if ( height <= 0) {
            throw new RuntimeException("Height must be a positive non-zero number");
        }
        this.height = height;
    }

    public BMI() {
        setWeight(1);
        setHeight(1);
    }

    public BMI(int weight, int height) {
        //this.weight = weight;
        setWeight(weight);
        //this.height = height;
        setHeight(height);
    }

    /**
     * Calculate the body mass index (BMI) using the weight and height of the person.
     * The BMI of a person is calculated using the formula: BMI = 703 * weight / (height * height)
     * where weight is in pounds and height is in inches.
     * @return the body mass index (BMI) value of the person
     */
    public double bmi() {
        return 703 * weight / Math.pow(height, 2);
    }

    /**
     * Determines the BMI Category of the person using their BMI value and comparing it against the following:
     * <table>
     *     <thead>
     *         <tr>
     *             <th>BMI Range</th>
     *             <th>BMI Category</th>
     *         </tr>
     *     </thead>
     *     <tbody>
     *         <tr>
     *             <td>less than 18.5</td>
     *             <td>underweight</td>
     *         </tr>
     *         <tr>
     *             <td>from 18.5 to 24.9</td>
     *             <td>normal</td>
     *         </tr>
     *         <tr>
     *             <td>from 25 to 29.9</td>
     *             <td>overweight</td>
     *         </tr>
     *         <tr>
     *             <td>30 and over</td>
     *             <td>obese</td>
     *         </tr>
     *     </tbody>
     * </table>
     * @return one of the following: underweight, normal, overweight, obese
     */
    public static void bmiCategory(String[] args) {
        double bmi = 0.1;
        BMI currentBMI = new BMI();

        currentBMI.setWeight(150);
        currentBMI.setHeight(150);

        // If BMI is LESS THAN 18.5 == underweight
        if (bmi < 18.5) {
            // todo
        }

        // If BMI is GREATER THAN or EQUAL TO 18.5 and is LESS THAN or EQUAL TO 24.9 == normal
        if (bmi >= 18.5 && bmi <= 24.9) {
            // todo
        }

        // If BMI is GREATER THAN or EQUAL TO 25 and is LESS THAN or EQUAL TO 29.9 == overweight
        if (bmi >= 25 && bmi <= 29.9) {
            // todo
        }

        // If BMI is GREATER THAN or EQUAL TO 30 == obese
        if (bmi >= 30) {
            // todo
        }
    }
}

