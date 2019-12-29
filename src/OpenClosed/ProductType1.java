package OpenClosed;

public class ProductType1 extends Product{

    @Override
    public double GetDiscount() {
        return (getPrice()/100)*10;
    }
}
