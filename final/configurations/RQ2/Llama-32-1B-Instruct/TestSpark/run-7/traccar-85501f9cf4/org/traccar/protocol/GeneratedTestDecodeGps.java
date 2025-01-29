package org.traccar.protocol;

public class GeneratedTestDecodeGps {

    @Test
    public void testDecodeGps() {
        MockProtocol protocol = mock(Protocol.class);
        when(protocol.getGt06Protocol()).thenReturn(new Gt06ProtocolDecoder(protocol));
        ByteBuf buf = mock(ByteBuf.class);
        when(buf.readBytes(anyInt())).thenReturn("1234567890".getBytes(StandardCharsets.UTF_8));
        boolean hasLength = false;
        boolean hasSatellites = true;
        boolean hasSpeed = false;

        assertTrue(protocol.decodeGps(buf, hasLength, null));
    }

}