package com.mycompany.posttest11;

public class kelas {
    String ruang;
    String dosen;
    String matkul;
    float jam1;
    float jam2;
    
    public kelas (String matkul ,String ruang , float jam1, float jam2, String dosen){
        this.matkul = matkul;
        this.ruang = ruang;
        this.jam1 = jam1;
        this.jam2 = jam2;
        this.dosen = dosen;
    }
    
    public String getMatkul(){
        return matkul;
    }
    
    public String getRuang(){
        return ruang;
    }
    
    public float getJam1(){
        return jam1;
    }
    
    public float getJam2(){
        return jam2;
    }
    
    public String getDosen(){
        return dosen;
    }
}
