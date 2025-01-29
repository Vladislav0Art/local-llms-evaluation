package org.traccar.protocol;

public class GeneratedTest {

    private Protocol protocol;

    @Test
    public void testDecodeGpsPosition() throws Exception {
        // Given
        String input = "position: 37.7749,-122.4194";
        ByteBuf buf = Unpooled.buffer(input.getBytes(StandardCharsets.UTF_8));

        // When
        boolean result = Gt06ProtocolDecoder.decodePosition(buf, false, null, true, true);

        // Then
        assertTrue(result);
    }

    @Test
    public void testDecodeGpsPositionNoLength() throws Exception {
        // Given
        String input = "position: 37.7749,-122.4194";
        ByteBuf buf = Unpooled.buffer(input.getBytes(StandardCharsets.UTF_8));

        // When
        boolean result = Gt06ProtocolDecoder.decodePosition(buf, true, null, true, true);

        // Then
        assertFalse(result);
    }

    @Test
    public void testDecodeGpsPositionNoSatellites() throws Exception {
        // Given
        String input = "position: 37.7749,-122.4194";
        ByteBuf buf = Unpooled.buffer(input.getBytes(StandardCharsets.UTF_8));

        // When
        boolean result = Gt06ProtocolDecoder.decodePosition(buf, true, null, false, true, true);

        // Then
        assertFalse(result);
    }

    @Test
    public void testDecodeGpsPositionNoSpeed() throws Exception {
        // Given
        String input = "position: 37.7749,-122.4194";
        ByteBuf buf = Unpooled.buffer(input.getBytes(StandardCharsets.UTF_8));

        // When
        boolean result = Gt06ProtocolDecoder.decodePosition(buf, true, null, false, false, true);

        // Then
        assertFalse(result);
    }

    @Test
    public void testDecodeGpsPositionNoTimezone() throws Exception {
        // Given
        String input = "position: 37.7749,-122.4194";
        ByteBuf buf = Unpooled.buffer(input.getBytes(StandardCharsets.UTF_8));

        // When
        boolean result = Gt06ProtocolDecoder.decodePosition(buf, true, null, false, false, TimeUnit.SECONDS);

        // Then
        assertFalse(result);
    }

    @Test
    public void testDecodeGpsPositionNoTimeZone() throws Exception {
        // Given
        String input = "position: 37.7749,-122.4194";
        ByteBuf buf = Unpooled.buffer(input.getBytes(StandardCharsets.UTF_8));

        // When
        boolean result = Gt06ProtocolDecoder.decodePosition(buf, true, null, false, false, null);

        // Then
        assertFalse(result);
    }

    @Test
    public void testDecodeGpsNoPosition() throws Exception {
        // Given
        String input = "position: 37.7749,-122.4194";
        ByteBuf buf = Unpooled.buffer(input.getBytes(StandardCharsets.UTF_8));

        // When
        boolean result = Gt06ProtocolDecoder.decode(position, buf, true, false, false, null);

        // Then
        assertFalse(result);
    }

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

    @Test
    public void testDecodeGpsNoBytes() throws Exception {
        // Given
        String input = "position: 37.7749,-122.4194";
        Map<String, Object> map = new HashMap<>();
        map.put("position", 37.7749, -122.4194);
        byte[] data = Unpooled.buffer(input.getBytes(StandardCharsets.UTF_8));

        // When
        boolean result = Gt06ProtocolDecoder.decodeGps(map.get("position"), data, false, true, true, null);

        // Then
        assertFalse(result);
    }

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

    @Test
    public void testDecodeGpsNoHasSatellites() throws Exception {
        // Given
        String input = "position: 37.7749,-122.4194";
        Map<String, Object> map = new HashMap<>();
        map.put("position", 37.7749, -122.4194);
        byte[] data = Unpooled.buffer(input.getBytes(StandardCharsets.UTF_8));

        // When
        boolean result = Gt06ProtocolDecoder.decodeGps(map.get("position"), data, false, false, true, null);

        // Then
        assertFalse(result);
    }

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

    @Test
    public void testDecodeGpsNoHasTimezone() throws Exception {
        // Given
        String input = "position: 37.7749,-122.4194";
        Map<String, Object> map = new HashMap<>();
        map.put("position", 37.7749, -122.4194);
        byte[] data = Unpooled.buffer(input.getBytes(StandardCharsets.UTF_8));

        // When
        boolean result = Gt06ProtocolDecoder.decodeGps(map.get("position"), data, false, null, true, TimeUnit.SECONDS);

        // Then
        assertFalse(result);
    }

    @Test
    public void testDecodeGpsNoTimezone() throws Exception {
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

    @Test
    public void testDecodeGpsNoBufferOrBytes() throws Exception {
        // Given
        String input = "position: 37.7749,-122.4194";
        Map<String, Object> map = new HashMap<>();
        map.put("position", 37.7749, -122.4194);
        byte[] data = Unpooled.buffer(input.getBytes(StandardCharsets.UTF_8));

        // When
        boolean result = Gt06ProtocolDecoder.decodeGps(map.get("position"), data);

        // Then
        assertFalse(result);
    }

    @Test
    public void testDecodeGpsNoHasPositionOrData() throws Exception {
        // Given
        String input = "position: 37.7749,-122.4194";
        Map<String, Object> map = new HashMap<>();
        byte[] data = Unpooled.buffer(input.getBytes(StandardCharsets.UTF_8));

        // When
        boolean result = Gt06ProtocolDecoder.decodeGps(null, data);

        // Then
        assertFalse(result);
    }

    @Test
    public void testDecodeGpsNoMapOrData() throws Exception {
        // Given
        String input = "position: 37.7749,-122.4194";
        byte[] data = Unpooled.buffer(input.getBytes(StandardCharsets.UTF_8));

        // When
        boolean result = Gt06ProtocolDecoder.decodeGps(null, data);

        // Then
        assertFalse(result);
    }

    @Test
    public void testDecodeGpsNoBufferOrBytesAndMap() throws Exception {
        // Given
        String input = "position: 37.7749,-122.4194";
        Map<String, Object> map = new HashMap<>();
        byte[] data = Unpooled.buffer(input.getBytes(StandardCharsets.UTF_8));

        // When
        boolean result = Gt06ProtocolDecoder.decodeGps(map.get("position"), data);

        // Then
        assertFalse(result);
    }

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

    @Test
    public void testDecodeGpsNoBufferOrBytesAndMap() throws Exception {
        // Given
        String input = "position: 37.7749,-122.4194";
        Map<String, Object> map = new HashMap<>();
        byte[] data = Unpooled.buffer(input.getBytes(StandardCharsets.UTF_8));

        // When
        boolean result = Gt06ProtocolDecoder.decodeGps(map.get("position"), data);

        // Then
        assertFalse(result);
    }

}