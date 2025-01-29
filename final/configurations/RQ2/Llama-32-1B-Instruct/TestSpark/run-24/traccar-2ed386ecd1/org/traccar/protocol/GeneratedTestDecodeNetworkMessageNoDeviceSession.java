package org.traccar.protocol;

public class GeneratedTestDecodeNetworkMessageNoDeviceSession {

    private Protocol protocol;

    @Test
    public void testDecodeNetworkMessageNoDeviceSession() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        ByteBuf buf = Unpooled.buffer(10);
        // No device session present
    }

}