/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anti.anxiety;

import java.util.Scanner;

/**
 *
 * @author Qalbun Saliim Bakhri
 */
public class Psikolog extends Dokter{
    Scanner sc= new Scanner(System.in);
    
    public Psikolog(String nama_dokter, String alamat_dokter, String no_kontak_dokter) {
        super(nama_dokter, alamat_dokter, no_kontak_dokter);
    }
    
    @Override
    public void beriCatatanKonsultasi(Pasien p){
        System.out.println("Masukkan Catatan Konsultasi:");
        String catat_konsul = sc.nextLine();
        
        CatatanKonsultasi catatan = new CatatanKonsultasi(super.getNama_dokter(), catat_konsul);
        
        p.tambah_catatan_konsultasi(catatan);
    }
    
}
