package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GeneratedTestDecodeStartOfPosition {

    @Test
    public void testDecodeStartOfPosition() throws Exception {
        byte[] position = new byte[]{0x01, 0x02};
        ByteBuf buf = Unpooled.buffer(position.length);
        buf.writeShort(0x01); // start of position length
        for (int i = 0; i < position.length; i++) {
            buf.writeByte(i / 2 + 1); // byte order is big-endian
        }

        Object result = decoder.decode(buf, null, null);
        assertNotNull(result);
        Position positionData = (Position) result;
        assertNotNull(positionData);
        assertEquals("2024-12-06T14:30:00", positionData.getTimestamp());
    }

}