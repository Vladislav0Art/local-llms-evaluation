package org.traccar.protocol;

public class GeneratedTest {

    @Test
    public void testDecode_GalileoProtocol_GalileoMessage() throws Exception {
        Protocol protocol = new Protocol("Galileo");
        Channel channel = Unpooled.buffer().channel();
        DeviceSession session = new DeviceSession("Device", "IP:192.168.1.100", "Port:8080", null, null);
        NetworkMessage msg = new NetworkMessage(new Position(37.7749, -122.4194), "Galileo", channel, session);
        Object response = decode(channel, msg.getRemoteAddress(), msg.getMessage());
        assertNotNull(response);
    }

    @Test
    public void testDecode_GalileoProtocol_Telegram() throws Exception {
        Protocol protocol = new Protocol("TeleGram");
        Channel channel = Unpooled.buffer().channel();
        DeviceSession session = new DeviceSession("Device", "IP:192.168.1.100", "Port:8080", null, null);
        NetworkMessage msg = new NetworkMessage(new Position(37.7749, -122.4194), "TeleGram", channel, session);
        Object response = decode(channel, msg.getRemoteAddress(), msg.getMessage());
        assertNotNull(response);
    }

    @Test
    public void testDecode_GalileoProtocol_Telnet() throws Exception {
        Protocol protocol = new Protocol("Telnet");
        Channel channel = Unpooled.buffer().channel();
        DeviceSession session = new DeviceSession("Device", "IP:192.168.1.100", "Port:8080", null, null);
        NetworkMessage msg = new NetworkMessage(new Position(37.7749, -122.4194), "Telnet", channel, session);
        Object response = decode(channel, msg.getRemoteAddress(), msg.getMessage());
        assertNotNull(response);
    }

    @Test
    public void testDecode_GalileoProtocol_Garmin() throws Exception {
        Protocol protocol = new Protocol("Garmin");
        Channel channel = Unpooled.buffer().channel();
        DeviceSession session = new DeviceSession("Device", "IP:192.168.1.100", "Port:8080", null, null);
        NetworkMessage msg = new NetworkMessage(new Position(37.7749, -122.4194), "Garmin", channel, session);
        Object response = decode(channel, msg.getRemoteAddress(), msg.getMessage());
        assertNotNull(response);
    }

    @Test
    public void testDecode_GalileoProtocol_Radar() throws Exception {
        Protocol protocol = new Protocol("Radar");
        Channel channel = Unpooled.buffer().channel();
        DeviceSession session = new DeviceSession("Device", "IP:192.168.1.100", "Port:8080", null, null);
        NetworkMessage msg = new NetworkMessage(new Position(37.7749, -122.4194), "Radar", channel, session);
        Object response = decode(channel, msg.getRemoteAddress(), msg.getMessage());
        assertNotNull(response);
    }

    @Test
    public void testDecode_GalileoProtocol_Lidar() throws Exception {
        Protocol protocol = new Protocol("LiDAR");
        Channel channel = Unpooled.buffer().channel();
        DeviceSession session = new DeviceSession("Device", "IP:192.168.1.100", "Port:8080", null, null);
        NetworkMessage msg = new NetworkMessage(new Position(37.7749, -122.4194), "LiDAR", channel, session);
        Object response = decode(channel, msg.getRemoteAddress(), msg.getMessage());
        assertNotNull(response);
    }

    @Test
    public void testDecode_GalileoProtocol_GeoLocation() throws Exception {
        Protocol protocol = new Protocol("GeoLocation");
        Channel channel = Unpooled.buffer().channel();
        DeviceSession session = new DeviceSession("Device", "IP:192.168.1.100", "Port:8080", null, null);
        NetworkMessage msg = new NetworkMessage(new Position(37.7749, -122.4194), "GeoLocation", channel, session);
        Object response = decode(channel, msg.getRemoteAddress(), msg.getMessage());
        assertNotNull(response);
    }

    @Test
    public void testDecode_GalileoProtocol_NMEA() throws Exception {
        Protocol protocol = new Protocol("NMEA");
        Channel channel = Unpooled.buffer().channel();
        DeviceSession session = new DeviceSession("Device", "IP:192.168.1.100", "Port:8080", null, null);
        NetworkMessage msg = new NetworkMessage(new Position(37.7749, -122.4194), "NMEA", channel, session);
        Object response = decode(channel, msg.getRemoteAddress(), msg.getMessage());
        assertNotNull(response);
    }

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