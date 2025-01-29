package org.traccar.protocol;

public class GeneratedTestDecodeNetworkMessageToString {

    public static void createDeviceSession() {
        return new DeviceSession();
    }

    public static Channel getChannel(DeviceSession deviceSession) {
        return new Channel(deviceSession);
    }

    @Test
    public void testDecodeNetworkMessageToString() throws Exception {
        NetworkMessage networkMessage = new NetworkMessage();
        networkMessage.setTimestamp(System.currentTimeMillis());
        networkMessage.setDeviceId("test_device");

        DeviceSession deviceSession = createDeviceSession();
        TestChannel channel = getChannel(deviceSession);
        Object decodeResult = channel.decode(networkMessage.getSocketAddress());

        assertEquals("test_device", decodeResult.toString());
    }

}