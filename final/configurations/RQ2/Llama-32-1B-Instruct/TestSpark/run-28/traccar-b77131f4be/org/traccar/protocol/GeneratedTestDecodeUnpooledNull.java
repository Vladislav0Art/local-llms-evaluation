package org.traccar.protocol;

public class GeneratedTestDecodeUnpooledNull {

    @Test
    public void testDecodeUnpooledNull() {
        // Arrange
        ByteBuf byteBuf = Unpooled.buffer();
        byte[] bytes = new byte[0];

        // Act and Assert
        try {
            decode(bytes, null);
        } catch (Exception e) {
            fail("Expected Exception");
        }
    }

}