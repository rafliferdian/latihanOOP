/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaisiswa;

/**
 *
 * @author WINDOWS 10
 */
public class kelulusan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //objek
        siswa pelajar = new siswa();
        
        //Pengisian atribut
        pelajar.nama = "Anya";
        pelajar.nilai = 80;
        
        //Menjalankan method
        pelajar.cetaknilai();
        
        //Menentukan lulus
        if(pelajar.lulus()){
            System.out.println("selamat anda lulus");
        }
        else if(pelajar.tidaklulus()){
            System.out.println("Anda harus belajar lebih giat lagi");
        } else {
        }
    }
    
}
