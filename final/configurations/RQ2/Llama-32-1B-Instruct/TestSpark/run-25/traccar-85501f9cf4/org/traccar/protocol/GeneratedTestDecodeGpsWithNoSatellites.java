package org.traccar.protocol;

public class GeneratedTestDecodeGpsWithNoSatellites {

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
        public void testDecodeGpsWithNoSatellites() {
            final MockDeviceSession deviceSession = new MockDeviceSession();
            final MockGt06ProtocolDecoder decoder = new MockGt06ProtocolDecoder();

            // Set up mock device session
            deviceSession.setSatellitePosition(new Position(0, 0, 0));
            deviceSession.setSpeedInKmH(0);
            deviceSession.setDirectionOfArrival(false);

            // Assert that decoding no satellites
            assert decoder.decode(null, null, Position.class) == Position.builder().build();
        }

    }