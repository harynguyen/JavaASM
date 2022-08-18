package com.lec16;

import com.lec19.Emp;
import com.lec19.SalariedEmp;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        BasicEmp b1 = new BasicEmp("Ngoan", "Huynh", "123", 450, 2.0, -67);
//        System.out.println(b1);
        SalariedEmp s1 = new SalariedEmp("Ngoan", "Huynh", "123", 2000);
        SalariedEmp s2 = new SalariedEmp("Anh", "Nguyen", "123", 2000);
        SalariedEmp s3 = new SalariedEmp("Xuan", "Tran", "123", 2000);
        CommissionEmp c1 = new CommissionEmp("John", "Sue", "456", 1500.0, 0.4);
        CommissionEmp c2 = new CommissionEmp("Stuart", "Smith", "456", 500.0, 0.5);
        CommissionEmp c3 = new CommissionEmp("Angel", "Bonds", "456", 1000.0, 0.4);
        BasicEmp b1 = new BasicEmp("Jame", "Bonds", "789", 133, 0.9, 1200);

        Emp[] lstEmp = new Emp[3];
        lstEmp[0] = s1;
        lstEmp[1] = c1;
        //lstEmp[2] = b1;

        for (Emp e : lstEmp) {
            System.out.println(e);
        }
        System.out.println("================================================");
        List<SalariedEmp> lstSa = new ArrayList<>();
        lstSa.add(s1);
        lstSa.add(s2);
        lstSa.add(s3);

        Collections.sort(lstSa);
        for (SalariedEmp se : lstSa) {
            System.out.println(se.getFname());
        }
        System.out.println("================================================================");
        List<CommissionEmp> lstCo = new ArrayList<>();
//        lstCo.add(c1);
//        lstCo.add(c2);
//        lstCo.add(c3);
//        Collections.sort(lstCo, new Comparator<CommissionEmp>() {
//            @Override
//            public int compare(CommissionEmp o1, CommissionEmp o2) {
////                return o1.getGrossSale() < o2.getGrossSale() ? 1 : -1;
//                //Sort DESC
//                int cr = o2.getCommisRate().compareTo(o2.getCommisRate());
//                if (cr != 0) {
//                    return cr;
//                } else {
//                    return o1.getGrossSale().compareTo(o2.getGrossSale());
//                }
//            }
//        });
        for (CommissionEmp ce : lstCo) {
            System.out.println(ce.getFname()+ " " +ce.getLname()+ " " +ce.getSsnb() +" " +ce.getGrossSale());
        }

    }
}
