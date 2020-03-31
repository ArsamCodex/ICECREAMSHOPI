package be.intecbrussel.application;

import be.intecbrussel.eatbles.Eatable;
import be.intecbrussel.eatbles.Magnum;
import be.intecbrussel.seller.IceCreamCar;
import be.intecbrussel.seller.IceCreamSalon;
import be.intecbrussel.seller.IceCreamSeller;
import be.intecbrussel.seller.PriceList;

public class forme {
    public static void main(String[] args) {

        PriceList priceList = new PriceList(2.30, 4.0, 5.0);

        IceCreamSalon iceCreamSeler = new IceCreamSalon();

        orderMethod(iceCreamSeler);


    }

    public static void orderMethod(IceCreamSeller iceCreamSeller) {


        PriceList priceList = new PriceList(4.10, 6.90, 1.50);
        Stock stock = new Stock(1, 1, 1, 1);
        IceCreamSeller seller = new IceCreamCar(priceList, stock);
        OrderCone(seller);
        OrderIceRocket(seller);
        OrderMagnum(seller);
        Profit(seller);

    }

    private static void Profit(IceCreamSeller seller) {
        System.out.println("profit is: " + seller.getProfit());
    }

    private static void OrderMagnum(IceCreamSeller seller) {
        Eatable magnum = seller.orderMagnum(Magnum.MagnumType.WHITECHOCOLATE);
        System.out.println(magnum);
    }

    private static void OrderIceRocket(IceCreamSeller seller) {
        Eatable rocket = seller.orderIceRocket();
        System.out.println(rocket);
    }

    private static void OrderCone(IceCreamSeller seller) {

        Eatable m = new Eatable() {
            @Override
            public void eat() {
                Eatable[] rockets = new Eatable[10];
                for (int i = 0; i < 10; i++) {

                    rockets[i] = OrderCone();



            }
        }
    }
