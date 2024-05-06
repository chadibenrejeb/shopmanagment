public class Exercise2 {
    public static void main(String[] args) {
        User[] users = generateUsers();
        Product[] products = generateProducts();
        DummyRecommenderSystem recommenderSystem = new DummyRecommenderSystem("DummyRS", 1 , products);
        recommenderSystem.train(users);
        recommenderSystem.displayDetails();
        for (User user : users) {
            System.out.println("Recommendations for " + user.getName() + ":");
            Product[] recommendations = recommenderSystem.recommend(user);
            for (Product product : recommendations) {
                System.out.println(product.getName() + " - $" + product.getPrice());
            }
            System.out.println();
        }
    }

    private static User[] generateUsers() {
        User[] users = new User[3];
        users[0] = new User("User1", new int[]{1, 3});
        users[1] = new User("User2", new int[]{2, 3, 4});
        users[2] = new User("User3", new int[]{1, 4});
        return users;
    }

    private static Product[] generateProducts() {
        Product[] products = new Product[4];
        products[0] = new Product(1, "Product1", 10.0);
        products[1] = new Product(2, "Product2", 15.0);
        products[2] = new Product(3, "Product3", 20.0);
        products[3] = new Product(4, "Product4", 25.0);
        return products;
    }
}
