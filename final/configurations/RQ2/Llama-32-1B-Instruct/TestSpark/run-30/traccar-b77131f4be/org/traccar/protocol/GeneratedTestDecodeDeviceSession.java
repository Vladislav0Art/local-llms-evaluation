package org.traccar.protocol;

public class GeneratedTestDecodeDeviceSession {

    @Test
    public void testDecodeDeviceSession() {
        DeviceSession device = new DeviceSession();
        NetworkMessage message = new NetworkMessage(device);
        byte[] bytes = ByteBufUtil.toBytes(message);
        Object decodedDeviceSession = GalileoProtocolDecoder.decode(bytes, null, message);
        assertNotNull(decodedDeviceSession);
    }

}