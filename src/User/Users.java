/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import anti.anxiety.Chat;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Qalbun Saliim Bakhri
 */
public class Users {
    private String id_user;
    private String username;
    private String password;
    private String email;
    private String role;
    private String nama;
    private int usia;
    private Date tgl_lahir;
    private String alamat;
    private String kota;
    private String no_kontak;
    private String status_login;
    private List<Chat> listChat;

//    public Users(String id_user, String username, String password, String email, String role, String nama, int usia, String tgl_lahir, String alamat, String kota, String no_kontak) throws ParseException {
//        this.id_user = id_user;
//        this.username = username;
//        this.password = password;
//        this.email = email;
//        
//        this.nama = nama;
//        this.usia = usia;
//        
//        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//        this.tgl_lahir = (Date)formatter.parse(tgl_lahir);
//        
//        this.alamat = alamat;
//        this.kota = kota;
//        this.no_kontak = no_kontak;
//        this.status_login = true;
//        listChat = new ArrayList<>();
//    }

    public Users(String id_user, String username, String password, String email, String role, String nama, int usia, Date tgl_lahir, String alamat, String kota, String no_kontak, String status_login) {
        this.id_user = id_user;
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
        this.nama = nama;
        this.usia = usia;
        this.tgl_lahir = tgl_lahir;
        this.alamat = alamat;
        this.kota = kota;
        this.no_kontak = no_kontak;
        this.status_login = status_login;
        listChat = new ArrayList<>();
    }

    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public Date getTgl_lahir() {
        return tgl_lahir;
    }

    public void setTgl_lahir(Date tgl_lahir) {
        this.tgl_lahir = tgl_lahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getNo_kontak() {
        return no_kontak;
    }

    public void setNo_kontak(String no_kontak) {
        this.no_kontak = no_kontak;
    }

    public String getStatus_login() {
        return status_login;
    }

//    public boolean isStatus_login() {
//        return status_login;
//    }
//
//    public void setStatus_login(boolean status_login) {
//        this.status_login = status_login;
//    }
    public void setStatus_login(String status_login) {
        this.status_login = status_login;
    }

    public List<Chat> getListChat() {
        return listChat;
    }

    public void setListChat(List<Chat> listChat) {
        this.listChat = listChat;
    }
}
