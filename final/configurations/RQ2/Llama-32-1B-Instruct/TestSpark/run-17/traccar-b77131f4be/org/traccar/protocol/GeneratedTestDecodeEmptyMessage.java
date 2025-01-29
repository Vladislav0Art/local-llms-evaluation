package org.traccar.protocol;

public class GeneratedTestDecodeEmptyMessage {

    @Test
    public void testDecodeEmptyMessage() {
        Channel channel = Unpooled.buffer().writeBytes("");
        byte[] bytes = channel.readUntil(new PacketReader(), new byte[]{0x00, 0x00});
        Object decodedMessage = decode(bytes);
        Assert.assertNull(decodedMessage);
    }

}