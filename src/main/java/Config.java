class Config {
    public String getUrl() {
        return "jdbc:mysql://localhost:3306/adlister_db?allowPublicKeyRetrieval=true&useSSL=false";
    }
    public String getUser() {
        return "luke";
    }
    public String getPassword() {
        return "kara1";
    }
}



//    Create a class named Config.java that will hold our database configuration This class should have three public methods, getUrl, getUsername, and getPassword, all of which should return strings for those properties.