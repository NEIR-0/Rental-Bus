/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas;

/**
 *
 * @author aalij
 */
public class Makanan {
    public String makanan;
    public Double TotalM, TotalMakanan;
    public int Hmakanan1, Hmakanan2, Hmakanan3, Hmakanan4, JHm1, JHm2, JHm3, JHm4;
    public int totalm1, totalm2, totalm3, totalm4;

    public int getTotal1() {
        totalm1 = Hmakanan1*JHm1;
        return totalm1;
    }
    public void setTotal1(int val) {
        totalm1 = val;
    }
    
    public int getTotal2() {
        totalm2 = Hmakanan2*JHm2;
        return totalm2;
    }
    public void setTotal2(int val) {
        totalm2 = val;
    }
    
    public int getTotal3() {
        totalm3 = Hmakanan3*JHm3;
        return totalm3;
    }
    public void setTotal3(int val) {
        totalm3 = val;
    }
    
    public int getTotal4() {
        totalm4 = Hmakanan4*JHm4;
        return totalm4;
    }
    public void setTotal4(int val) {
        totalm4 = val;
    }

    public int getJHm1() {
        return JHm1;
    }

    public void setJHm1(int val) {
        JHm1 = val;
    }
    
    public int getJHm2() {
        return JHm2;
    }

    public void setJHm2(int val) {
        JHm2 = val;
    }
    
    public int getJHm3() {
        return JHm3;
    }

    public void setJHm3(int val) {
        JHm3 = val;
    }
    
    public int getJHm4() {
        return JHm4;
    }

    public void setJHm4(int val) {
        JHm4 = val;
    }
    
    public double getHmakanan1() {
        Hmakanan1 = Hmakanan1*JHm1;
        return Hmakanan1;
    }

    public void setHmakanan1(int val) {
        Hmakanan1 = val;
    }
    
    public double getHmakanan2() {
        Hmakanan2 = Hmakanan2*JHm2;
        return Hmakanan2;
    }

    public void setHmakanan2(int val) {
        Hmakanan2 = val;
    }
    
    public double getHmakanan3() {
        Hmakanan3 = Hmakanan3*JHm3;
        return Hmakanan3;
    }

    public void setHmakanan3(int val) {
        Hmakanan3 = val;
    }
    
    public double getHmakanan4() {
        return Hmakanan4;
    }

    public void setHmakanan4(int val) {
        Hmakanan1 = val;
    }

    public String getMakanan() {
        return makanan;
    }

    public void setMakanan(String val) {
        makanan = val;
    }

    
    public void SeleksiMakanan(){
        if(makanan.equalsIgnoreCase("Pop mie (mini)")){
            Hmakanan1= 7000;
        }
        else if(makanan.equalsIgnoreCase("Pop mie (original)")){
            Hmakanan2 = 10000;
        }
        else if(makanan.equalsIgnoreCase("Nasi paket")){
            Hmakanan3 = 25000;
        }
        else if(makanan.equalsIgnoreCase("Nasi goreng")){
            Hmakanan4 = 20000;
        }
        else{
            TotalM = 0.0;
        }
        
    }
    public double getTotalM() {
        TotalM = (double)totalm1+totalm2+totalm3+totalm4;
        return TotalM;
    }
    
    public void TotalMakanan(){
        TotalMakanan = TotalM;
    }
    
    public void MReset(){
        Hmakanan1 = 0; 
        Hmakanan2 = 0;
        Hmakanan3 = 0;
        Hmakanan4 = 0; 
        JHm1 = 0;
        JHm2 = 0;
        JHm3 = 0; 
        JHm4 = 0;
        totalm1 = 0;
        totalm2 = 0; 
        totalm3 = 0; 
        totalm4 = 0;
    }
    
    public void POReset(){
        totalm1 = 0; 
    }
    
    public void PMReset(){
        totalm2 = 0; 
    }
    
    public void NPReset(){
        totalm3 = 0; 
    }  
    public void NGReset(){
        totalm4 = 0; 
    } 
    
    
}
