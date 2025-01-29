package org.traccar.protocol;

public class GeneratedTestDecodeMessage {

    @Test
    public void testDecodeMessage() {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        NetworkMessage message = new NetworkMessage(4, "Hello", null);
        Channel channel = Unpooled.buffer();
        byte[] bytes = channel.writeBytes(message.encode());
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("Galileo"));
        Object decodedMessage = decoder.decode(channel, null, bytes);
        assertNotNull(decodedMessage);
    }

}