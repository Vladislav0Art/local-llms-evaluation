package org.traccar.protocol;

public class GeneratedTestDecodePosition {

    @Test
    public void testDecodePosition() {
        Channel channel = MockChannelMocker.create();
        SocketAddress remoteAddress = new SocketAddress("127.0.0.1", 9999);
        Object message = mock(Map.class, "message");
        Map<String, Object> position = new HashMap<>();
        position.put("x", 10);
        position.put("y", 20);
        Object result = GalileoProtocolDecoder.decode(channel, remoteAddress, message);
        assertEquals(Position.class, result.getClass());
    }

}