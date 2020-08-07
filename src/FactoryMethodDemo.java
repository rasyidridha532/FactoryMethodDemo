/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 10116251-Rasyid
 */
public class FactoryMethodDemo {
    public static void main(String[] args) {
        YayasanFactory yayasanFactory = new YayasanFactory();
        
        Yayasan tk = yayasanFactory.getYayasan("tk");
        Yayasan sd = yayasanFactory.getYayasan("sd");
        Yayasan smp = yayasanFactory.getYayasan("smp");
        Yayasan sma = yayasanFactory.getYayasan("sma");
        
        tk.bangunSekolah();
        sd.bangunSekolah();
        smp.bangunSekolah();
        sma.bangunSekolah();
    }
}
