package org.traccar.protocol;

public class GeneratedTestDecodeNetworkMessageInvalid {

    @Test
    public void testDecodeNetworkMessageInvalid() {
        // Arrange
        ByteBuf byteBuf = new Unpooled();
        NetworkMessage networkMessage = new NetworkMessage(null, "1234");

        // Act and Assert
        try {
            decode(networkMessage, byteBuf);
        } catch (Exception e) {
            fail("Expected Exception");
        }
    }

    private Object decode(Position position, ByteBuf byteBuf) throws Exception {
        return Protocol.decode(position, byteBuf);
    }

}