package org.traccar.protocol;

public class GeneratedTestDecodeGpsPositionBytes {

    @Test
    public void testDecodeGpsPositionBytes() {
        Position position = new Position(37.7749, -122.4194);

        // mock ByteBuf
        when(buf.readInt()).thenReturn((byte) 1);
        when(buf.getBytes("UTF-8", "ISO-8859-1")).thenReturn(new byte[]{97, 115, 116});

        Object result = Gt06ProtocolDecoder.decode(position, buf, false, null, null, null);
        assertEquals(Position.class, result.getClass());
        assertEquals(37.7749, position.getX(), 0.01);
        assertEquals(-122.4194, position.getY(), 0.01);
    }

}