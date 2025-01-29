package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetNetworkInfo {

    public WifiAccessPoint WifiAccessPoint() {
        return new WifiAccessPoint();
    }

    @Test
    public void testGetNetworkInfo() throws Exception {
        WifiAccessPoint wifiAccessPoint = WifiAccessPoint();
        WifiAccessPoint.WifiNetworkInfo networkInfo = new WifiAccessPoint.WifiNetworkInfo();

        networkInfo.setManufacturer("Apple");
        networkInfo.setAccessPointType(1);

        Object decodedObject = Decoder.decode(wifiAccessPoint, networkInfo, null);
        assertEquals(networkInfo, (WifiAccessPoint.WifiNetworkInfo) decodedObject);

        decodedObject = Decoder.decode(wifiAccessPoint, new WifiAccessPoint(), null);
        assertEquals(networkInfo, (WifiAccessPoint.WifiNetworkInfo) decodedObject);
    }

    public static class Decoder {
        public Object decode(WifiAccessPoint wifiAccessPoint, WifiAccessPoint.WifiNetworkInfo networkInfo, Object data) {
            // Mocking the decoding process
            return networkInfo;
        }
    }

}