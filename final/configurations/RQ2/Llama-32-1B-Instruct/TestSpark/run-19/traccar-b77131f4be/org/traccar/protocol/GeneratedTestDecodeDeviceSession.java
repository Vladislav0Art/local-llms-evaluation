package org.traccar.protocol;

public class GeneratedTestDecodeDeviceSession {

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

}