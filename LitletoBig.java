package litletobig;

import com.sun.prism.impl.BufferUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public class LitletoBig {
    public static void main(String[] args) {
        //Esto imprime el número en Little Endian
        ByteBuffer buf = ByteBuffer.allocate(10);
        buf.order(ByteOrder.LITTLE_ENDIAN);
        buf.asShortBuffer().put(2,(short) 0x0709);
        System.out.println(Arrays.toString(buf.array()));
        
        //Esto imprime el número en Big Endian
        ByteBuffer bbuf = ByteBuffer.allocate(10);
        bbuf.order(ByteOrder.BIG_ENDIAN);
        bbuf.asShortBuffer().put(2,(short) 0x0709);
        System.out.println(Arrays.toString(bbuf.array()));
        
        //A = 65, B = 66, C = 67
        
        //Esto imprime "ABC" en Little Endian
        buf.order(ByteOrder.LITTLE_ENDIAN);
        buf.put("ABC".getBytes());
        System.out.println(Arrays.toString(buf.array()));
        
         //Esto imprime "ABC" en Big Endian 
        bbuf.order(ByteOrder.LITTLE_ENDIAN);
        bbuf.put("ABC".getBytes());
        System.out.println(Arrays.toString(bbuf.array()));
        
    }
}
