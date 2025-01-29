package org.traccar.protocol;

public class GeneratedTestDecodeGpsPosition {

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
        public void testDecodeGpsPosition() {
            when(bcdd.decode(0, 0)).thenReturn(GPS_GPS_DATA);
            when(parser.parse(GPS_GPS_DATA)).thenReturn(Position.builder().build());
            assert Gt06ProtocolDecoder.decode(null, null, Position.class) == Position.builder().build();
        }
    }

}