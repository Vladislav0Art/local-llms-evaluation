package org.traccar.protocol;

public class GeneratedTestDecodeGpsPositionInvalid {

    @Test
    public void testDecodeGpsPositionInvalid() {
        Position position = new Position(37.7749, -122.4194);
        ByteBuf buf = Mockito.mock(ByteBuf.class);
        when(buf.readInt()).thenReturn((byte) 2);

        Object result = Gt06ProtocolDecoder.decode(position, buf, false, null, null, null);
        assertEquals(Position.class, result.getClass());
        // assert that the x and y values are incorrect
    }

}