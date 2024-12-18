package org.traccar.protocol;

public class GeneratedTestDecodeGpsPositionNull {

    @Test
    public void testDecodeGpsPositionNull() {
        Position position = null;
        ByteBuf buf = Mockito.mock(ByteBuf.class);

        Object result = Gt06ProtocolDecoder.decode(position, buf, false, null, null, null);
        assertEquals(Position.class, result.getClass());
        // assert that the x and y values are incorrect
    }

}