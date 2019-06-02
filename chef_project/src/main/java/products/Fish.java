package products;

public class Fish extends Product {

    public Fish(String productName, double calorieContent, double proteinContent) {
        setCategory("Рыба");
        setProductName(productName);
        setCalorieContent(calorieContent);
        setProteinContent(proteinContent);
    }
}
