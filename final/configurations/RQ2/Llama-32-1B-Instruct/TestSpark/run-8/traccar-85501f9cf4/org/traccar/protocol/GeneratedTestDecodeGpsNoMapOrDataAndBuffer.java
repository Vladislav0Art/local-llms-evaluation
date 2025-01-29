package org.traccar.protocol;

public class GeneratedTestDecodeGpsNoMapOrDataAndBuffer {

    private Protocol protocol;

    @Test
    public void testDecodeGpsNoMapOrDataAndBuffer() throws Exception {
        // Given
        String input = "position: 37.7749,-122.4194";
        byte[] data = Unpooled.buffer(input.getBytes(StandardCharsets.UTF_8));

        // When
        boolean result = Gt06ProtocolDecoder.decodeGps(null, data);

        // Then
        assertFalse(result);
    }

}