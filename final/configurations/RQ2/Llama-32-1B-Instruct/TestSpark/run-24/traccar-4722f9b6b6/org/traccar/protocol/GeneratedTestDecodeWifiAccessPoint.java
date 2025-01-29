package org.traccar.protocol;

public class GeneratedTestDecodeWifiAccessPoint {

    @Test
    public void testDecodeWifiAccessPoint() {
        Protocol protocol = new Protocol();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        WifiAccessPoint wifiAccessPoint = decoder.decode(WifiAccessPoint.class, SocketAddress.inbound(0x0004));
        Assert.assertNotNull(wifiAccessPoint);
    }

}