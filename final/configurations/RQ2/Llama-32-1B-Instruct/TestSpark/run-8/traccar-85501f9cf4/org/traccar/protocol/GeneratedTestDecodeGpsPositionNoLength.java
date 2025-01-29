package org.traccar.protocol;

public class GeneratedTestDecodeGpsPositionNoLength {

    private Protocol protocol;

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

}