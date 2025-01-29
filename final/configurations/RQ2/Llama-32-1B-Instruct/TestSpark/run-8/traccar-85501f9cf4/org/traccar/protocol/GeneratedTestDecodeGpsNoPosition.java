package org.traccar.protocol;

public class GeneratedTestDecodeGpsNoPosition {

    private Protocol protocol;

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

}