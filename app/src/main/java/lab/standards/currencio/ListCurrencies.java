package lab.standards.currencio;

public class ListCurrencies {
    private String country;
    private String currency;
    private String price;
    private int image;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public ListCurrencies(String country, String currency, String price, int image) {
        this.country = country;
        this.currency = currency;
        this.price = price;
        this.image = image;
    }
}
