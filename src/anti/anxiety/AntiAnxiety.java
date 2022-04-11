/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anti.anxiety;

import java.text.ParseException;

/**
 *
 * @author Qalbun Saliim Bakhri
 */
public class AntiAnxiety {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        Psikolog dok1 = new Psikolog("456", "Rizky117", "******", "rizky@anxiety.com", "Psikolog", "Rizky Ramdhan Nugraha", 21, "2001-05-7", "Jl. Buah batu", "Bandung", "0852485762");
        Pasien pas1 = new Pasien("123", "alek_alok", "****", "alek@anxiety.com", "Pasien", "Alek", 20, "2002-03-11", "jl. dayeuh", "Bogor", "08123456");
        
        dok1.beriCatatanKonsultasi(pas1);
        
        pas1.tampilkanCatatan(0);
        
    }
    
}
