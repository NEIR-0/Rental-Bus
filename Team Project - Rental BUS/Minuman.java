/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas;

/**
 *
 * @author aalij
 */
public class Minuman {
    public String minuman;
    public Double TotalMi;
    public int Hminuman1, Hminuman2, Hminuman3, Hminuman4, JHmi1, JHmi2, JHmi3, JHmi4;
    public int totalmi1, totalmi2, totalmi3, totalmi4;
        
    public int getTotalmi1() {
        totalmi1 = Hminuman1*JHmi1;
        return totalmi1;
    }
    public void setTotalmi1(int val) {
        totalmi1 = val;
    }
    
    public int getTotalmi2() {
        totalmi2 = Hminuman2*JHmi2;
        return totalmi2;
    }
    public void setTotalmi2(int val) {
        totalmi2 = val;
    }
    
    public int getTotalmi3() {
        totalmi3 = Hminuman3*JHmi3;
        return totalmi3;
    }
    public void setTotalmi3(int val) {
        totalmi3 = val;
    }
    
    public int getTotalmi4() {
        totalmi4 = Hminuman4*JHmi4;
        return totalmi4;
    }
    public void setTotalmi4(int val) {
        totalmi4 = val;
    }

    public int getJHmi1() {
        return JHmi1;
    }

    public void setJHmi1(int val) {
        JHmi1 = val;
    }
    
    public int getJHmi2() {
        return JHmi2;
    }

    public void setJHmi2(int val) {
        JHmi2 = val;
    }
    
    public int getJHmi3() {
        return JHmi3;
    }

    public void setJHmi3(int val) {
        JHmi3 = val;
    }
    
    public int getJHmi4() {
        return JHmi4;
    }

    public void setJHmi4(int val) {
        JHmi4 = val;
    }
    
    public double getHminuman1() {
        Hminuman1 = Hminuman1*JHmi1;
        return Hminuman1;
    }

    public void setHminuman1(int val) {
        Hminuman1 = val;
    }
    
    public double getHminuman2() {
        Hminuman2 = Hminuman2*JHmi2;
        return Hminuman2;
    }

    public void setHminuman2(int val) {
        Hminuman2 = val;
    }
    
    public double getHminuman3() {
        Hminuman3 = Hminuman3*JHmi3;
        return Hminuman3;
    }

    public void setHminuman3(int val) {
        Hminuman3 = val;
    }
    
    public double getHminuman4() {
        return Hminuman4;
    }

    public void setHminuman4(int val) {
        Hminuman1 = val;
    }

    public String getMinuman() {
        return minuman;
    }

    public void setMinuman(String val) {
        minuman = val;
    }

    
    public void SeleksiMinuman(){
        if(minuman.equalsIgnoreCase("Air mineral")){
            Hminuman1= 5000;
        }
        else if(minuman.equalsIgnoreCase("Golda coffe")){
            Hminuman2 = 5000;
        }
        else if(minuman.equalsIgnoreCase("Teh pucuk")){
            Hminuman3 = 7000;
        }
        else if(minuman.equalsIgnoreCase("Pocari")){
            Hminuman4 = 50000;
        }
        else{
            TotalMi = 0.0;
        }
        
    }
    public double getTotalMi() {
        TotalMi = (double)totalmi1+totalmi2+totalmi3+totalmi4;
        return TotalMi;
    }
    
    public void MiReset(){
        Hminuman1 = 0; 
        Hminuman2 = 0;
        Hminuman3 = 0;
        Hminuman4 = 0; 
        JHmi1 = 0;
        JHmi2 = 0;
        JHmi3 = 0; 
        JHmi4 = 0;
        totalmi1 = 0;
        totalmi2 = 0; 
        totalmi3 = 0; 
        totalmi4 = 0;
    }
    
    public void AMReset(){
        totalmi1 = 0; 
    }
    
    public void GFReset(){
        totalmi2 = 0; 
    }
    
    public void TPReset(){
        totalmi3 = 0; 
    }  
    public void PSReset(){
        totalmi4 = 0; 
    }
}
