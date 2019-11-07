/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116584_latihan48_kalkulator;

/**
 *
 * @author
 * NIM : 10116584
 * NAMA : Muhammad Syahrun dalu
 */
public class PBOUlang_10116584_Latihan48_Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       kalkulator x = new kalkulator();
       x.setValue1(7);
       x.setValue2(5);
       
       System.out.println("VALUE 1 = "+x.getValue1());
       System.out.println("VALUE 2 = "+x.getValue2());
       x.setNameProject();
       x.setNoteProject("This Project Shown you how to manage methode in java");
       System.out.println("Result Add is = "+x.add(x.getValue1(), x.getValue2()));
       System.out.println("Result Minus is = "+x.minus(x.getValue1(), x.getValue2()));        
       System.out.println("Result Multiple is = "+x.multiplication(x.getValue1(), x.getValue2()));
       System.out.println("Result Division is = "+x.division(x.getValue1(), x.getValue2()));
    }
    
}
