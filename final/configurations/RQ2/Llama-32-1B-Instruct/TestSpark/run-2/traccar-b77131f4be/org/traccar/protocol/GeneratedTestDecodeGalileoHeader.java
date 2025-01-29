package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GeneratedTestDecodeGalileoHeader {

    @Test
    public void testDecodeGalileoHeader() throws Exception {
        byte[] header = new byte[]{0x01, 0x02, 0x03, 0x04};
        ByteBuf buf = Unpooled.buffer(header.length);
        buf.writeShort(0x01); // Galileo header length
        for (int i = 0; i < header.length; i++) {
            buf.writeByte(i / 2 + 1); // byte order is big-endian
        }

        Object result = decoder.decode(buf, null, null);
        assertNotNull(result);
        GalileoProtocolData data = (GalileoProtocolData) result;
        assertNotNull(data);
        assertEquals("Galileo", data.getGALOHeader());
    }

}