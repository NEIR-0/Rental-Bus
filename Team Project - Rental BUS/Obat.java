/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas;

/**
 *
 * @author aalij
 */
public class Obat {
    public String obat;
    public Double TotalO;
    public int Hobat1, Hobat2, Hobat3, Hobat4, JHmo1, JHmo2, JHmo3, JHmo4;
    public int totalo1, totalo2, totalo3, totalo4;

    public int getTotalo1() {
        totalo1 = Hobat1*JHmo1;
        return totalo1;
    }
    public void setTotalo1(int val) {
        totalo1 = val;
    }
    
    public int getTotalo2() {
        totalo2 = Hobat2*JHmo2;
        return totalo2;
    }
    public void setTotalo2(int val) {
        totalo2 = val;
    }
    
    public int getTotalo3() {
        totalo3 = Hobat3*JHmo3;
        return totalo3;
    }
    public void setTotalo3(int val) {
        totalo3 = val;
    }
    
    public int getTotalo4() {
        totalo4 = Hobat4*JHmo4;
        return totalo4;
    }
    public void setTotalo4(int val) {
        totalo4 = val;
    }

    public int getJHmo1() {
        return JHmo1;
    }

    public void setJHmo1(int val) {
        JHmo1 = val;
    }
    
    public int getJHmo2() {
        return JHmo2;
    }

    public void setJHmo2(int val) {
        JHmo2 = val;
    }
    
    public int getJHmo3() {
        return JHmo3;
    }

    public void setJHmo3(int val) {
        JHmo3 = val;
    }
    
    public int getJHmo4() {
        return JHmo4;
    }

    public void setJHmo4(int val) {
        JHmo4 = val;
    }
    
    public double getHobat1() {
        Hobat1 = Hobat1*JHmo1;
        return Hobat1;
    }

    public void setHobat1(int val) {
        Hobat1 = val;
    }
    
    public double getobat2() {
        Hobat2 = Hobat2*JHmo2;
        return Hobat2;
    }

    public void setHobat2(int val) {
        Hobat2 = val;
    }
    
    public double getHobat3() {
        Hobat3 = Hobat3*JHmo3;
        return Hobat3;
    }

    public void setHobat3(int val) {
        Hobat3 = val;
    }
    
    public double getHobat4() {
        return Hobat4;
    }

    public void setHobat4(int val) {
        Hobat1 = val;
    }

    public String getObat() {
        return obat;
    }

    public void setObat(String val) {
        obat = val;
    }

    
    public void SeleksiObat(){
        if(obat.equalsIgnoreCase("Tolak angin")){
            Hobat1= 3000;
        }
        else if(obat.equalsIgnoreCase("Freshcare (original)")){
            Hobat2 = 12000;
        }
        else if(obat.equalsIgnoreCase("Antimo")){
            Hobat3 = 2000;
        }
        else if(obat.equalsIgnoreCase("Minyak kayu putih")){
            Hobat4 = 38000;
        }
        else{
            TotalO = 0.0;
        }
        
    }
    public double getTotalO() {
        TotalO = (double)totalo1+totalo2+totalo3+totalo4;
        return TotalO;
    }
    
    public void OReset(){
        Hobat1 = 0; 
        Hobat2 = 0;
        Hobat3 = 0;
        Hobat4 = 0; 
        JHmo1 = 0;
        JHmo2 = 0;
        JHmo3 = 0; 
        JHmo4 = 0;
        totalo1 = 0;
        totalo2 = 0; 
        totalo3 = 0; 
        totalo4 = 0;
    }
    
    public void TAReset(){
        totalo1 = 0; 
    }
    
    public void FOReset(){
        totalo2 = 0; 
    }
    
    public void ANReset(){
        totalo3 = 0; 
    }  
    public void MPReset(){
        totalo4 = 0; 
    }  
}
