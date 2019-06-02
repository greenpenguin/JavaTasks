package products;

public class Dairy extends Product {

    public Dairy(String productName, double calorieContent, double proteinContent) {
        setCategory("Молочный продукт");
        setProductName(productName);
        setCalorieContent(calorieContent);
        setProteinContent(proteinContent);
    }
}
