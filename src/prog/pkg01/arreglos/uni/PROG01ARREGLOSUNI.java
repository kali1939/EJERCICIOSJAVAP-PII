/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog.pkg01.arreglos.uni;

/**
 *
 * @author Sergio
 */
public class PROG01ARREGLOSUNI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //[]
        int a[] = new int[100];
        int b[] = {1, 2, 3, 4, 5,};
        char c[] = {'h', 'o', 'l', 'a', 's'};
        double d[] = {10.3, 34, 5};
        String nombre = "Ismael";
        System.out.println(d[0]);
        System.out.println(d[1]);
        int i;
        for (i = 1; i < 100; i++) {
            a[i] = i;
            System.out.println(a[i]);
        }
        for (i=0; i<5; i++)
        {
        System.out.println(b[i]);
        System.out.println(c[i]);
        }
        System.out.println(a.length);
        System.out.println(b.length);
        System.out.println(c.length);
        nombre.toCharArray();
        System.out.println(nombre.length());     
    }

}
