/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas;

/**
 *
 * @author aalij
 */
public class FullBus {
    //Rental
    public String asal, tujuan , pergi,lama, kodebus, nama, paket, tkode;
    public double Btotal, Htotal, TotalSemua;
    public int jbeli;
    
    //Makanan
    public String makanan;
    public Double TotalM;
    public int Hmakanan1, Hmakanan2, Hmakanan3, Hmakanan4, JHm1, JHm2, JHm3, JHm4;
    public int totalm1, totalm2, totalm3, totalm4;
    
    //Minuman
    public String minuman;
    public Double TotalMi;
    public int Hminuman1, Hminuman2, Hminuman3, Hminuman4, JHmi1, JHmi2, JHmi3, JHmi4;
    public int totalmi1, totalmi2, totalmi3, totalmi4;
    
    //Obat
    public String obat;
    public Double TotalO;
    public int Hobat1, Hobat2, Hobat3, Hobat4, JHmo1, JHmo2, JHmo3, JHmo4;
    public int totalo1, totalo2, totalo3, totalo4;
    
    
    //Rental
    public double getTotalSemua() {
        TotalSemua = Htotal + TotalM + TotalMi + TotalO;
        return TotalSemua;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String val) {
        nama = val;
    }
    
    public String getpaket() {
        return paket;
    }

    public void setpaket(String val) {
        paket = val;
    }
    
    public String gettkode() {
        return tkode;
    }

