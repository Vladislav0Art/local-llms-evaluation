package org.traccar.protocol;

public class GeneratedTestDecodePosition {

    @Test
    public void testDecodePosition() {
        DeviceSession device = new DeviceSession();
        Position position = new Position(1, 2, 3, Calendar.getInstance());
        NetworkMessage message = new NetworkMessage(device);
        byte[] bytes = ByteBufUtil.toBytes(message);
        Object decodedPosition = GalileoProtocolDecoder.decode(bytes, null, message);
        assertEquals(position, (Position) decodedPosition);
    }

}