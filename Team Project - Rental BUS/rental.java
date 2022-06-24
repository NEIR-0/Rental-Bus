/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas;

/**
 *
 * @author hikari
 */
public class rental {
    public String asal, tujuan , pergi,lama, kodebus, nama;
    public double Btotal, Htotal, TotalSemua;
    public int jbeli;
    
    public void RTotal(){
        TotalSemua = 0;
    }
    
    public double getTotalSemua() {
        TotalSemua = Htotal;
        return TotalSemua;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String val) {
        nama = val;
    }
    
    public double getHtotal() {
        Htotal = Btotal*jbeli;
        return Htotal;
    }

    public int getJbeli() {
        return jbeli;
    }

    public void setJbeli(int val) {
        jbeli = val;
    }

    public String getPergi() {
        return pergi;
    }

    public void setPergi(String val) {
        pergi = val;
    }
    
    public String getAsal() {
        return asal;
    }

    public void setAsal(String val) {
        asal = val;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String val) {
        tujuan = val;
    }
    
    public String getLama(){
        return lama;
    }
    
    public void setLama(String val){
        lama = val;
    }
    
    public double getBtotal() {
        return Btotal;
    }
    
    public String getKodebus(){
        return kodebus;
    }
    
    public void setKodebus(String val){
        kodebus = val;
    }
    
