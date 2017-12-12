package com.k_inovationlabs.mylibrary;

/**
 * Created by 207-1 on 11/12/2017.
 */
public class User {
    private String email;
    private String pass;
    private String namalengkap;
    private String tlp;
    private Pinjaman pinjam;
    private Buku buku;
    private String idmember;

    private String[][] data = new String[][] {

            {"aprianto@gmail.com","anto","Aprianto","0852348673","0002"},
            {"agungashari@gmail.com","agung","Agung Ashari","086567578","0003"},
            {"ahmaderil@gmail.com","eril","Ahmad Eril","0852348673","0001"}


    };

    public void setData(String[][] data) {this.data =data;}

    public User(String email) {
        this.email = email;
        this.login();

    }

    public void setEmail(String email) {
        this.email = email;
        this.login();
    }

    public void setPass(String pass) {
        this.pass = pass;
        this.login();
    }

    private void login() {
        for(int i=0; i<this.data.length; i++){
            if(this.email.equals(this.data[i][0])) {
                this.pass = this.data[i][1];
                this.namalengkap = this.data[i][2];
                this.tlp = this.data[i][3];
                this.idmember = this.data[i][4];
            }
        }
    }

    public String getEmail() {
        return this.email;
    }



    public String getPass() {
        return pass;
    }



    public String getNamalengkap() {
        return namalengkap;
    }

    public void setNamalengkap(String namalengkap) {
        this.namalengkap = namalengkap;
    }

    public String getTlp() {
        return tlp;
    }

    public void setTlp(String tlp) {
        this.tlp = tlp;
    }

    public String getIdmember() {
        return idmember;
    }

    public void setIdmember(String idmember) {
        this.idmember = idmember;
    }
}
