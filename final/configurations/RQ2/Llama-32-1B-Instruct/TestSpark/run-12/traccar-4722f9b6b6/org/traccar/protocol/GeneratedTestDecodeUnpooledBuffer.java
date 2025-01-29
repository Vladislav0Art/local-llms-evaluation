package org.traccar.protocol;

public class GeneratedTestDecodeUnpooledBuffer {

    @Test
    public void testDecodeUnpooledBuffer() {
        ByteBuf byteBuf = MockByteBuf.create();
        String encodedMessage = encodeString("Hello");
        assertEquals(1024, encodedMessage.length(), 0);
        Object decodedMessage;
        try {
            decodedMessage = decoder.decode(byteBuf, null, encodedMessage);
        } catch (Exception e) {
            return;
        }
        assertNotNull(decodedMessage);
        assertTrue(decodedMessage instanceof String);
    }

}