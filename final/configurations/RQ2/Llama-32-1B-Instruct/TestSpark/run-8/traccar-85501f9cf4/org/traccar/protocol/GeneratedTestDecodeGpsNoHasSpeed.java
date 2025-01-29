package org.traccar.protocol;

public class GeneratedTestDecodeGpsNoHasSpeed {

    private Protocol protocol;

    @Test
    public void testDecodeGpsNoHasSpeed() throws Exception {
        // Given
        String input = "position: 37.7749,-122.4194";
        Map<String, Object> map = new HashMap<>();
        map.put("position", 37.7749, -122.4194);
        byte[] data = Unpooled.buffer(input.getBytes(StandardCharsets.UTF_8));

        // When
        boolean result = Gt06ProtocolDecoder.decodeGps(map.get("position"), data, false, false, false, true);

        // Then
        assertFalse(result);
    }

}