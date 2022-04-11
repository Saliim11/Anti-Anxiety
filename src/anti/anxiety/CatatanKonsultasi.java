/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anti.anxiety;

import java.util.Date;

/**
 *
 * @author Qalbun Saliim Bakhri
 */
public class CatatanKonsultasi {
    private String id_catatan;
    private String id_dokter;
    private String id_pasien;
    private String nama_dokter;
    private Date tgl_waktu_catatan;
    private String isi_catatan;

    public CatatanKonsultasi(String id_catatan, String id_dokter, String id_pasien, String nama_dokter, String isi_catatan) {
        this.id_catatan = id_catatan;
        this.id_dokter = id_dokter;
        this.id_pasien = id_pasien;
        this.nama_dokter = nama_dokter;
        this.tgl_waktu_catatan = new Date();
        this.isi_catatan = isi_catatan;
    }

    public String getId_catatan() {
        return id_catatan;
    }

    public void setId_catatan(String id_catatan) {
        this.id_catatan = id_catatan;
    }

    public String getId_dokter() {
        return id_dokter;
    }

    public void setId_dokter(String id_dokter) {
        this.id_dokter = id_dokter;
    }

    public String getId_pasien() {
        return id_pasien;
    }

    public void setId_pasien(String id_user) {
        this.id_pasien = id_user;
    }

    public String getNama_dokter() {
        return nama_dokter;
    }

    public void setNama_dokter(String nama_dokter) {
        this.nama_dokter = nama_dokter;
    }

    public Date getTgl_waktu_catatan() {
        return tgl_waktu_catatan;
    }

    public void setTgl_waktu_catatan(Date tgl_waktu_catatan) {
        this.tgl_waktu_catatan = tgl_waktu_catatan;
    }

    public String getIsi_catatan() {
        return isi_catatan;
    }

    public void setIsi_catatan(String isi_catatan) {
        this.isi_catatan = isi_catatan;
    }
    
    public void info(){
        System.out.println("Nama Dokter\t: "+this.nama_dokter);
        System.out.println("Tanggal Diberi\t: "+this.tgl_waktu_catatan);
        System.out.println("Catatan:\n"+this.isi_catatan);
    }
    
    
}
