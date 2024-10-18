package Payment;

public abstract class paymentService {
    abstract public void payPix(float number);
    abstract public void payMoney(float number);
    abstract public void payCard(float number);
}
