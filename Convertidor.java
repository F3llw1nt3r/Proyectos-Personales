package generawav;
public class Convertidor {
    public byte[] ConversorInt(int valor, boolean bigEndian)
    {
        byte[] resultado;
        byte b3 = (byte) ((valor>>24)&0xFF);
        byte b2 = (byte) ((valor>>16)&0xFF);
        byte b1 = (byte) ((valor>>8)&0xFF);
        byte b0 = (byte) ((valor)&0xFF);
        if(bigEndian)
        {
            resultado = new byte[]{b3,b2,b1,b0};
        }
        else
        {
            resultado = new byte[]{b0,b1,b2,b3};
        }
        return resultado;
    }

public byte[] ConversorChar(char valor, boolean bigEndian)
    {
        byte[] resultado;
        byte b0 = (byte) ((valor)&0xFF);
        if(bigEndian)
        {
            resultado = new byte[]{b0};
        }
        else
        {
            resultado = new byte[]{b0};
        }
        return resultado;
    }
    
public byte[] ConversorShort(short valor, boolean bigEndian)
    {
        byte[] resultado;
        byte b1 = (byte) ((valor>>8)&0xFF);
        byte b0 = (byte) ((valor)&0xFF);
        if(bigEndian)
        {
            resultado = new byte[]{b1,b0};
        }
        else
        {
            resultado = new byte[]{b0,b1};
        }
        return resultado;
    }
} 

