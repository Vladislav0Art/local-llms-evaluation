package org.traccar.protocol;

public class GeneratedTestDecodeNetwork {

    @Test
    public void testDecodeNetwork() throws Exception {
        Network network = createNetwork("NetworkName", 1000);
        DeviceSession deviceSession = createDeviceSession(network, "DeviceID");

        Protocol protocol = new Protocol();
        BaseProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertNotNull(decoder.decode(channel, null, network) instanceof Network);
    }

}