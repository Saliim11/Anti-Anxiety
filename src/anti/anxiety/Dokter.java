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
public class Dokter {
    private String nama_dokter, alamat_dokter, no_kontak_dokter;

    public Dokter(String nama_dokter, String alamat_dokter, String no_kontak_dokter) {
        this.nama_dokter = "Dr. "+nama_dokter;
        this.alamat_dokter = alamat_dokter;
        this.no_kontak_dokter = no_kontak_dokter;
    }

    public String getNama_dokter() {
        return nama_dokter;
    }

    public void setNama_dokter(String nama_dokter) {
        this.nama_dokter = nama_dokter;
    }

    public String getAlamat_dokter() {
        return alamat_dokter;
    }

    public void setAlamat_dokter(String alamat_dokter) {
        this.alamat_dokter = alamat_dokter;
    }

    public String getNo_kontak_dokter() {
        return no_kontak_dokter;
    }

    public void setNo_kontak_dokter(String no_kontak_dokter) {
        this.no_kontak_dokter = no_kontak_dokter;
    }

    public void beriCatatanKonsultasi(Pasien pas1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
