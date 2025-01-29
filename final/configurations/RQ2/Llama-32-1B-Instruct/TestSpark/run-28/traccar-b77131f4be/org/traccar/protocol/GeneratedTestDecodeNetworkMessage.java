package org.traccar.protocol;

public class GeneratedTestDecodeNetworkMessage {

    @Test
    public void testDecodeNetworkMessage() {
        // Arrange
        ByteBuf byteBuf = new Unpooled();
        NetworkMessage networkMessage = new NetworkMessage("Hello World", "1234");

        // Act
        Object result = decode(networkMessage, byteBuf);

        // Assert
        assertEquals("Hello World", UnitsConverter.convertToString(result), "String");
    }

}