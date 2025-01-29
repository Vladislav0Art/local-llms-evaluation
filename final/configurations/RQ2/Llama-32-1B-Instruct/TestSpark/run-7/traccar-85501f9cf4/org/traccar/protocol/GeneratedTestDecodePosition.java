package org.traccar.protocol;

public class GeneratedTestDecodePosition {

    @Test
    public void testDecodePosition() {
        MockProtocol protocol = mock(Protocol.class);
        when(protocol.getGt06Protocol()).thenReturn(new Gt06ProtocolDecoder(protocol));
        Position position = new Position(0, 0, 0, 1, 60 * Calendar.MINUTE, TimeZone.getTimeZone("GMT"));
        ByteBuf buf = mock(ByteBuf.class);
        when(buf.readBytes(anyInt())).thenReturn(position.toByteBuf());
        boolean hasLength = true;
        boolean hasSatellites = false;
        boolean hasSpeed = false;

        assertTrue(protocol.decodePosition(buf, hasLength));
    }

}