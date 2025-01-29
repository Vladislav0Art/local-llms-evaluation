package org.traccar.protocol;

public class GeneratedTestDecodeGalileoMessageNoSession {

    @Test
    public void testDecodeGalileoMessageNoSession() {
        String[] expected = {"12345", "67890"};
        byte[] inputBuffer = Unpooled.buffer(4);
        new NetworkMessage(inputBuffer, null, null).encode(inputBuffer);
        Object actual = decodeGalileoProtocolDecoder(inputBuffer, null, null);
        assertEquals(expected[0], ((String) actual).split(":")[1].toCharArray());
        assertEquals(expected[1], ((String) actual).split(":")[0]);
    }

}