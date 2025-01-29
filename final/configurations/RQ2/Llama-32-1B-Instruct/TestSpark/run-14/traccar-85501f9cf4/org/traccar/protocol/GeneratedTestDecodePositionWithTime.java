package org.traccar.protocol;

public class GeneratedTestDecodePositionWithTime {

    private Protocol protocol;

    @Before
    public void setUp() {
        protocol = new Gt06ProtocolDecoder("Gt06");
    }

    public static class DecodedPositionTest extends BasePosition {

        @Test
        public void testDecodePositionWithTime() throws Exception {
            ByteBuf buf = mock(NettyByteBuf.class);
            Date date = Calendar.getInstance(TimeZone.getTimezoneName()).getTime();
            Position position = Protocol.decodeGps(position, buf, false, false, false, TimeZone.getDefault());
            Assert.assertEquals(Position.class, position.getClass());
        }
    }

}