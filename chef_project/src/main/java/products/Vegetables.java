package products;

public class Vegetables extends Product {

    public Vegetables(String productName, double calorieContent, double proteinContent) {
        setCategory("Овощ");
        setProductName(productName);
        setCalorieContent(calorieContent);
        setProteinContent(proteinContent);
    }

}
