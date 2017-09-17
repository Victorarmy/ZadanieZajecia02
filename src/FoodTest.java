public class FoodTest {
    public static void main(String[] args) {

        Food tuna = new Food("Tuna", "Fish", 256, 4.0, 15.7, 23.3);
        Food chicken = new Food("Chicken", "Meat", 128, 3.8, 2.2, 21.4);

        System.out.printf("Product name: %s\nProduct category: %s\nCalories: %.2f\n\tProtein: %.2f\n\tCarbohydrates: %.2f\n\tFat: %.2f\n\n", tuna.name, tuna.category, tuna.calories, tuna.protein, tuna.carbohydrates, tuna.fat);
        System.out.printf("Product name: %s\nProduct category: %s\nCalories: %.2f\n\tProtein: %.2f\n\tCarbohydrates: %.2f\n\tFat: %.2f\n", chicken.name, chicken.category, chicken.calories, chicken.protein, chicken.carbohydrates, chicken.fat);
    }
}
