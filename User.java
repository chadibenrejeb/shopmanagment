class User {
    String name;
    int[] purchaseHistory;

    User(String name, int[] purchaseHistory) {
        this.name = name;
        this.purchaseHistory = purchaseHistory;
    }

    String getName() {
        return name;
    }

    int[] getPurchaseHistory() {
        return purchaseHistory;
    }
}
