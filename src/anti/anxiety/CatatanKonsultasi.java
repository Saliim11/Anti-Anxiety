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
    private String nama_psikolog, isi_catatan;
    private Date tgl_catatan;

    public CatatanKonsultasi(String nama_psikolog, String isi_catatan) {
        this.nama_psikolog = nama_psikolog;
        this.isi_catatan = isi_catatan;
        this.tgl_catatan = new Date();
    }

    public String getNama_psikolog() {
        return nama_psikolog;
    }

    public void setNama_psikolog(String nama_psikolog) {
        this.nama_psikolog = nama_psikolog;
    }

    public String getIsi_catatan() {
        return isi_catatan;
    }

    public void setIsi_catatan(String isi_catatan) {
        this.isi_catatan = isi_catatan;
    }

    public Date getTgl_catatan() {
        return tgl_catatan;
    }

    public void setTgl_catatan(Date tgl_catatan) {
        this.tgl_catatan = tgl_catatan;
    }
    
    public void info(){
        System.out.println("Nama Psikolog\t: "+this.nama_psikolog);
        System.out.println("Tanggal Diberi\t: "+this.tgl_catatan);
        System.out.println("Catatan:\n"+this.isi_catatan);
    }
    
    
}
