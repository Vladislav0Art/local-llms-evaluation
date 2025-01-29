package org.traccar.protocol;

public class GeneratedTestDecode_GalileoProtocol_NMEA_2 {

    @Test
    public void testDecode_GalileoProtocol_NMEA_2() throws Exception {
        Protocol protocol = new Protocol("NMEA2");
        Channel channel = Unpooled.buffer().channel();
        DeviceSession session = new DeviceSession("Device", "IP:192.168.1.100", "Port:8080", null, null);
        NetworkMessage msg = new NetworkMessage(new Position(37.7749, -122.4194), "NMEA2", channel, session);
        Object response = decode(channel, msg.getRemoteAddress(), msg.getMessage());
        assertNotNull(response);
    }

}