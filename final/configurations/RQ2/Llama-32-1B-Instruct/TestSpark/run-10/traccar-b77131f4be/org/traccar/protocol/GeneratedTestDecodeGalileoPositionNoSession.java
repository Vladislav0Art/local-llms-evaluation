package org.traccar.protocol;

public class GeneratedTestDecodeGalileoPositionNoSession {

    @Test
    public void testDecodeGalileoPositionNoSession() {
        String[] expected = {"11:00", "10:30"};
        byte[] inputBuffer = Unpooled.buffer(8);
        new Position(inputBuffer, null, null).encode(inputBuffer);
        Object actual = decodeGalileoProtocolDecoder(inputBuffer, null, null);
        assertEquals(expected[0], ((String) actual).split(":")[0]);
        assertEquals(expected[1], ((String) actual).split(":")[1].toCharArray());
    }

}