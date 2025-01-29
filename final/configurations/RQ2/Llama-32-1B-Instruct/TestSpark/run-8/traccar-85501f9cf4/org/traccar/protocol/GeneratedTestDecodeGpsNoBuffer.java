package org.traccar.protocol;

public class GeneratedTestDecodeGpsNoBuffer {

    private Protocol protocol;

    @Test
    public void testDecodeGpsNoBuffer() throws Exception {
        // Given
        String input = "position: 37.7749,-122.4194";
        Map<String, Object> map = new HashMap<>();
        map.put("position", 37.7749, -122.4194);
        byte[] data = input.getBytes(StandardCharsets.UTF_8);

        // When
        boolean result = Gt06ProtocolDecoder.decodeGps(map.get("position"), Unpooled.buffer(data), false, true, true, null);

        // Then
        assertFalse(result);
    }

}