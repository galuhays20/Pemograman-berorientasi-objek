/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author galuh
 */
public class ProjectLuasBangunKompleks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Project 01
        Lingkaran l = new Lingkaran();
        l.r = 21;
        int lingkaran = l.hitungLuas();
        
        Persegi p = new Persegi();
        p.sisi = 42;
        int persegi = p.hitungLuas();
        
        double LuasBangun = (lingkaran * 2) +persegi;
        System.out.println("Hasil luas bangun adalah :" + LuasBangun);
        
        //Project 02
        Lingkaran lb = new Lingkaran();
        lb.r = 28/2;
        int lingkaranBesar = lb.hitungLuas();
        
        Lingkaran lk = new Lingkaran();
        lk.r = 14/2;
        int lingkaranKecil = lk.hitungLuas();
        
        double LuasAbu = lingkaranBesar - lingkaranKecil;
        System.out.println("Luas daerah abu-abu adalah:" + LuasAbu);
    }
    
}