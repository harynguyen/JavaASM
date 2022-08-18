package lab7.Exercise1;

import java.util.*;

public class MainCake {
    public static void main(String[] args){
//        orderCake oc1 = new orderCake("cake 1", 25, 2.5 );
//        orderCake oc2 = new orderCake("cake 2", 20, 1 );
//        orderCake oc3 = new orderCake("cake 3", 15, 3.2 );
//        orderCake oc4 = new orderCake("cake 4", 10, 4.4 );
//        orderCake oc5 = new orderCake("cake 5", 35, 2 );
//        readymadeCake rc1 = new readymadeCake ("cake 6", 13, 3);
//        readymadeCake rc2 = new readymadeCake ("cake 7", 20, 6);
//        readymadeCake rc3 = new readymadeCake ("cake 8", 14, 10);
//        readymadeCake rc4 = new readymadeCake ("cake 9", 12, 9);
//        readymadeCake rc5 = new readymadeCake ("cake 10", 10, 7);
//
//        Cake[] lstc = new Cake[10];
//        lstc[0] = oc1;
//        lstc[1] = oc2;
//        lstc[2] = oc3;
//        lstc[3] = oc4;
//        lstc[4] = oc5;
//        lstc[5] = rc1;
//        lstc[6] = rc2;
//        lstc[7] = rc3;
//        lstc[8] = rc4;
//        lstc[9] = rc5;
//        for (Cake cake : lstc) {
//            System.out.println(cake);
//        }
//        System.out.println("============================================================");
        Cake[] cakes = new Cake[20];
        Random random = new Random(20);
        for (int i = 0; i < cakes.length; i++) {
            if(i%2 == 0) {
               cakes[i] = new readymadeCake("Cake " + (i + 1), random.nextDouble()*20, random.nextInt(200));
            } else {
                cakes[i] = new orderCake("Cake " + (i + 1), random.nextDouble()*20, random.nextDouble()*10);
            }
        }
        for(Cake e : cakes) {
            System.out.println(e);
        }
        System.out.println("-------------------------------------------------------------------------------");
        double sum = 0;
        for(Cake e : cakes) {
            sum += e.calcPrice();
        }
        System.out.printf("Total price: %.2f\n", sum);
        System.out.println("-------------------------------------------------------------------------------");
         double totalQuantity = 0;
         for(Cake e : cakes) {
             if(e instanceof readymadeCake){
                 readymadeCake r = (readymadeCake)e;
                 totalQuantity += r.getQuantity();
             }
         }
        System.out.printf("Total quantity: " + totalQuantity);
         System.out.println("\n-------------------------------------------------------------------------------");
         List<Cake> cakes2 = Arrays.asList(cakes);
         Collections.sort(cakes2, new Comparator<Cake>() {
             @Override
             public int compare(Cake o1, Cake o2) {
              return o1.calcPrice() < o2.calcPrice()? 1 : -1;
             }
         });
        System.out.println(cakes2.get(0));
    }
}
