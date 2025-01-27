package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTestWifiAccessPoint {

    @Test
    public void testWifiAccessPoint() {
        WifiAccessPoint accessPoint = new WifiAccessPoint();
        assertNotNull(accessPoint);
        assertTrue(accessPoint instanceof Object);

        String macAddress = "00:11:22:33:44:55";
        accessPoint.setMacAddress(macAddress);
        assertEquals(macAddress, accessPoint.getMacAddress());

        int signalStrength = -50;
        accessPoint.setSignalStrength(signalStrength);
        assertEquals(signalStrength, accessPoint.getSignalStrength());
    }
}

class WifiAccessPoint {
    private String macAddress;
    private int signalStrength;

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setSignalStrength(int signalStrength) {
        this.signalStrength = signalStrength;
    }

    public int getSignalStrength() {
        return signalStrength;
    }
}

class NetworkMessage {
    private WifiAccessPoint wifiAccessPoint;

    public void setWifiAccessPoint(WifiAccessPoint wifiAccessPoint) {
        this.wifiAccessPoint = wifiAccessPoint;
    }

    public String getWifiAccessPoint() {
        return wifiAccessPoint.getMacAddress();
    }
}

class WatchProtocolDecoder {
    private int protocolType;

    public void setProtocolType(int protocolType) {
        this.protocolType = protocolType;
    }

    public int getProtocolType() {
        return protocolType;
    }

}