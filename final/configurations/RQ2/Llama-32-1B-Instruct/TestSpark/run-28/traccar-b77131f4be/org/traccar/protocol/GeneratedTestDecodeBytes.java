package org.traccar.protocol;

import org.junit.Test;

public class GeneratedTestDecodeBytes {

    @Test
    public void testDecodeBytes() {
        Protocol protocol = new Protocol();
        byte[] bytes = {1, 2, 3, 4, 5};
        String result = protocol.decode(bytes);
        assertEquals("12345", result);
    }
}

class Protocol {
    public int decode(String position) {
        try {
            return Integer.parseInt(position);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }

    public void setBuffer(byte[] buffer) {
        this.buffer = buffer;
    }

    public byte[] getBuffer() {
        return buffer;
    }

    public String getPosition() {
        return new String(buffer).trim();
    }

}