/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 10116251-Rasyid
 */
public class YayasanFactory {
    public Yayasan getYayasan(String namaBangunan) {
        if (namaBangunan.equalsIgnoreCase("tk")) {
            return new TK();
        } else if(namaBangunan.equalsIgnoreCase("sd")) {
            return new SD();
        } else if(namaBangunan.equalsIgnoreCase("smp")) {
            return new SMP();
        } else if(namaBangunan.equalsIgnoreCase("sma")) {
            return new SMA();
        } 
        return null;
    }
}
