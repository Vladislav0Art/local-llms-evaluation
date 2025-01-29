package org.traccar.protocol;

public class GeneratedTestDecodeGalileoSession {

    @Test
    public void testDecodeGalileoSession() {
        String[] expected = {"2023-03-17", "00:00"};
        byte[] inputBuffer = Unpooled.buffer(4);
        new DeviceSession(inputBuffer, null, null).encode(inputBuffer);
        Object actual = decodeGalileoProtocolDecoder(inputBuffer, null, null);
        assertEquals(expected[0], ((String) actual).split(":")[0]);
        assertEquals(expected[1], ((String) actual).split(":")[1].toCharArray());
    }

}