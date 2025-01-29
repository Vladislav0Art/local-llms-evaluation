package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GeneratedTestDecodeMessage {

    @Test
    public void testDecodeMessage() throws Exception {
        byte[] message = new byte[]{0x05, 0x06};
        ByteBuf buf = Unpooled.buffer(message.length);
        buf.writeShort(0x01); // start of data length
        for (int i = 0; i < message.length; i++) {
            buf.writeByte(i / 2 + 1); // byte order is big-endian
        }

        Object result = decoder.decode(buf, null, null);
        assertNotNull(result);
        GalileoProtocolData data = (GalileoProtocolData) result;
        assertNotNull(data);
    }

}