package org.traccar.protocol;

public class GeneratedTestDecodeWithSpeed {

    public static boolean decodeGps(Position position, ByteBuf buf, boolean withLength, boolean withSpeed) {
        // implementation of the method
    }

    public interface Position {
        int getLatitude();

        void setLatitude(int latitude);

        int getLongitude();

        void setLongitude(int longitude);
    }
}

public class Gt06ProtocolDecoderTest {

    @Mock
    private Gt06ProtocolDecoder gt06ProtocolDecoder;

    @Test
    public void testDecodeWithSpeed() {
        // implementation of the test
    }
}

public class PositionStub implements Gt06ProtocolDecoder.Position {

    private int latitude = 0;
    private int longitude = 0;

    @Override
    public int getLatitude() {
        return latitude;
    }

    @Override
    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    @Override
    public int getLongitude() {
        return longitude;
    }

    @Override
    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

}