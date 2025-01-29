package org.traccar.protocol;

public class GeneratedTestDecodeValidGalileoHeader {

    @Test
    public void testDecodeValidGalileoHeader() {
        Channel channel = Unpooled.buffer().writeBytes("{\n" +
                "  \"header\":{\"timestamp\":1643723400,\"type\":\"galileo\"},\n" +
                "  \"data\":{\"latitude\":37.7749,\"longitude\":-122.4194,\"accuracy\":2}}");
        byte[] bytes = channel.readUntil(new PacketReader(), new byte[]{0x00, 0x00});
        Object decodedMessage = decode(bytes);
        Assert.assertNotNull(decodedMessage);
    }

}