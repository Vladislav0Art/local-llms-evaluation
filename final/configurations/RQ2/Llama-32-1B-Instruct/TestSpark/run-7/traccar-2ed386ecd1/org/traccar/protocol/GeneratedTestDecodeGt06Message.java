package org.traccar.protocol;

public class GeneratedTestDecodeGt06Message {

    @Test
    public void testDecodeGt06Message() {
        // Arrange
        ByteBuf buf = Unpooled.buffer(1000);

        // Act
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol("Gt06"));
        boolean result = decoder.decodeGt06(buf, false, true, true, true, TimeZone.getTimeZone("America/New_York"));

        // Assert
        assertEquals(true, result);
    }

}