package dishes;

import products.Product;

import java.util.ArrayList;

public abstract class Dish {

    private String category;
    private String dishName;
    private ArrayList<Product> productList;
    private double sumCalorieContent;
    private double sumProteinContent;

    protected Dish() {};

    public Dish(String category, String dishName, ArrayList<Product> productList) {
        this.category = category;
        this.dishName = dishName;
        this.productList = productList;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public double getSumCalorieContent() {
        return sumCalorieContent;
    }

    public double setSumCalorieContent(ArrayList<Product> productList) {
        double sumCalorieContent = 0;

        for (int i = 0; i < productList.size(); i++) {
            Product product = productList.get(i);
            sumCalorieContent += product.getCalorieContent();

        }

        return sumCalorieContent;
    }

    public double setSumProteinContent(ArrayList<Product> productList) {

        double sumProteinContent = 0;
        for (int i = 0; i < productList.size(); i++) {
            Product product = productList.get(i);

            sumProteinContent += product.getProteinContent();
        }

        return sumProteinContent;
    }

    public double getSumProteinContent() {
        return sumProteinContent;
    }

    public String ToString()
    {
        String products = "Использованные продукты: \n";
        for (int i = 0; i < productList.size(); i++) {
            Product product = productList.get(i);
            products += product.ToString();
        }
        String dishCalorieContent = String.format("%.2f", setSumCalorieContent(productList));
        String dishProteinContent = String.format("%.2f", setSumProteinContent(productList));
        return "Категория блюда: " + getCategory() + ", название: " + getDishName() + "\n" + products +
                "калорийность: " + dishCalorieContent + ", содержание белка: " + dishProteinContent + "\n";
    }
}
