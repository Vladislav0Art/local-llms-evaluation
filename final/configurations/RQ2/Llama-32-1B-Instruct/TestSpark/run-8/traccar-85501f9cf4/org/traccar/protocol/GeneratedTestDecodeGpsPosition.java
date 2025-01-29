package org.traccar.protocol;

public class GeneratedTestDecodeGpsPosition {

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

}