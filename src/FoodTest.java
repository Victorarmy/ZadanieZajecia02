public class FoodTest {
    public static void main(String[] args) {
        Food tuna = new Food();
        Food chicken = new Food();

        tuna.name = "Tuna";
        tuna.category = "Fish";
        tuna.calories = 256;
        tuna.fat = 15.7;
        tuna.protein = 23.3;
        tuna.carbohydrates = 4.0;

        chicken.name = "Chicken";
        chicken.category = "Meat";
        chicken.calories = 128;
        chicken.fat = 2.2;
        chicken.protein = 21.4;
        chicken.carbohydrates = 3.8;

        System.out.printf("Product name: %s\nProduct category: %s\nCalories: %.2f\n\tProtein: %.2f\n\tCarbohydrates: %.2f\n\tFat: %.2f\n\n", tuna.name, tuna.category, tuna.calories, tuna.protein, tuna.carbohydrates, tuna.fat);
        System.out.printf("Product name: %s\nProduct category: %s\nCalories: %.2f\n\tProtein: %.2f\n\tCarbohydrates: %.2f\n\tFat: %.2f\n\n", chicken.name, chicken.category, chicken.calories, chicken.protein, chicken.carbohydrates, chicken.fat);
    }
}
