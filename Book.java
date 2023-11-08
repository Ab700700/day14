public class Book extends Product {
    private String author;

    public Book() {
    }




    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    @Override
    public double getDiscount() {
        double dis = (super.getPrice()/100)*5;
        super.setPrice(super.getPrice()-dis);
        return super.getPrice();
    }
}
