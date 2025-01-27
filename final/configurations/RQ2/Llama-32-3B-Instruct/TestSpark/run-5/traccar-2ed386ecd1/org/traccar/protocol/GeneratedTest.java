package org.traccar.protocol;

public class GeneratedTest {

    private int latitude;
    private int longitude;
    private int altitude;

    public DeviceSession(int latitude, int longitude, int altitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
    }

    public String toJson() {
        return "{\"latitude\":" + latitude + ",\"longitude\":" + longitude + ",\"altitude\":" + altitude + "}";
    }
}

public class NetworkMessage {
    private int id;
    private byte[] payload;

    public NetworkMessage(int id, byte[] payload) {
        this.id = id;
        this.payload = payload;
    }

    public String getId() {
        return Integer.toHexString(id);
    }

    public byte[] getPayload() {
        return payload;
    }
}

public class ByteBuf {
    private byte[] buffer;

    public ByteBuf(int size) {
        buffer = new byte[size];
    }

    public int readInt() {
        // Assuming the most significant 32 bits are used for integer
        int result = 0;
        for (int i = 31; i >= 0; i--) {
            result |= (buffer[i + 3] & 0x7F) << i;
            if (i != 0) buffer[i + 3] >>= 7;
        }
        return result;
    }

    public void writeInt(int value) {
        // Using the most significant 32 bits
        int index = 31;
        for (int i = 31; i >= 0; i--) {
            byte b = (byte) ((value >> i) & 0x7F);
            buffer[index + 3 - i] = b;
            if (i != 0) b >>= 7;
            buffer[index + 3 - i] |= (byte) (b << (7 - i));
        }
    }

    public void print() {
        System.out.print(new String(buffer, 0, buffer.length));
    }
}

public class Position {
    private int latitude;
    private int longitude;

    public Position(int latitude, int longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getDistanceFromOrigin() {
        return Math.sqrt(latitude * latitude + longitude * longitude);
    }
}

public class PositionWithSpeedAndSatellites extends Position {
    private String speed;
    private boolean hasSatellites;

    public PositionWithSpeedAndSatellites(int latitude, int longitude, String speed, boolean hasSatellites) {
        super(latitude, longitude);
        this.speed = speed;
        this.hasSatellites = hasSatellites;
    }

    public double getDistanceFromOrigin() {
        return Math.sqrt(getLatitude() * getLatitude() + getLongitude() * getLongitude());
    }
}

public class PositionWithSpeed extends Position {
    private String speed;

    public PositionWithSpeed(int latitude, int longitude, String speed) {
        super(latitude, longitude);
        this.speed = speed;
    }

    public double getDistanceFromOrigin() {
        return Math.sqrt(getLatitude() * getLatitude() + getLongitude() * getLongitude());
    }
}

public class PositionWithSatellites extends Position {
    private boolean hasSatellites;

    public PositionWithSatellites(int latitude, int longitude, boolean hasSatellites) {
        super(latitude, longitude);
        this.hasSatellites = hasSatellites;
    }

    public double getDistanceFromOrigin() {
        return Math.sqrt(getLatitude() * getLatitude() + getLongitude() * getLongitude());
    }
}

public class GeneratedTest {

    public DeviceSession deviceSession;
    public NetworkMessage networkMessage;
    public ByteBuf buf;

    @Before
    public void setUp() {
        deviceSession = new DeviceSession(0, 0, 0);
        networkMessage = new NetworkMessage(1, new byte[10]);
        buf = new ByteBuf(100);
    }

    @Test
    public void testToJson() {
        String json = deviceSession.toJson();
        System.out.println(json);

        json = networkMessage.getId() + ":" + java.util.Base64.getEncoder().encodeToString(networkMessage.getPayload());
        System.out.println(json);

        buf.writeInt(123);
        buf.print();
    }

    @Test
    public void testDistanceFromOrigin() {
        double distance = new Position(0, 0).getDistanceFromOrigin();
        assert Math.isClose(distance, 0.0, 1e-10) : "Distance from origin is not zero";
    }

}