    public void settkode(String val) {
        tkode = val;
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
                   if(kodebus.equalsIgnoreCase("Weha One")){
                        Btotal = 11000000;
                    }
                    else if(kodebus.equalsIgnoreCase("Big Bus")){
                        Btotal = 7000000;
                    }
                    else if(kodebus.equalsIgnoreCase("Big Bus Business")){
                        Btotal = 6500000;
                    }
                    else if(kodebus.equalsIgnoreCase("Medium Bus")){
                        Btotal = 5000000;
                    }
                    else if(kodebus.equalsIgnoreCase("SHD/HDD")){
                        Btotal = 7000000;
                    }
                    else if(kodebus.equalsIgnoreCase("Bus HD")){
                        Btotal = 4900000;
                    }
                    else{
                        Btotal = 0;
                    } 
                }
                else if (pergi.equalsIgnoreCase("Pulang - Pergi")){
                   if(lama.equalsIgnoreCase("2 Hari")){
                        if(kodebus.equalsIgnoreCase("Weha One")){
                            Btotal = 22000000;
                        }
                        else if(kodebus.equalsIgnoreCase("Big Bus")){
                            Btotal = 12000000;
                        }
                        else if(kodebus.equalsIgnoreCase("Big Bus Business")){
                            Btotal = 10500000;
                        }
                        else if(kodebus.equalsIgnoreCase("Medium Bus")){
                            Btotal = 9000000;
                        }
                        else if(kodebus.equalsIgnoreCase("SHD/HDD")){
                            Btotal = 11000000;
                        }
                        else if(kodebus.equalsIgnoreCase("Bus HD")){
                            Btotal = 7900000;
                        }
                        else{
                            Btotal = 0;
                        } 
                    }    
                    else if(lama.equalsIgnoreCase("3 Hari")){
                        if(kodebus.equalsIgnoreCase("Weha One")){
                            Btotal = 31000000;
                        }
                        else if(kodebus.equalsIgnoreCase("Big Bus")){
                            Btotal = 16000000;
                        }
                        else if(kodebus.equalsIgnoreCase("Big Bus Business")){
                            Btotal = 16800000;
                        }
                        else if(kodebus.equalsIgnoreCase("Medium Bus")){
                            Btotal = 11200000;
                        }
                        else if(kodebus.equalsIgnoreCase("SHD/HDD")){
                            Btotal = 17400000;
                        }
                        else if(kodebus.equalsIgnoreCase("Bus HD")){
                            Btotal = 1090000;
                        }
                        else{
                            Btotal = 0;
                        }
                    }
                    else if(lama.equalsIgnoreCase("5 Hari")){
                        if(kodebus.equalsIgnoreCase("Weha One")){
                            Btotal = 45000000;
                        }
                        else if(kodebus.equalsIgnoreCase("Big Bus")){
                            Btotal = 23000000;
                        }
                        else if(kodebus.equalsIgnoreCase("Big Bus Business")){
                            Btotal = 25000000;
                        }
                        else if(kodebus.equalsIgnoreCase("Medium Bus")){
                            Btotal = 17000000;
                        }
                        else if(kodebus.equalsIgnoreCase("SHD/HDD")){
                            Btotal = 25500000;
                        }
                        else if(kodebus.equalsIgnoreCase("Bus HD")){
                            Btotal = 15500000;
                        }
                        else{
                            Btotal = 0;
                        }
                    }
                    else if(lama.equalsIgnoreCase("7 Hari")){
                        if(kodebus.equalsIgnoreCase("Weha One")){
                            Btotal = 55000000;
                        }
                        else if(kodebus.equalsIgnoreCase("Big Bus")){
                            Btotal = 30000000;
                        }
                        else if(kodebus.equalsIgnoreCase("Big Bus Business")){
                            Btotal = 32000000;
                        }
                        else if(kodebus.equalsIgnoreCase("Medium Bus")){
                            Btotal = 21000000;
                        }
                        else if(kodebus.equalsIgnoreCase("SHD/HDD")){
                            Btotal = 32500000;
                        }
                        else if(kodebus.equalsIgnoreCase("Bus HD")){
                            Btotal = 17500000;
                        }
                        else{
                            Btotal = 0;
                        }
                    }
                    else if(lama.equalsIgnoreCase("10 Hari")){
                        if(kodebus.equalsIgnoreCase("Weha One")){
                            Btotal = 70000000;
                        }
                        else if(kodebus.equalsIgnoreCase("Big Bus")){
                            Btotal = 37000000;
                        }
                        else if(kodebus.equalsIgnoreCase("Big Bus Business")){
                            Btotal = 45500000;
                        }
                        else if(kodebus.equalsIgnoreCase("Medium Bus")){
                            Btotal = 27200000;
                        }
                        else if(kodebus.equalsIgnoreCase("SHD/HDD")){
                            Btotal = 42500000;
                        }
                        else if(kodebus.equalsIgnoreCase("Bus HD")){
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
                   if(kodebus.equalsIgnoreCase("Weha One")){
                        Btotal = 7500000;
                    }
                    else if(kodebus.equalsIgnoreCase("Big Bus")){
                        Btotal = 4500000;
                    }
                    else if(kodebus.equalsIgnoreCase("Big Bus Business")){
                        Btotal = 5000000;
                    }
                    else if(kodebus.equalsIgnoreCase("Medium Bus")){
                        Btotal = 4800000;
                    }
                    else if(kodebus.equalsIgnoreCase("SHD/HDD")){
                        Btotal = 5300000;
                    }
                    else if(kodebus.equalsIgnoreCase("Bus HD")){
                        Btotal = 3800000;
                    }
                    else{
                        Btotal = 0;
                    } 
                }
                else if (pergi.equalsIgnoreCase("Pulang - Pergi")){
                    if(lama.equalsIgnoreCase("2 Hari")){
                        if(kodebus.equalsIgnoreCase("Weha One")){
                            Btotal = 15000000;
                        }
                        else if(kodebus.equalsIgnoreCase("Big Bus")){
                            Btotal = 6500000;
                        }
                        else if(kodebus.equalsIgnoreCase("Big Bus Business")){
                            Btotal = 7500000;
                        }
                        else if(kodebus.equalsIgnoreCase("Medium Bus")){
                            Btotal = 5200000;
                        }
                        else if(kodebus.equalsIgnoreCase("SHD/HDD")){
                            Btotal = 7300000;
                        }
                        else if(kodebus.equalsIgnoreCase("Bus HD")){
                            Btotal = 4800000;
                        }
                        else{
                            Btotal = 0;
                        }  
                    }
                    else if(lama.equalsIgnoreCase("3 Hari")){
                        if(kodebus.equalsIgnoreCase("Weha One")){
                            Btotal = 20000000;
                        }
                        else if(kodebus.equalsIgnoreCase("Big Bus")){
                            Btotal = 10500000;
                        }
                        else if(kodebus.equalsIgnoreCase("Big Bus Business")){
                            Btotal = 11500000;
                        }
                        else if(kodebus.equalsIgnoreCase("Medium Bus")){
                            Btotal = 7200000;
                        }
                        else if(kodebus.equalsIgnoreCase("SHD/HDD")){
                            Btotal = 12000000;
                        }
                        else if(kodebus.equalsIgnoreCase("Bus HD")){
                            Btotal = 6800000;
                        }
                        else{
                            Btotal = 0;
                        }
                    }
                    else if(lama.equalsIgnoreCase("5 Hari")){
                        if(kodebus.equalsIgnoreCase("Weha One")){
                            Btotal = 35000000;
                        }
                        else if(kodebus.equalsIgnoreCase("Big Bus")){
                            Btotal = 22500000;
                        }
                        else if(kodebus.equalsIgnoreCase("Big Bus Business")){
                            Btotal = 26300000;
                        }
                        else if(kodebus.equalsIgnoreCase("Medium Bus")){
                            Btotal = 14200000;
                        }
                        else if(kodebus.equalsIgnoreCase("SHD/HDD")){
                            Btotal = 19200000;
                        }
                        else if(kodebus.equalsIgnoreCase("Bus HD")){
                            Btotal = 12300000;
                        }
                        else{
                            Btotal = 0;
                        }
                    }
                    else if(lama.equalsIgnoreCase("7 Hari")){
                        if(kodebus.equalsIgnoreCase("Weha One")){
                            Btotal = 45000000;
                        }
                        else if(kodebus.equalsIgnoreCase("Big Bus")){
                            Btotal = 27300000;
                        }
                        else if(kodebus.equalsIgnoreCase("Big Bus Business")){
                            Btotal = 32400000;
                        }
                        else if(kodebus.equalsIgnoreCase("Medium Bus")){
                            Btotal = 20000000;
                        }
                        else if(kodebus.equalsIgnoreCase("SHD/HDD")){
                            Btotal = 30400000;
                        }
                        else if(kodebus.equalsIgnoreCase("Bus HD")){
                            Btotal = 18300000;
                        }
                        else{
                            Btotal = 0;
                        }
                    }
                    else if(lama.equalsIgnoreCase("10 Hari")){
                        if(kodebus.equalsIgnoreCase("Weha One")){
                            Btotal = 65000000;
                        }
                        else if(kodebus.equalsIgnoreCase("Big Bus")){
                            Btotal = 36700000;
                        }
                        else if(kodebus.equalsIgnoreCase("Big Bus Business")){
                            Btotal = 45900000;
                        }
                        else if(kodebus.equalsIgnoreCase("Medium Bus")){
                            Btotal = 29300000;
                        }
                        else if(kodebus.equalsIgnoreCase("SHD/HDD")){
                            Btotal = 40500000;
                        }
                        else if(kodebus.equalsIgnoreCase("Bus HD")){
                            Btotal = 23600000;
                        }
                        else{
                            Btotal = 0;
                        }
                    }
                }
            }   
            
            else if(tujuan.equalsIgnoreCase("Malang")){
                if (pergi.equalsIgnoreCase("Hanya Pergi")){
                   if(kodebus.equalsIgnoreCase("Weha One")){
                        Btotal = 15000000;
                    }
                    else if(kodebus.equalsIgnoreCase("Big Bus")){
                        Btotal = 8500000;
                    }
                    else if(kodebus.equalsIgnoreCase("Big Bus Business")){
                        Btotal = 7000000;
                    }
                    else if(kodebus.equalsIgnoreCase("Medium Bus")){
                        Btotal = 9400000;
                    }
                    else if(kodebus.equalsIgnoreCase("SHD/HDD")){
                        Btotal = 10000000;
                    }
                    else if(kodebus.equalsIgnoreCase("Bus HD")){
                        Btotal = 6800000;
                    }
                    else{
                        Btotal = 0;
                    } 
                }
                else if (pergi.equalsIgnoreCase("Pulang - Pergi")){
                    if(lama.equalsIgnoreCase("2 Hari")){
                        if(kodebus.equalsIgnoreCase("Weha One")){
                            Btotal = 18700000;
                        }
                        else if(kodebus.equalsIgnoreCase("Big Bus")){
                            Btotal = 12500000;
                        }
                        else if(kodebus.equalsIgnoreCase("Big Bus Business")){
                            Btotal = 27000000;
                        }
                        else if(kodebus.equalsIgnoreCase("Medium Bus")){
                            Btotal = 10400000;
                        }
                        else if(kodebus.equalsIgnoreCase("SHD/HDD")){
                            Btotal = 13000000;
                        }
                        else if(kodebus.equalsIgnoreCase("Bus HD")){
                            Btotal = 8800000;
                        }
                        else{
                            Btotal = 0;
                        }  
                    }
                    else if(lama.equalsIgnoreCase("3 Hari")){
                        if(kodebus.equalsIgnoreCase("Weha One")){
                            Btotal = 27000000;
                        }
                        else if(kodebus.equalsIgnoreCase("Big Bus")){
                            Btotal = 14500000;
                        }
                        else if(kodebus.equalsIgnoreCase("Big Bus Business")){
                            Btotal = 52000000;
                        }
                        else if(kodebus.equalsIgnoreCase("Medium Bus")){
                            Btotal = 11400000;
                        }
                        else if(kodebus.equalsIgnoreCase("SHD/HDD")){
                            Btotal = 15000000;
                        }
                        else if(kodebus.equalsIgnoreCase("Bus HD")){
                            Btotal = 10800000;
                        }
                        else{
                            Btotal = 0;
                        }
                    }    
                    else if(lama.equalsIgnoreCase("5 Hari")){
                        if(kodebus.equalsIgnoreCase("Weha One")){
                            Btotal = 43000000;
                        }
                        else if(kodebus.equalsIgnoreCase("Big Bus")){
                            Btotal = 22500000;
                        }
                        else if(kodebus.equalsIgnoreCase("Big Bus Business")){
                            Btotal = 57000000;
                        }
                        else if(kodebus.equalsIgnoreCase("Medium Bus")){
                            Btotal = 17200000;
                        }
                        else if(kodebus.equalsIgnoreCase("SHD/HDD")){
                            Btotal = 24500000;
                        }
                        else if(kodebus.equalsIgnoreCase("Bus HD")){
                            Btotal = 13600000;
                        }
                        else{
                            Btotal = 0;
                        }
                    }
                    else if(lama.equalsIgnoreCase("7 Hari")){
                        if(kodebus.equalsIgnoreCase("Weha One")){
                            Btotal = 57000000;
                        }
                        else if(kodebus.equalsIgnoreCase("Big Bus")){
                            Btotal = 30500000;
                        }
                        else if(kodebus.equalsIgnoreCase("Big Bus Business")){
                            Btotal = 60000000;
                        }
                        else if(kodebus.equalsIgnoreCase("Medium Bus")){
                            Btotal = 22500000;
                        }
                        else if(kodebus.equalsIgnoreCase("SHD/HDD")){
                            Btotal = 31400000;
                        }
                        else if(kodebus.equalsIgnoreCase("Bus HD")){
                            Btotal = 20600000;
                        }
                        else{
                            Btotal = 0;
                        }
                    }
                    else if(lama.equalsIgnoreCase("10 Hari")){
                        if(kodebus.equalsIgnoreCase("Weha One")){
                            Btotal = 86000000;
                        }
                        else if(kodebus.equalsIgnoreCase("Big Bus")){
                            Btotal = 40000000;
                        }
                        else if(kodebus.equalsIgnoreCase("Big Bus Business")){
                            Btotal = 62000000;
                        }
                        else if(kodebus.equalsIgnoreCase("Medium Bus")){
                            Btotal = 31200000;
                        }
                        else if(kodebus.equalsIgnoreCase("SHD/HDD")){
                            Btotal = 41600000;
                        }
                        else if(kodebus.equalsIgnoreCase("Bus HD")){
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
    
    public void TBReset(){
        Btotal = 0;
    }
    
    
    //Makanan
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
    
    
    //Minuman
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

    
    
    //Obat
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

