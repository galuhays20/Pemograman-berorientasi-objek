/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar;

/**
 *
 * @author galuh
 */
public class Lingkaran {
    
    // atribut
    
    int jejari;
    double luas, phi= 3.14;
    
    //methods
    
    void hitungLuas(){
    
        int Luas = (int) (phi * jejari * jejari);
        System.out.println("Luas: " + Luas + " satuan luas");
    }
            
    void hitungKeliling(){
        
        int keliling =  (int) (2 * phi * jejari);
        System.out.println("Keliling: " + keliling + " satuan panjang");
    }
}

