package org.traccar.protocol;

public class GeneratedTestDecodePosition {

    @Test
    public void testDecodePosition() {
        Protocol protocol = new Protocol();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Position position = decoder.decode(Position.class, SocketAddress.inbound(0x0003));
        Assert.assertNotNull(position);
    }

}