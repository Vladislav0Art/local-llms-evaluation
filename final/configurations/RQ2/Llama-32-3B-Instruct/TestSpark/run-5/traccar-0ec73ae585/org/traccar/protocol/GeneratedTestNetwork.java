package org.traccar.protocol;

import org.junit.jupiter.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestNetwork {

    private double latitude;
    private double longitude;

    public Position(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}

public class CellTower {
    private String id;
    private int signalStrength;

    public CellTower(String id, int signalStrength) {
        this.id = id;
        this.signalStrength = signalStrength;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSignalStrength() {
        return signalStrength;
    }

    public void setSignalStrength(int signalStrength) {
        this.signalStrength = signalStrength;
    }
}

public class WifiAccessPoint {
    private String macAddress;

    public WifiAccessPoint(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }
}

public class Network {
    private String id;
    private int speed;

    public Network(String id, int speed) {
        this.id = id;
        this.speed = speed;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

import org.junit.jupiter.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestNetwork {

    @Test
    public void testNetwork() throws IOException {
        Network network = new Network("network-1", 100);
        Position position = new Position(37.7749, -122.4194);

        CellTower cellTower = new CellTower("celltower-1", 50);

        WifiAccessPoint wifiAccessPoint = new WifiAccessPoint("00:11:22:33:44:55");

        assertEquals(network.getId(), "network-1");
        assertEquals(position.getLatitude(), 37.7749);
        assertEquals(cellTower.getId(), "celltower-1");
        assertEquals(wifiAccessPoint.getMacAddress(), "00:11:22:33:44:55");
    }

}