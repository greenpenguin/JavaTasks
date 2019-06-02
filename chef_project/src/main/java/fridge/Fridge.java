package fridge;

import products.*;

import java.util.ArrayList;

public class Fridge {



    ArrayList<Vegetables> vegetablesList = new ArrayList<Vegetables>();
    ArrayList<Fruits> fruitsList = new ArrayList<Fruits>();
    ArrayList<Dairy> diaryList = new ArrayList<Dairy>();
    ArrayList<Meat> meatList = new ArrayList<Meat>();
    ArrayList<Fish> fishList = new ArrayList<Fish>();

    public void LookInTheFridge() {
        System.out.print("В холодильнике есть: \n");
        for (int i = 0; i < vegetablesList.size(); i++) {
            Vegetables vegetable = vegetablesList.get(i);
            System.out.print(vegetable.ToString());
        }

        for (int i = 0; i < fruitsList.size(); i++) {
            Fruits fruit = fruitsList.get(i);
            System.out.print(fruit.ToString());
        }

        for (int i = 0; i < diaryList.size(); i++) {
            Dairy diaryProduct = diaryList.get(i);
            System.out.print(diaryProduct.ToString());
        }

        for (int i = 0; i < meatList.size(); i++) {
            Meat meatProduct = meatList.get(i);
            System.out.print(meatProduct.ToString());
        }

        for (int i = 0; i < fishList.size(); i++) {
            Fish fishProduct = fishList.get(i);
            System.out.print(fishProduct.ToString());
        }
    }

    public void AddVegetable(Vegetables vegetable) {
        vegetablesList.add(vegetable);
    }

    public void AddVegetable(String productName, double calorieContent, double proteinContent) {
        Vegetables vegetable = new Vegetables(productName, calorieContent, proteinContent);
        vegetablesList.add(vegetable);
    }

    public Vegetables GetVegetableByName(String vegetableName) {
        int size = 0;
        if (size < vegetablesList.size()) {
            for (int i = 0; i < vegetablesList.size(); i++) {
                Vegetables vegetable = vegetablesList.get(i);
                if (vegetable.getProductName() == vegetableName) {
                    vegetablesList.remove(i);
                    return vegetable;

                } else {
                    size++;
                }
            }
        } else {
            System.out.print("Данный продукт отсутствует! \n");
        }
        return null;
    }

    public void AddFruits(Fruits fruit) {
        fruitsList.add(fruit);
    }

    public void AddFruits(String productName, double calorieContent, double proteinContent) {
        Fruits fruit = new Fruits(productName, calorieContent, proteinContent);
        fruitsList.add(fruit);
    }

    public Fruits GetFruitByName(String fruitName) {
        int size = 0;
        if (size < fruitsList.size()) {
            for (int i = 0; i < fruitsList.size(); i++) {
                Fruits fruit = fruitsList.get(i);
                if (fruit.getProductName() == fruitName) {
                    fruitsList.remove(i);
                    return fruit;

                } else {
                    size++;
                }
            }
        } else {
            System.out.print("Данный продукт отсутствует! \n");
        }
        return null;
    }

    public void AddDiaryProduct(Dairy diaryProduct) {
        diaryList.add(diaryProduct);
    }

    public void AddDiaryProduct(String productName, double calorieContent, double proteinContent) {
        Dairy diaryProduct = new Dairy(productName, calorieContent, proteinContent);
        diaryList.add(diaryProduct);
    }

    public Dairy GetDairyProductByName(String diaryProductName) {
        int size = 0;
        if (size < diaryList.size()) {
            for (int i = 0; i < diaryList.size(); i++) {
                Dairy diaryProduct = diaryList.get(i);
                if (diaryProduct.getProductName() == diaryProductName) {
                    diaryList.remove(i);
                    return diaryProduct;

                } else {
                    size++;
                }
            }
        } else {
            System.out.print("Данный продукт отсутствует! \n");
        }
        return null;
    }

    public void AddMeatProduct(Meat meatProduct) {
        meatList.add(meatProduct);
    }

    public void AddMeatProduct(String productName, double calorieContent, double proteinContent) {
        Meat meatProduct = new Meat(productName, calorieContent, proteinContent);
        meatList.add(meatProduct);
    }

    public Meat GetMeatProductByName(String meatProductName) {
        int size = 0;
        if (size <= meatList.size()) {
            for (int i = 0; i < meatList.size(); i++) {
                Meat meatProduct = meatList.get(i);
                if (meatProduct.getProductName() == meatProductName) {
                    meatList.remove(i);
                    return meatProduct;

                } else {
                    size++;
                }
            }
        } else {
            System.out.print("Данный продукт отсутствует! \n");
        }
        return null;
    }

    public void AddFishProduct(Fish fishProduct) {
        fishList.add(fishProduct);
    }

    public void AddFishProduct(String productName, double calorieContent, double proteinContent) {
        Fish fishProduct = new Fish(productName, calorieContent, proteinContent);
        fishList.add(fishProduct);
    }

    public Fish GetFishProductByName(String fishProductName) {
        int size = 0;
        if (size < fishList.size()) {
            for (int i = 0; i < fishList.size(); i++) {
                Fish fishProduct = fishList.get(i);
                if (fishProduct.getProductName() == fishProductName) {
                    fishList.remove(i);
                    return fishProduct;

                } else {
                    size++;
                }
            }
        } else {
            System.out.print("Данный продукт отсутствует! \n");
        }
        return null;
    }
}

