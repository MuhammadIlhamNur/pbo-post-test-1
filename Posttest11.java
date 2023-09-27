package com.mycompany.posttest11;

import java.util.ArrayList;

public class Posttest11 {

    public static void main(String[] args) {
        ArrayList<kelas> jadwal = new ArrayList();
        
        jadwal.add(new kelas ("PBO " ,"D402 " ,09.10f ,10.40f ,"Pak Putut"));
        jadwal.add(new kelas ("DDPL " ,"D402 " ,10.50f ,12.20f ,"Bu Islamiyah"));
        jadwal.add(new kelas ("DBD " ,"D309 " ,07.30f ,09.00f ,"Bu Islamiyah"));
        jadwal.add(new kelas ("RO " ,"C402 " ,09.10f ,10.40f ,"Bu Farida"));
        jadwal.add(new kelas ("DMJK " ,"C404 " ,07.30f ,09.00f ,"Pak Hario"));
        
        for (kelas Kelas : jadwal){
            String pernyataan = "Matkul " + Kelas.getMatkul() + "berada di ruangan " + Kelas.getRuang() + "dimulai pukul " + Kelas.getJam1() 
                    + " hingga " + Kelas.getJam2() + " dengan dosen " + Kelas.getDosen();
            System.out.println(pernyataan);
        }
    }
}
