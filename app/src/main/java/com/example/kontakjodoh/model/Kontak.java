package com.example.kontakjodoh.model;

import java.io.Serializable;

public class Kontak implements Serializable {
    private String nama;
    private String about;
    private String photo;
    private String status;

    public String getR1() {
        return r1;
    }

    public void setR1(String r1) {
        this.r1 = r1;
    }

    public String getR2() {
        return r2;
    }

    public void setR2(String r2) {
        this.r2 = r2;
    }

    public String getR3() {
        return r3;
    }

    public void setR3(String r3) {
        this.r3 = r3;
    }

    public String getR4() {
        return r4;
    }

    public void setR4(String r4) {
        this.r4 = r4;
    }

    public String getR5() {
        return r5;
    }

    public void setR5(String r5) {
        this.r5 = r5;
    }

    private String r1;
    private String r2;
    private String r3;
    private String r4;
    private String r5, r6;


    public String getStatus() {
        return status;
    }

    void setStatus(String status) {
        this.status = status;
    }


    public String getNama() {
        return nama;
    }

    void setNama(String nama) {
        this.nama = nama;
    }

    public String getAbout() {
        return about;
    }

    void setAbout(String about) {
        this.about = about;
    }

    public String getPhoto() {
        return photo;
    }

    void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getR6() {
        return r6;
    }

    public void setR6(String r6) {
        this.r6 = r6;
    }
}
