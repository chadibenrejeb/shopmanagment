interface RecommenderSystem {
    void train(User[] users);
    Product[] recommend(User user);
}

