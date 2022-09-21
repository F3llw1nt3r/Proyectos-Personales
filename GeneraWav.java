package generawav;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import generawav.Convertidor;
import java.math.MathContext;
public class GeneraWav {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws FileNotFoundException, IOException           
    {
        final double Pi = Math.PI;
        Convertidor hr = new Convertidor();
        DataOutputStream wv,wav;
        try
        {
        wv = new DataOutputStream(new FileOutputStream("Audio2.wav"));
        wv.writeBytes("RIFF");
        int tamano = (2092)-8;
        byte t[];
        t = hr.ConversorInt(tamano,false);
        wv.write(t);
        char Wave = 0;
        t = hr.ConversorChar(Wave,true);
        wv.writeBytes("WAVEfmt ");
        int Formato = 16;
        t = hr.ConversorInt(Formato,false);
        wv.write(t);
        short Pcm = 1;
        t = hr.ConversorShort(Pcm,false);
        wv.write(t);
        short Canales = 1;
        t = hr.ConversorShort(Canales,false);
        wv.write(t);
        int Frecuencia = System.in.read();
        t = hr.ConversorInt(Frecuencia,false);
        wv.write(t);
        int F_Muestreo = Frecuencia * 2;
        t = hr.ConversorInt(F_Muestreo,false);
        wv.write(t);
        int iTiempo = System.in.read();
        int numTotal = F_Muestreo*iTiempo;
        short Bytes_m = 2;
        t = hr.ConversorShort(Bytes_m,false);
        wv.write(t);
        short Bits_m = 16;
        t = hr.ConversorShort(Bits_m,false);
        wv.write(t);
        wv.writeBytes("data");
        int Bytes_files = numTotal*Bits_m;
        t = hr.ConversorInt(Frecuencia,false);
        wv.write(t);
        short muestra[] = new short[numTotal];
        for(int i = 0;i<numTotal;i++)
        {
            muestra[i] = (short)(32000*Math.sin(2*Math.PI/Frecuencia*i*440));
            t = hr.ConversorShort(muestra[i],false);
            for(int iCont = 0;iCont<2;iCont++)
            {
                wv.write(t[iCont]);
            }
        }
        }
catch(NumberFormatException e)
{
}       
 }    
}
