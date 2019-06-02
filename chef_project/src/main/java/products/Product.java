package products;

public abstract class Product {

    private String category;
    private String productName;
    private double calorieContent;
    private double proteinContent;

    protected Product() {};

    protected Product(String ctgr, String pName, double cContent, double pContent) {
        this.category = ctgr;
        this.productName = pName;
        this.calorieContent = cContent;
        this.proteinContent = pContent;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getCalorieContent() {
        return calorieContent;
    }

    public void setCalorieContent(double calorieContent) {
        this.calorieContent = calorieContent;
    }

    public double getProteinContent() {
        return proteinContent;
    }

    public void setProteinContent(double proteinContent) {
        this.proteinContent = proteinContent;
    }

    public String ToString()
    {
        return "Категория продукта: " + getCategory() + ", название: " + getProductName() +
                ", калорийность: " + getCalorieContent() + ", содержание белка: " + getProteinContent() + "\n";
    }
}
