package org.traccar.protocol;

public class GeneratedTest {

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

    @Test
    public void testDecodeDeviceSession() {
        DeviceSession deviceSession = new DeviceSession(1, "device1", 2);
        NetworkMessage message = new NetworkMessage(3, "Hello", deviceSession);
        Channel channel = Unpooled.buffer();
        byte[] bytes = channel.writeBytes(message.encode());
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("Galileo"));
        Object decodedDeviceSession = decoder.decode(channel, null, bytes);
        assertNotNull(decodedDeviceSession);
    }

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