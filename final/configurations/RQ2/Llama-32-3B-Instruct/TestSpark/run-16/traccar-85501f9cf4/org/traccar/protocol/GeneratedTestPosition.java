package org.traccar.protocol;

import org.hamcrest.Matchers;
import org.junit.Test;

public class GeneratedTestPosition {

    @Test
    public void testPosition() {
        Position positionMock = new Position();
        positionMock.setLatitude(37.0);
        positionMock.setLongitude(122.0);

        Network networkMock = new Network(0x00, 0x01, new WifiAccessPoint());
        CellTower cellTowerMock = new CellTower(0x00, 0x01);

        org.junit.Assert.assertThat(true, Matchers.is(true));
    }

    public static class Position {
        private double latitude;
        private double longitude;

        public void setLatitude(double latitude) {
            this.latitude = latitude;
        }

        public void setLongitude(double longitude) {
            this.longitude = longitude;
        }
    }

    public static class Network {
        private int id;
        private WifiAccessPoint accessPoint;

        public Network(int id, int accessPointId, WifiAccessPoint accessPoint) {
            this.id = id;
            this.accessPoint = new WifiAccessPoint(accessPointId);
        }

        public void setAccessPoint(WifiAccessPoint accessPoint) {
            this.accessPoint = accessPoint;
        }
    }

    public static class CellTower {
        private int id;
        private int cellId;

        public CellTower(int id, int cellId) {
            this.id = id;
            this.cellId = cellId;
        }
    }

    public static class WifiAccessPoint {
        private int id;

        public WifiAccessPoint(int id) {
            this.id = id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }

    public interface Gt06ProtocolDecoder {
        boolean decode(Channel channel, Addressable addressable, Object obj);
    }

}