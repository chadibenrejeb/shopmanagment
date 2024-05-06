abstract class BaseRecommenderSystem implements RecommenderSystem {
    String name;
    int version;

    BaseRecommenderSystem(String name, int version) {
        this.name = name;
        this.version = version;
    }
    
    abstract void displayDetails();
}
