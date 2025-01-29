package org.traccar.protocol;

public class GeneratedTestDecode_GalileoProtocol_GalileoMessage {

    @Test
    public void testDecode_GalileoProtocol_GalileoMessage() throws Exception {
        Protocol protocol = new Protocol("Galileo");
        Channel channel = Unpooled.buffer().channel();
        DeviceSession session = new DeviceSession("Device", "IP:192.168.1.100", "Port:8080", null, null);
        NetworkMessage msg = new NetworkMessage(new Position(37.7749, -122.4194), "Galileo", channel, session);
        Object response = decode(channel, msg.getRemoteAddress(), msg.getMessage());
        assertNotNull(response);
    }

}