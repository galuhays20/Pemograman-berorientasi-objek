/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject1;

/**
 *
 * @author galuh
 */
public class Persegi {
    int sisi;
    
    
    void hitungLuas (){
        int luas = this.sisi * this.sisi;
        System.out.println("luasnya adalah " + luas);
    }
    void hitungKelilng(){
        int keliling = this.sisi * 4;
        System.out.println("Kelilingnya adalah :" + keliling);
    }
    public static void main(String[] args){
        persegi p1 = new persegi();
        p1.sisi = 5;
        
    }
}
