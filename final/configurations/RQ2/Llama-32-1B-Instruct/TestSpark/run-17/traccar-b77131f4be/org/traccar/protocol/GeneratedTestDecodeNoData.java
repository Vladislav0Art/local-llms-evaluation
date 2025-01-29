package org.traccar.protocol;

public class GeneratedTestDecodeNoData {

    @Test
    public void testDecodeNoData() {
        Channel channel = Unpooled.buffer().writeBytes("{\n" +
                "  \"header\":{\n" +
                "   \"timestamp\":1643723400,\n" +
                "   \"type\":\"galileo\"}\n" +
                "}";
        byte[] bytes = channel.readUntil(new PacketReader(), new byte[]{0x00, 0x00});
        Object decodedMessage = decode(bytes);
        Assert.assertNull(decodedMessage);
    }

}