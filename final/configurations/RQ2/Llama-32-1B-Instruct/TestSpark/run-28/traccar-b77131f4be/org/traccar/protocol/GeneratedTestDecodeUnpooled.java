package org.traccar.protocol;

public class GeneratedTestDecodeUnpooled {

    @Test
    public void testDecodeUnpooled() {
        // Arrange
        ByteBuf byteBuf = Unpooled.buffer();
        byte[] bytes = {1, 2, 3};

        // Act
        Object result = decode(bytes, null);

        // Assert
        assertEquals("123", UnitsConverter.convertToString(result), "Bytes");
    }

}