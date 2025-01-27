package org.traccar.protocol;

public class GeneratedTestDecodeWithLength {

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
    public void testDecodeWithLength() {
        // implementation of the test
    }

}