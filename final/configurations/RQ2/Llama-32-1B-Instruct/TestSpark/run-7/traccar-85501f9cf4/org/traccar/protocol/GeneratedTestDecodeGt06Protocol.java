package org.traccar.protocol;

public class GeneratedTestDecodeGt06Protocol {

    @Test
    public void testDecodeGt06Protocol() {
        MockProtocol protocol = mock(Protocol.class);
        when(protocol.getGt06Protocol()).thenReturn(new Gt06ProtocolDecoder(protocol));
        ByteBuf buf = mock(ByteBuf.class);
        when(buf.readBytes(anyInt())).thenReturn("1234567890".getBytes(StandardCharsets.UTF_8));
        boolean hasLength = false;
        boolean hasSatellites = true;
        boolean hasSpeed = false;
        TimeZone timezone = null;

        assertTrue(protocol.decodeGt06Protocol(buf, hasLength, timezone));
    }

}