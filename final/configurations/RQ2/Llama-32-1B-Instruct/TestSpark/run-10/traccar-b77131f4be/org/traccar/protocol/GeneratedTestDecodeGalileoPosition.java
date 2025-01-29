package org.traccar.protocol;

public class GeneratedTestDecodeGalileoPosition {

    @Test
    public void testDecodeGalileoPosition() {
        String[] expected = {"11:00", "10:30"};
        Position position = new Position(0, 1);
        byte[] inputBuffer = Unpooled.buffer(4);
        position.encode(inputBuffer);
        Object actual = decodeGalileoProtocolDecoder(inputBuffer, null, null);
        assertEquals(expected[0], ((String) actual).split(":")[0]);
        assertEquals(expected[1], ((String) actual).split(":")[1].toCharArray());
    }

}