public class Product {
    private double price;

    public Product(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public double applycoupon(double couponValue){
        if(couponValue >= 0 ){
            price -= couponValue;
            return price;
        }
        else {
            System.out.println("Invalid coupon value");
            return price;
        }
    }

    public double applyDiscount(double discountPercentage){
        if(discountPercentage >=0 && discountPercentage <= 100){
            double discountAmount = (discountPercentage / 100) * price;
            price -= discountAmount;
            return price;
        }
        else{
            System.out.println("Discount percentage must be between 0 and 100");
            return price;
        }
    }

    public double increasePrice(double amount){
        if(amount >= 0){
            price += amount;
            return price;
        }
        else{
            System.out.println("amount must be non-negative");
            return price;
        }
    }

}
