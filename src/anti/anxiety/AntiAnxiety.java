/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anti.anxiety;

/**
 *
 * @author Qalbun Saliim Bakhri
 */
public class AntiAnxiety {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dokter dok;
        dok = new Psikolog("Rizky Ramdhan Nugraha", "jl Buah batu", "08xxxxxxxx");
        
        Pasien pas1 = new Pasien("Alek");
        
        dok.beriCatatanKonsultasi(pas1);
        
        pas1.getCatatan_konsultasi().get(0).info();
    }
    
}
