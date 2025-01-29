package org.traccar.protocol;

public class GeneratedParseWifiAccessPoint_ReturnsNullWhenInvalidFormat {

    public MockBaseProtocolDecoderTest() {
    }

    @Test
    public void parseWifiAccessPoint_ReturnsNullWhenInvalidFormat() {
        WifiAccessPoint wifiAccessPoint = new WifiAccessPoint();
        assertNull(this.parse(wifiAccessPoint, null));
    }

}