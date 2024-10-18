import Payment.paymentCard;
import Payment.paymentMoney;
import Payment.paymentPix;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        paymentPix pix = new paymentPix();
        paymentMoney money = new paymentMoney();
        paymentCard card = new paymentCard();

        float number = random.nextInt(2000);

        System.out.println("O valor da conta é de: "+ number);
        System.out.println("Qual metodo de pagamento vc eseja utilizar ?\n1 - Pix\n2 - Dinheiro\n3 - Cartão");

        int x = sc.nextInt();

        switch (x){
            case 1:
                pix.payPix(number);
                break;
            case 2:
                money.payMoney(number);
                break;
            case 3:
                card.payCard(number);
                break;
            default:
                System.out.println("Metodo invalido, finalizando operação.");
        }


    }
}