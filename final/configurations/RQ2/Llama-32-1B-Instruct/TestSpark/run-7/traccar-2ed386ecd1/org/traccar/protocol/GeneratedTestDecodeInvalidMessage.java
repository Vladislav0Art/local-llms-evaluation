package org.traccar.protocol;

public class GeneratedTestDecodeInvalidMessage {

    @Test
    public void testDecodeInvalidMessage() {
        // Arrange
        ByteBuf buf = Unpooled.buffer(10);

        // Act
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol("Invalid"));
        boolean result = decoder.decodeGt06(buf, false, true, true, true, TimeZone.getTimeZone("America/New_York"));

        // Assert
        assertEquals(false, result);
    }

}