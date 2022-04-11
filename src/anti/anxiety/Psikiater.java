/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anti.anxiety;

import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author Qalbun Saliim Bakhri
 */
public class Psikiater extends Users implements Dokter{
    
    Scanner sc = new Scanner(System.in);

    public Psikiater(String id_user, String username, String password, String email, String role, String nama, int usia, String tgl_lahir, String alamat, String kota, String no_kontak) throws ParseException {
        super(id_user, username, password, email, role, nama, usia, tgl_lahir, alamat, kota, no_kontak);
    }

    @Override
    public void beriCatatanKonsultasi(Pasien p) {
        System.out.println("Masukkan Catatan Konsultasi:");
        String catat_konsul = sc.nextLine();
        
        CatatanKonsultasi catatan = new CatatanKonsultasi("catatan456", super.getId_user(), p.getId_user(), super.getNama(), catat_konsul);
        
        p.tambah_catatan_konsultasi(catatan);
    }
    
}
