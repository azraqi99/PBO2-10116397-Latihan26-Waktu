/*
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : Program Waktu
 */
package pbo210116397latihan26waktu;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Zetro
 */
public class PBO210116397Latihan26Waktu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat tanggal = new SimpleDateFormat("EEEE,d MMMM yyyy, "
                + "hh:mm:ss");

        String kalendar = tanggal.format(calendar.getTime());

        System.out.println("Hari Ini Adalah Hari : " + kalendar);
    }
    
}
