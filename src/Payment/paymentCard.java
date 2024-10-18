package Payment;

import java.util.Scanner;

public class paymentCard extends paymentService{
    Scanner sc = new Scanner(System.in);

    @Override
    public void payPix(float number) {

    }

    @Override
    public void payMoney(float number) {

    }

    @Override
    public void payCard(float number) {
        double total = number * 0.95;
        System.out.println("No cartão nos damos um desconto de 5% portanto sua conta fica no valor de: " + total + "\nDeseja efetuar o pagamento ?\n1 - Sim  2 - Não");
        int y = sc.nextInt();
        String result = y == 1 ? "Pagamento efetuado, finalizando operação." : "O pagamento nao foi efetuado, finalizando operação.";
        System.out.println(result);
    }
}

