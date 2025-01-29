package org.traccar.protocol;

public class GeneratedTestDecode_GalileoProtocol_Lidar {

    @Test
    public void testDecode_GalileoProtocol_Lidar() throws Exception {
        Protocol protocol = new Protocol("LiDAR");
        Channel channel = Unpooled.buffer().channel();
        DeviceSession session = new DeviceSession("Device", "IP:192.168.1.100", "Port:8080", null, null);
        NetworkMessage msg = new NetworkMessage(new Position(37.7749, -122.4194), "LiDAR", channel, session);
        Object response = decode(channel, msg.getRemoteAddress(), msg.getMessage());
        assertNotNull(response);
    }

}