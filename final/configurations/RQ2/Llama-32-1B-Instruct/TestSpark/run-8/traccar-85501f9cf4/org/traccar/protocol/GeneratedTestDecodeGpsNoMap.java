package org.traccar.protocol;

public class GeneratedTestDecodeGpsNoMap {

    private Protocol protocol;

    @Test
    public void testDecodeGpsNoMap() throws Exception {
        // Given
        String input = "position: 37.7749,-122.4194";
        byte[] data = Unpooled.buffer(input.getBytes(StandardCharsets.UTF_8));

        // When
        boolean result = Gt06ProtocolDecoder.decodeGps(null, data, true, false, false, null);

        // Then
        assertFalse(result);
    }

}