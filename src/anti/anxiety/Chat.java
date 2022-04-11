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
public class Chat {
    private String id_chat;
    private String id_awal;
    private String id_tujuan;
    private String isi_chat;
    private Date tgl_waktu_chat;

    public Chat(String id_chat, String id_awal, String id_tujuan, String isi_chat) {
        this.id_chat = id_chat;
        this.id_awal = id_awal;
        this.id_tujuan = id_tujuan;
        this.isi_chat = isi_chat;
        this.tgl_waktu_chat = new Date();
    }

    public String getId_chat() {
        return id_chat;
    }

    public void setId_chat(String id_chat) {
        this.id_chat = id_chat;
    }

    public String getId_awal() {
        return id_awal;
    }

    public void setId_awal(String id_awal) {
        this.id_awal = id_awal;
    }

    public String getId_tujuan() {
        return id_tujuan;
    }

    public void setId_tujuan(String id_tujuan) {
        this.id_tujuan = id_tujuan;
    }

    public String getIsi_chat() {
        return isi_chat;
    }

    public void setIsi_chat(String isi_chat) {
        this.isi_chat = isi_chat;
    }

    public Date getTgl_waktu_chat() {
        return tgl_waktu_chat;
    }

    public void setTgl_waktu_chat(Date tgl_waktu_chat) {
        this.tgl_waktu_chat = tgl_waktu_chat;
    }
    
    
}
