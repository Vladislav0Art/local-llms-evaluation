package org.traccar.protocol;

public class GeneratedTestDecodeUnpooledInvalid {

    @Test
    public void testDecodeUnpooledInvalid() {
        // Arrange
        ByteBuf byteBuf = Unpooled.buffer();
        byte[] bytes = {1, 2};

        // Act and Assert
        try {
            decode(bytes, null);
        } catch (Exception e) {
            fail("Expected Exception");
        }
    }

}