package org.traccar.protocol;

public class GeneratedTest {

    public static void createDeviceSession() {
        return new DeviceSession();
    }

    public static Channel getChannel(DeviceSession deviceSession) {
        return new Channel(deviceSession);
    }

    @Test
    public void testDecodeNetworkMessage() throws Exception {
        NetworkMessage networkMessage = new NetworkMessage();
        networkMessage.setTimestamp(System.currentTimeMillis());
        networkMessage.setDeviceId("test_device");

        DeviceSession deviceSession = createDeviceSession();
        TestChannel channel = getChannel(deviceSession);
        Object decodeResult = channel.decode(networkMessage.getSocketAddress());

        assertEquals("test_device", decodeResult.toString());
    }
}

public class DeviceSession {
    public Channel channel;
    public int timestamp;
    public String deviceId;

    public DeviceSession() {
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        DeviceSession deviceSession = (DeviceSession) obj;

        if (timestamp != deviceSession.timestamp)
            return false;

        return deviceId.equals(deviceSession.deviceId);
    }

    @Override
    public int hashCode() {
        int result = timestamp;
        result = 31 * result + (deviceId == null ? 0 : deviceId.hashCode());
        return result;
    }
}

public class Channel implements AutoCloseable {
    private DeviceSession deviceSession;

    public Channel(DeviceSession deviceSession) {
        this.deviceSession = deviceSession;
    }

    @Override
    public void close() throws Exception {
        throw new UnsupportedOperationException();
    }

    @Override
    public synchronized Channel getSocketAddress() throws InterruptedException {
        return deviceSession.getChannel().getSocketAddress();
    }

    public Object decode(NetworkMessage networkMessage) throws Exception {
        DeviceSession deviceSession = createDeviceSession();
        TestChannel channel = getChannel(deviceSession);
        Object result = channel.decode(networkMessage.getSocketAddress());

        if (result instanceof String) {
            return (String) result;
        } else {
            throw new RuntimeException("Expected string value, got " + result.getClass().getName());
        }
    }

    public static Channel createDeviceSession() {
        return new Channel();
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