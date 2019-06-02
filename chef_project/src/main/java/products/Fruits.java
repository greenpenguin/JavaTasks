package products;

public class Fruits extends Product {

    public Fruits(String productName, double calorieContent, double proteinContent) {
        setCategory("Фрукт");
        setProductName(productName);
        setCalorieContent(calorieContent);
        setProteinContent(proteinContent);
    }

}
