import java.util.ArrayList;
import java.util.List;

class DummyRecommenderSystem extends BaseRecommenderSystem {
    private Product[] allProducts;

    DummyRecommenderSystem(String name, int version, Product[] allProducts) {
        super(name, version);
        this.allProducts = allProducts;
    }

    @Override
    public void train(User[] users) {
        // In a real implementation, training might involve analyzing user purchase history,
        // finding similarities between users, etc. For simplicity, we don't need this in a dummy system.
    }

    @Override
    public Product[] recommend(User user) {
        List<Product> recommendations = new ArrayList<>();

        // Find products that the user hasn't purchased
        for (Product product : allProducts) {
            boolean purchased = false;
            for (int productId : user.getPurchaseHistory()) {
                if (product.getId() == productId) {
                    purchased = true;
                    break;
                }
            }
            if (!purchased) {
                recommendations.add(product);
            }
        }

        return recommendations.toArray(new Product[0]);
    }

    @Override
    void displayDetails() {
        System.out.println("Recommender System: " + name);
        System.out.println("Version: " + version);
    }
}
