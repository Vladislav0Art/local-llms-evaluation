package org.traccar.protocol;

import org.junit.Test;

import java.nio.ByteBuffer;

public class GeneratedTest {

    private static final int BUFFER_SIZE = 1024;

    @Test
    public void testDecodeWifiAccessPoint() {
        ByteBuffer buffer = ByteBuffer.allocate(BUFFER_SIZE);
        buffer.put((byte) 0x00);
        buffer.put((byte) 0x01);
        buffer.put((byte) 0x02);

        WifiAccessPoint wifiAccessPoint = new WifiAccessPoint();
        wifiAccessPoint.decode(buffer);

        assertEquals("0000010020", wifiAccessPoint.getBuffer());
    }

    public String getBuffer() {
        return "0000010020";
    }
}

class Unpooled {
    public static ByteBuffer newByteBuf(int size) {
        ByteBuffer buffer = ByteBuffer.allocate(size);
        buffer.put((byte) 0x00);
        buffer.put((byte) 0x01);
        buffer.put((byte) 0x02);

        return buffer;
    }

    public static void main(String[] args) {
        Unpooled.unpooled().newByteBuf(3).putAll(new byte[]{1, 2, 0x00});
        System.out.println(Unpooled.unpooled().newByteBuf(4).get());
    }

}