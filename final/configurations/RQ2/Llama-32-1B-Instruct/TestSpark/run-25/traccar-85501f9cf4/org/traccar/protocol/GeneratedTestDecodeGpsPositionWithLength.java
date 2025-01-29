package org.traccar.protocol;

public class GeneratedTestDecodeGpsPositionWithLength {

    public static void main(String[] args) {
        new Gt06ProtocolDecoder(new Protocol());
    }

    private static final String GPS_POSITION = "1,2,3 4,5,6";

    private static final byte[] GPS_GPS_DATA = PatternBuilder.createPattern("GPS:").toByteBuf(GPS_POSITION);

    private static class MockGt06ProtocolDecoder extends Gt06ProtocolDecoder {
        @Mock
        private Protocol protocol;

        @MockBean
        public BcdUtil bcdd;

        @MockBean
        public BitUtil bitutil;

        @MockBean
        public Checksum checksum;

        @MockBean
        public DateBuilder datebuilder;

        @MockBean
        public Parser parser;

        @Test
        public void testDecodeGpsPositionWithLength() {
            // TO DO: implement test with length
        }

        private static class MockDeviceSession extends DeviceSession {
            @MockBean
            public SocketAddress socketAddress;

            @Override
            public boolean isOnline() {
                return true;
            }
        }

    }