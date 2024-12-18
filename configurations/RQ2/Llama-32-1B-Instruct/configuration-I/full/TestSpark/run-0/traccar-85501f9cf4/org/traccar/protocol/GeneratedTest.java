package org.traccar.protocol;

public class GeneratedTest {

    @Test
    public void testDecodeGpsPositionValid() {
        Position position = new Position(37.7749, -122.4194);
        ByteBuf buf = Mockito.mock(ByteBuf.class);
        when(buf.readInt()).thenReturn((byte) 1);

        Object result = Gt06ProtocolDecoder.decode(position, buf, false, null, null, null);
        assertEquals(Position.class, result.getClass());
        assertEquals(37.7749, position.getX(), 0.01);
        assertEquals(-122.4194, position.getY(), 0.01);
    }

    @Test
    public void testDecodeGpsPositionInvalid() {
        Position position = new Position(37.7749, -122.4194);
        ByteBuf buf = Mockito.mock(ByteBuf.class);
        when(buf.readInt()).thenReturn((byte) 2);

        Object result = Gt06ProtocolDecoder.decode(position, buf, false, null, null, null);
        assertEquals(Position.class, result.getClass());
        // assert that the x and y values are incorrect
    }

    @Test
    public void testDecodeGpsPositionNull() {
        Position position = null;
        ByteBuf buf = Mockito.mock(ByteBuf.class);

        Object result = Gt06ProtocolDecoder.decode(position, buf, false, null, null, null);
        assertEquals(Position.class, result.getClass());
        // assert that the x and y values are incorrect
    }

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

    @Test
    public void testDecodeGpsPositionTimezone() {
        Position position = new Position(37.7749, -122.4194);

        // mock ByteBuf
        when(buf.readInt()).thenReturn((byte) 1);
        when(buf.getBytes("UTF-8", "ISO-8859-1")).thenReturn(new byte[]{97, 115, 116});

        Object result = Gt06ProtocolDecoder.decode(position, buf, false, TimeZone.class, null, null);
        assertEquals(Position.class, result.getClass());
        assertEquals(37.7749, position.getX(), 0.01);
        assertEquals(-122.4194, position.getY(), 0.01);
    }

    @Test
    public void testDecodeGpsPositionHasLength() {
        Position position = new Position(37.7749, -122.4194);

        // mock ByteBuf
        when(buf.readInt()).thenReturn((byte) 1);
        when(buf.getBytes("UTF-8", "ISO-8859-1")).thenReturn(new byte[]{97, 115, 116});

        Object result = Gt06ProtocolDecoder.decode(position, buf, true, null, null, null);
        assertEquals(Position.class, result.getClass());
    }

    @Test
    public void testDecodeGpsPositionHasSatellites() {
        Position position = new Position(37.7749, -122.4194);

        // mock ByteBuf
        when(buf.readInt()).thenReturn((byte) 1);
        when(buf.getBytes("UTF-8", "ISO-8859-1")).thenReturn(new byte[]{97, 115, 116});

        Object result = Gt06ProtocolDecoder.decode(position, buf, false, null, true, null);
        assertEquals(Position.class, result.getClass());
    }

    @Test
    public void testDecodeGpsPositionHasSpeed() {
        Position position = new Position(37.7749, -122.4194);

        // mock ByteBuf
        when(buf.readInt()).thenReturn((byte) 1);
        when(buf.getBytes("UTF-8", "ISO-8859-1")).thenReturn(new byte[]{97, 115, 116});

        Object result = Gt06ProtocolDecoder.decode(position, buf, false, null, null, true);
        assertEquals(Position.class, result.getClass());
    }

    @Test
    public void testDecodeGpsPositionHasDirection() {
        Position position = new Position(37.7749, -122.4194);

        // mock ByteBuf
        when(buf.readInt()).thenReturn((byte) 1);
        when(buf.getBytes("UTF-8", "ISO-8859-1")).thenReturn(new byte[]{97, 115, 116});

        Object result = Gt06ProtocolDecoder.decode(position, buf, false, null, null, true);
        assertEquals(Position.class, result.getClass());
    }

    @Test
    public void testDecodeGpsPositionHasAccuracy() {
        Position position = new Position(37.7749, -122.4194);

        // mock ByteBuf
        when(buf.readInt()).thenReturn((byte) 1);
        when(buf.getBytes("UTF-8", "ISO-8859-1")).thenReturn(new byte[]{97, 115, 116});

        Object result = Gt06ProtocolDecoder.decode(position, buf, false, null, null, true);
        assertEquals(Position.class, result.getClass());
    }

}