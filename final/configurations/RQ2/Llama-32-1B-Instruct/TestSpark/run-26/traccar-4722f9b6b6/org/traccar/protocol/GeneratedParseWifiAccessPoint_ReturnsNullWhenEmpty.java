package org.traccar.protocol;

public class GeneratedParseWifiAccessPoint_ReturnsNullWhenEmpty {

    public MockBaseProtocolDecoderTest() {
    }

    @Test
    public void parseWifiAccessPoint_ReturnsNullWhenEmpty() {
        WifiAccessPoint wifiAccessPoint = new WifiAccessPoint("");
        assertNull(this.parse(wifiAccessPoint, null));
    }

}