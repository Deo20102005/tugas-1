package project.pkg1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC-A-30
 */
public class ARITMATIKA {
    
        private double Hasil;

                public void Tambah(double bil1, double bil2){
                    this.Hasil = bil1 + bil2;
                }
                public void Kurang(double bil1, double bil2){
                    this.Hasil = bil1 - bil2;
                } 
                public void Kali(double bil1, double bil2){
                    this.Hasil = bil1 * bil2;
                } 
                public void Bagi(double bil1, double bil2){
                    this.Hasil = bil1 / bil2;
                } 

                public double GetHasil(){
                    return this.Hasil;
                }
}

