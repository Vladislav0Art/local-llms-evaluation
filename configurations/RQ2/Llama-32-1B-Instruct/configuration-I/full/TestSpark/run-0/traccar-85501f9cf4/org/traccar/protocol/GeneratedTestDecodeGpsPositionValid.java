package org.traccar.protocol;

public class GeneratedTestDecodeGpsPositionValid {

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

}