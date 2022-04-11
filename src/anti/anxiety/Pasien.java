/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anti.anxiety;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Qalbun Saliim Bakhri
 */
public class Pasien {
    private String nama_pasien;
    private List<CatatanKonsultasi> catatan_konsultasi;

    public Pasien(String nama_pasien) {
        this.nama_pasien = nama_pasien;
        
        this.catatan_konsultasi = new ArrayList<CatatanKonsultasi>();
        
    }

    public String getNama_pasien() {
        return nama_pasien;
    }

    public void setNama_pasien(String nama_pasien) {
        this.nama_pasien = nama_pasien;
    }

    public List<CatatanKonsultasi> getCatatan_konsultasi() {
        return catatan_konsultasi;
    }

    public void setCatatan_konsultasi(List<CatatanKonsultasi> catatan_konsultasi) {
        this.catatan_konsultasi = catatan_konsultasi;
    }

    public void tambah_catatan_konsultasi(CatatanKonsultasi catatan_konsultasi) {
        this.catatan_konsultasi.add(catatan_konsultasi);
    }
    
    public void tampilkanCatatan(int index){
        this.catatan_konsultasi.get(index).info();
    }
}
