package org.traccar.protocol;

public class GeneratedTestDecodeBitBuffer {

    @Test
    public void testDecodeBitBuffer() {
        BitBuffer bitBuffer = new BitBuffer();
        byte[] bytes = ByteBufUtil.toBytes("Hello".getBytes(StandardCharsets.UTF_8));
        Object decodedBitBuffer = GalileoProtocolDecoder.decode(bytes, null, null);
        assertNotNull(decodedBitBuffer);
    }

}