package org.traccar.protocol;

public class GeneratedTestDecodeWifiAccessPoint {

    @Test
    public void testDecodeWifiAccessPoint() throws Exception {
        WifiAccessPoint wifiAccessPoint = createWifiAccessPoint();
        DeviceSession deviceSession = createDeviceSession(wifiAccessPoint, "DeviceID");

        Protocol protocol = new Protocol();
        BaseProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertNotNull(decoder.decode(channel, null, wifiAccessPoint) instanceof WifiAccessPoint);
    }

}