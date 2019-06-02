package products;

public class Meat extends Product {

    public Meat(String productName, double calorieContent, double proteinContent) {
        setCategory("Мясо");
        setProductName(productName);
        setCalorieContent(calorieContent);
        setProteinContent(proteinContent);
    }
}
