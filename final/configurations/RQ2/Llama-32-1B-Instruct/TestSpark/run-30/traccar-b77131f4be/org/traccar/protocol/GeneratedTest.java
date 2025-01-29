package org.traccar.protocol;

public class GeneratedTest {

    @Test
    public void testDecodePosition() {
        DeviceSession device = new DeviceSession();
        Position position = new Position(1, 2, 3, Calendar.getInstance());
        NetworkMessage message = new NetworkMessage(device);
        byte[] bytes = ByteBufUtil.toBytes(message);
        Object decodedPosition = GalileoProtocolDecoder.decode(bytes, null, message);
        assertEquals(position, (Position) decodedPosition);
    }

    @Test
    public void testDecodeDeviceSession() {
        DeviceSession device = new DeviceSession();
        NetworkMessage message = new NetworkMessage(device);
        byte[] bytes = ByteBufUtil.toBytes(message);
        Object decodedDeviceSession = GalileoProtocolDecoder.decode(bytes, null, message);
        assertNotNull(decodedDeviceSession);
    }

    @Test
    public void testDecodeTime() {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        byte[] bytes = ByteBufUtil.toBytes(calendar.getTime());
        Object decodedTime = GalileoProtocolDecoder.decode(bytes, null, null);
        assertEquals(date, (Date) decodedTime);
    }

    @Test
    public void testDecodeUnits() {
        String units = "m";
        byte[] bytes = ByteBufUtil.toBytes("Hello".getBytes(StandardCharsets.UTF_8));
        Object decodedUnits = GalileoProtocolDecoder.decode(bytes, null, null);
        assertEquals(units, (String) decodedUnits);
    }

    @Test
    public void testDecodeBitBuffer() {
        BitBuffer bitBuffer = new BitBuffer();
        byte[] bytes = ByteBufUtil.toBytes("Hello".getBytes(StandardCharsets.UTF_8));
        Object decodedBitBuffer = GalileoProtocolDecoder.decode(bytes, null, null);
        assertNotNull(decodedBitBuffer);
    }

    @Test
    public void testDecodeSocketAddress() {
        SocketAddress socketAddress = new SocketAddress("192.168.1.100:8080");
        NetworkMessage message = new NetworkMessage(null);
        byte[] bytes = ByteBufUtil.toBytes(socketAddress);
        Object decodedSocketAddress = GalileoProtocolDecoder.decode(bytes, null, message);
        assertNotNull(decodedSocketAddress);
    }

    @Test
    public void testDecodeCalendar() {
        Calendar calendar = Calendar.getInstance();
        byte[] bytes = ByteBufUtil.toBytes(calendar.getTime());
        Object decodedCalendar = GalileoProtocolDecoder.decode(bytes, null, null);
        assertNotNull(decodedCalendar);
    }

}