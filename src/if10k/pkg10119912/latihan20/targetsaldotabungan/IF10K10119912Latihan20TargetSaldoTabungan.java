/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119912.latihan20.targetsaldotabungan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;


/**
 *
 * @author 
 * NAMA  : Rezki Ramadhan
 * KELAS : IF10K
 * NIM  `: 10119912
 * 
 */
public class IF10K10119912Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    
    static int saldoAkhir;
    static void hitung(int a, int b){
         saldoAkhir = (a + (a*b/100));
    }
    
    public static void main(String[] args) {
          DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);

        int saldo = 3500000;
        int bunga = 8;
        int target = 6000000;
        
        for (int i = 1; i <= i; i++){
            hitung(saldo,bunga);
            System.out.println("Saldo di bulan ke-"+i+" " + kursIndonesia.format(saldoAkhir));
         saldo = saldoAkhir;
         if(saldoAkhir >= target)
             break;
        }
 
    }
    
}
