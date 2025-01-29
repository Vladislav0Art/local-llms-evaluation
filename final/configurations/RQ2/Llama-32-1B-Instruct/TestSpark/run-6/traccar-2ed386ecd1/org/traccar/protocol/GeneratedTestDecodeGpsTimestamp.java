package org.traccar.protocol;

public class GeneratedTestDecodeGpsTimestamp {

    @Test
    public void testDecodeGpsTimestamp() {
        ByteBuf buf = Unpooled.buffer(8);
        Calendar calendar = new Calendar();
        // Set up the mock
        Mockito.when(Checksum.decodeByte(buf)).thenReturn(calendar.getTimeInMillis());

        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        if (!decoder.decodeGpsTimestamp(buf, null, false)) {
            fail("Failed to decode gps timestamp");
        }
    }

}