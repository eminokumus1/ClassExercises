package Company;

public class Product {
    private String productName;
    private java.util.Calendar saleDate;
    private double price;

    public Product(String sName, java.util.Calendar sDate, double price) {
        setProductName(sName);
        setSaleDate(sDate);
        this.setPrice(price);
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public java.util.Calendar getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(java.util.Calendar saleDate) {
        this.saleDate = saleDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Product[productName=" + productName + ",transactionDate=" + saleDate + ",price=" + price + "]";
    }
}
