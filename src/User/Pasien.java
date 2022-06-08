/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import anti.anxiety.CatatanKonsultasi;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Qalbun Saliim Bakhri
 */
public class Pasien extends Users{
    
    private List<CatatanKonsultasi> catatan_konsultasi;

    public Pasien(String id_user, String username, String password, String email, String role, String nama, int usia, Date tgl_lahir, String alamat, String kota, String no_kontak, String status_login) {
        super(id_user, username, password, email, role, nama, usia, tgl_lahir, alamat, kota, no_kontak, status_login);
    }

//    public Pasien(String id_user, String username, String password, String email, String role, String nama, int usia, String tgl_lahir, String alamat, String kota, String no_kontak) throws ParseException {
//        super(id_user, username, password, email, role,  nama, usia, tgl_lahir, alamat, kota, no_kontak);
//        
//        catatan_konsultasi = new ArrayList<>();
//    }

    public List<CatatanKonsultasi> getCatatan_konsultasi() {
        return catatan_konsultasi;
    }

    public void setCatatan_konsultasi(List<CatatanKonsultasi> catatan_konsultasi) {
        this.catatan_konsultasi = catatan_konsultasi;
    }
    
    void tambah_catatan_konsultasi(CatatanKonsultasi catatan) {
        this.catatan_konsultasi.add(catatan);
    }
    
    public void tampilkanCatatan(int index){
        this.catatan_konsultasi.get(index).info();
    }

    
}
