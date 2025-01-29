package org.traccar.protocol;

public class GeneratedTestDecodePosition {

    @Test
    public void testDecodePosition() {
        Position position = new Position(10, 20);
        NetworkMessage message = new NetworkMessage(1, "Hello", position);
        Channel channel = Unpooled.buffer();
        byte[] bytes = channel.writeBytes(message.encode());
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("Galileo"));
        Object decodedPosition = decoder.decode(channel, null, bytes);
        assertNotNull(decodedPosition);
    }

}