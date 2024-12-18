package org.traccar.protocol;

public class GeneratedTestDecodeGpsPositionHasSatellites {

    @Test
    public void testDecodeGpsPositionHasSatellites() {
        Position position = new Position(37.7749, -122.4194);

        // mock ByteBuf
        when(buf.readInt()).thenReturn((byte) 1);
        when(buf.getBytes("UTF-8", "ISO-8859-1")).thenReturn(new byte[]{97, 115, 116});

        Object result = Gt06ProtocolDecoder.decode(position, buf, false, null, true, null);
        assertEquals(Position.class, result.getClass());
    }

}