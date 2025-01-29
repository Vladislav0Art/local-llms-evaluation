package org.traccar.protocol;

public class GeneratedTestDecodeSocketAddress {

    @Test
    public void testDecodeSocketAddress() {
        SocketAddress socketAddress = new SocketAddress("192.168.1.100:8080");
        NetworkMessage message = new NetworkMessage(null);
        byte[] bytes = ByteBufUtil.toBytes(socketAddress);
        Object decodedSocketAddress = GalileoProtocolDecoder.decode(bytes, null, message);
        assertNotNull(decodedSocketAddress);
    }

}