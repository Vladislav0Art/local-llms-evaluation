package org.traccar.protocol;

public class GeneratedTestDecodeNoPadding {

    @Test
    public void testDecodeNoPadding() {
        Channel channel = Unpooled.buffer().writeBytes("{\n" +
                "  \"header\":{\"timestamp\":1643723400,\"type\":\"galileo\"}\n" +
                "}";
        byte[] bytes = channel.readUntil(new PacketReader(), new byte[]{0x00, 0x00});
        Object decodedMessage = decode(bytes);
        Assert.assertNull(decodedMessage);
    }

}