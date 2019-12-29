package OpenClosed;

public class ProductType2 extends Product{

    @Override
    public double GetDiscount() {
        return (getPrice()/100)*15;
    }
}
