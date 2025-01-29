package org.traccar.protocol;

public class GeneratedTestDecodeDeviceSession {

    @Test
    public void testDecodeDeviceSession() {
        Channel channel = MockChannelMocker.create();
        SocketAddress remoteAddress = new SocketAddress("127.0.0.1", 9999);
        Object message = mock(Map.class, "message");
        Map<String, Object> deviceSession = new HashMap<>();
        deviceSession.put("device_id", "123");
        deviceSession.put("session_id", 456);
        Object result = GalileoProtocolDecoder.decode(channel, remoteAddress, message);
        assertEquals(DeviceSession.class, result.getClass());
    }

}