    public void setSeleksiBtotal1(){
        if (asal.equalsIgnoreCase("Jakarta")){
            if(tujuan.equalsIgnoreCase("Yogyakarta")){
                if (pergi.equalsIgnoreCase("Hanya Pergi")){
                   if(kodebus.equalsIgnoreCase("RLP9RT2J")){
                        Btotal = 11000000;
                    }
                    else if(kodebus.equalsIgnoreCase("336WCNKV")){
                        Btotal = 7000000;
                    }
                    else if(kodebus.equalsIgnoreCase("5968JFDT")){
                        Btotal = 6500000;
                    }
                    else if(kodebus.equalsIgnoreCase("EVWPTZQQ")){
                        Btotal = 5000000;
                    }
                    else if(kodebus.equalsIgnoreCase("CXA7WKFA")){
                        Btotal = 7000000;
                    }
                    else if(kodebus.equalsIgnoreCase("9G8S7EZT")){
                        Btotal = 4900000;
                    }
                    else{
                        Btotal = 0;
                    } 
                }
                else if (pergi.equalsIgnoreCase("Pulang - Pergi")){
                   if(lama.equalsIgnoreCase("2 Hari")){
                        if(kodebus.equalsIgnoreCase("RLP9RT2J")){
                            Btotal = 22000000;
                        }
                        else if(kodebus.equalsIgnoreCase("336WCNKV")){
                            Btotal = 12000000;
                        }
                        else if(kodebus.equalsIgnoreCase("5968JFDT")){
                            Btotal = 10500000;
                        }
                        else if(kodebus.equalsIgnoreCase("EVWPTZQQ")){
                            Btotal = 9000000;
                        }
                        else if(kodebus.equalsIgnoreCase("CXA7WKFA")){
                            Btotal = 11000000;
                        }
                        else if(kodebus.equalsIgnoreCase("9G8S7EZT")){
                            Btotal = 7900000;
                        }
                        else{
                            Btotal = 0;
                        } 
                    }    
                    else if(lama.equalsIgnoreCase("3 Hari")){
                        if(kodebus.equalsIgnoreCase("RLP9RT2J")){
                            Btotal = 31000000;
                        }
                        else if(kodebus.equalsIgnoreCase("336WCNKV")){
                            Btotal = 16000000;
                        }
                        else if(kodebus.equalsIgnoreCase("5968JFDT")){
                            Btotal = 16800000;
                        }
                        else if(kodebus.equalsIgnoreCase("EVWPTZQQ")){
                            Btotal = 11200000;
                        }
                        else if(kodebus.equalsIgnoreCase("CXA7WKFA")){
                            Btotal = 17400000;
                        }
                        else if(kodebus.equalsIgnoreCase("9G8S7EZT")){
                            Btotal = 1090000;
                        }
                        else{
                            Btotal = 0;
                        }
                    }
                    else if(lama.equalsIgnoreCase("5 Hari")){
                        if(kodebus.equalsIgnoreCase("RLP9RT2J")){
                            Btotal = 45000000;
                        }
                        else if(kodebus.equalsIgnoreCase("336WCNKV")){
                            Btotal = 23000000;
                        }
                        else if(kodebus.equalsIgnoreCase("5968JFDT")){
                            Btotal = 25000000;
                        }
                        else if(kodebus.equalsIgnoreCase("EVWPTZQQ")){
                            Btotal = 17000000;
                        }
                        else if(kodebus.equalsIgnoreCase("CXA7WKFA")){
                            Btotal = 25500000;
                        }
                        else if(kodebus.equalsIgnoreCase("9G8S7EZT")){
                            Btotal = 15500000;
                        }
                        else{
                            Btotal = 0;
                        }
                    }
                    else if(lama.equalsIgnoreCase("7 Hari")){
                        if(kodebus.equalsIgnoreCase("RLP9RT2J")){
                            Btotal = 55000000;
                        }
                        else if(kodebus.equalsIgnoreCase("336WCNKV")){
                            Btotal = 30000000;
                        }
                        else if(kodebus.equalsIgnoreCase("5968JFDT")){
                            Btotal = 32000000;
                        }
                        else if(kodebus.equalsIgnoreCase("EVWPTZQQ")){
                            Btotal = 21000000;
                        }
                        else if(kodebus.equalsIgnoreCase("CXA7WKFA")){
                            Btotal = 32500000;
                        }
                        else if(kodebus.equalsIgnoreCase("9G8S7EZT")){
                            Btotal = 17500000;
                        }
                        else{
                            Btotal = 0;
                        }
                    }
                    else if(lama.equalsIgnoreCase("10 Hari")){
                        if(kodebus.equalsIgnoreCase("RLP9RT2J")){
                            Btotal = 70000000;
                        }
                        else if(kodebus.equalsIgnoreCase("336WCNKV")){
                            Btotal = 37000000;
                        }
                        else if(kodebus.equalsIgnoreCase("5968JFDT")){
                            Btotal = 45500000;
                        }
                        else if(kodebus.equalsIgnoreCase("EVWPTZQQ")){
                            Btotal = 27200000;
                        }
                        else if(kodebus.equalsIgnoreCase("CXA7WKFA")){
                            Btotal = 42500000;
                        }
                        else if(kodebus.equalsIgnoreCase("9G8S7EZT")){
                            Btotal = 24500000;
                        }
                        else{
                            Btotal = 0;
                        }
                    }
                }
            }
            
            else if(tujuan.equalsIgnoreCase("Bandung")){
                if (pergi.equalsIgnoreCase("Hanya Pergi")){
                   if(kodebus.equalsIgnoreCase("RLP9RT2J")){
                        Btotal = 7500000;
                    }
                    else if(kodebus.equalsIgnoreCase("336WCNKV")){
                        Btotal = 4500000;
                    }
                    else if(kodebus.equalsIgnoreCase("5968JFDT")){
                        Btotal = 5000000;
                    }
                    else if(kodebus.equalsIgnoreCase("EVWPTZQQ")){
                        Btotal = 4800000;
                    }
                    else if(kodebus.equalsIgnoreCase("CXA7WKFA")){
                        Btotal = 5300000;
                    }
                    else if(kodebus.equalsIgnoreCase("9G8S7EZT")){
                        Btotal = 3800000;
                    }
                    else{
                        Btotal = 0;
                    } 
                }
                else if (pergi.equalsIgnoreCase("Pulang - Pergi")){
                    if(lama.equalsIgnoreCase("2 Hari")){
                        if(kodebus.equalsIgnoreCase("RLP9RT2J")){
                            Btotal = 15000000;
                        }
                        else if(kodebus.equalsIgnoreCase("336WCNKV")){
                            Btotal = 6500000;
                        }
                        else if(kodebus.equalsIgnoreCase("5968JFDT")){
                            Btotal = 7500000;
                        }
                        else if(kodebus.equalsIgnoreCase("EVWPTZQQ")){
                            Btotal = 5200000;
                        }
                        else if(kodebus.equalsIgnoreCase("CXA7WKFA")){
                            Btotal = 7300000;
                        }
                        else if(kodebus.equalsIgnoreCase("9G8S7EZT")){
                            Btotal = 4800000;
                        }
                        else{
                            Btotal = 0;
                        }  
                    }
                    else if(lama.equalsIgnoreCase("3 Hari")){
                        if(kodebus.equalsIgnoreCase("RLP9RT2J")){
                            Btotal = 20000000;
                        }
                        else if(kodebus.equalsIgnoreCase("336WCNKV")){
                            Btotal = 10500000;
                        }
                        else if(kodebus.equalsIgnoreCase("5968JFDT")){
                            Btotal = 11500000;
                        }
                        else if(kodebus.equalsIgnoreCase("EVWPTZQQ")){
                            Btotal = 7200000;
                        }
                        else if(kodebus.equalsIgnoreCase("CXA7WKFA")){
                            Btotal = 12000000;
                        }
                        else if(kodebus.equalsIgnoreCase("9G8S7EZT")){
                            Btotal = 6800000;
                        }
                        else{
                            Btotal = 0;
                        }
                    }
                    else if(lama.equalsIgnoreCase("5 Hari")){
                        if(kodebus.equalsIgnoreCase("RLP9RT2J")){
                            Btotal = 35000000;
                        }
                        else if(kodebus.equalsIgnoreCase("336WCNKV")){
                            Btotal = 22500000;
                        }
                        else if(kodebus.equalsIgnoreCase("5968JFDT")){
                            Btotal = 26300000;
                        }
                        else if(kodebus.equalsIgnoreCase("EVWPTZQQ")){
                            Btotal = 14200000;
                        }
                        else if(kodebus.equalsIgnoreCase("CXA7WKFA")){
                            Btotal = 19200000;
                        }
                        else if(kodebus.equalsIgnoreCase("9G8S7EZT")){
                            Btotal = 12300000;
                        }
                        else{
                            Btotal = 0;
                        }
                    }
                    else if(lama.equalsIgnoreCase("7 Hari")){
                        if(kodebus.equalsIgnoreCase("RLP9RT2J")){
                            Btotal = 45000000;
                        }
                        else if(kodebus.equalsIgnoreCase("336WCNKV")){
                            Btotal = 27300000;
                        }
                        else if(kodebus.equalsIgnoreCase("5968JFDT")){
                            Btotal = 32400000;
                        }
                        else if(kodebus.equalsIgnoreCase("EVWPTZQQ")){
                            Btotal = 20000000;
                        }
                        else if(kodebus.equalsIgnoreCase("CXA7WKFA")){
                            Btotal = 30400000;
                        }
                        else if(kodebus.equalsIgnoreCase("9G8S7EZT")){
                            Btotal = 18300000;
                        }
                        else{
                            Btotal = 0;
                        }
                    }
                    else if(lama.equalsIgnoreCase("10 Hari")){
                        if(kodebus.equalsIgnoreCase("RLP9RT2J")){
                            Btotal = 65000000;
                        }
                        else if(kodebus.equalsIgnoreCase("336WCNKV")){
                            Btotal = 36700000;
                        }
                        else if(kodebus.equalsIgnoreCase("5968JFDT")){
                            Btotal = 45900000;
                        }
                        else if(kodebus.equalsIgnoreCase("EVWPTZQQ")){
                            Btotal = 29300000;
                        }
                        else if(kodebus.equalsIgnoreCase("CXA7WKFA")){
                            Btotal = 40500000;
                        }
                        else if(kodebus.equalsIgnoreCase("9G8S7EZT")){
                            Btotal = 23600000;
                        }
                        else{
                            Btotal = 0;
                        }
                    }
                }
            }   
            
            else if(tujuan.equalsIgnoreCase("Surabaya")){
                if (pergi.equalsIgnoreCase("Hanya Pergi")){
                   if(kodebus.equalsIgnoreCase("RLP9RT2J")){
                        Btotal = 15000000;
                    }
                    else if(kodebus.equalsIgnoreCase("336WCNKV")){
                        Btotal = 8500000;
                    }
                    else if(kodebus.equalsIgnoreCase("5968JFDT")){
                        Btotal = 7000000;
                    }
                    else if(kodebus.equalsIgnoreCase("EVWPTZQQ")){
                        Btotal = 9400000;
                    }
                    else if(kodebus.equalsIgnoreCase("CXA7WKFA")){
                        Btotal = 10000000;
                    }
                    else if(kodebus.equalsIgnoreCase("9G8S7EZT")){
                        Btotal = 6800000;
                    }
                    else{
                        Btotal = 0;
                    } 
                }
                else if (pergi.equalsIgnoreCase("Pulang - Pergi")){
                    if(lama.equalsIgnoreCase("3 Hari")){
                        if(kodebus.equalsIgnoreCase("RLP9RT2J")){
                            Btotal = 27000000;
                        }
                        else if(kodebus.equalsIgnoreCase("336WCNKV")){
                            Btotal = 14500000;
                        }
                        else if(kodebus.equalsIgnoreCase("5968JFDT")){
                            Btotal = 52000000;
                        }
                        else if(kodebus.equalsIgnoreCase("EVWPTZQQ")){
                            Btotal = 11400000;
                        }
                        else if(kodebus.equalsIgnoreCase("CXA7WKFA")){
                            Btotal = 15000000;
                        }
                        else if(kodebus.equalsIgnoreCase("9G8S7EZT")){
                            Btotal = 10800000;
                        }
                        else{
                            Btotal = 0;
                        }  
                    }
                    else if(lama.equalsIgnoreCase("5 Hari")){
                        if(kodebus.equalsIgnoreCase("RLP9RT2J")){
                            Btotal = 43000000;
                        }
                        else if(kodebus.equalsIgnoreCase("336WCNKV")){
                            Btotal = 22500000;
                        }
                        else if(kodebus.equalsIgnoreCase("5968JFDT")){
                            Btotal = 57000000;
                        }
                        else if(kodebus.equalsIgnoreCase("EVWPTZQQ")){
                            Btotal = 17200000;
                        }
                        else if(kodebus.equalsIgnoreCase("CXA7WKFA")){
                            Btotal = 24500000;
                        }
                        else if(kodebus.equalsIgnoreCase("9G8S7EZT")){
                            Btotal = 13600000;
                        }
                        else{
                            Btotal = 0;
                        }
                    }
                    else if(lama.equalsIgnoreCase("7 Hari")){
                        if(kodebus.equalsIgnoreCase("RLP9RT2J")){
                            Btotal = 57000000;
                        }
                        else if(kodebus.equalsIgnoreCase("336WCNKV")){
                            Btotal = 30500000;
                        }
                        else if(kodebus.equalsIgnoreCase("5968JFDT")){
                            Btotal = 60000000;
                        }
                        else if(kodebus.equalsIgnoreCase("EVWPTZQQ")){
                            Btotal = 22500000;
                        }
                        else if(kodebus.equalsIgnoreCase("CXA7WKFA")){
                            Btotal = 31400000;
                        }
                        else if(kodebus.equalsIgnoreCase("9G8S7EZT")){
                            Btotal = 20600000;
                        }
                        else{
                            Btotal = 0;
                        }
                    }
                    else if(lama.equalsIgnoreCase("10 Hari")){
                        if(kodebus.equalsIgnoreCase("RLP9RT2J")){
                            Btotal = 86000000;
                        }
                        else if(kodebus.equalsIgnoreCase("336WCNKV")){
                            Btotal = 40000000;
                        }
                        else if(kodebus.equalsIgnoreCase("5968JFDT")){
                            Btotal = 62000000;
                        }
                        else if(kodebus.equalsIgnoreCase("EVWPTZQQ")){
                            Btotal = 31200000;
                        }
                        else if(kodebus.equalsIgnoreCase("CXA7WKFA")){
                            Btotal = 41600000;
                        }
                        else if(kodebus.equalsIgnoreCase("9G8S7EZT")){
                            Btotal = 29500000;
                        }
                        else{
                            Btotal = 0;
                        }
                    }
                }
            } 
        }
    }    
}







