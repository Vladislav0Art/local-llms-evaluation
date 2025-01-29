package org.traccar.protocol;

public class GeneratedTestDecodeGpsNoHasLength {

    private Protocol protocol;

    @Test
    public void testDecodeGpsNoHasLength() throws Exception {
        // Given
        String input = "position: 37.7749,-122.4194";
        Map<String, Object> map = new HashMap<>();
        map.put("position", 37.7749, -122.4194);
        byte[] data = Unpooled.buffer(input.getBytes(StandardCharsets.UTF_8));

        // When
        boolean result = Gt06ProtocolDecoder.decodeGps(map.get("position"), data, false, null, true, null);

        // Then
        assertFalse(result);
    }

}