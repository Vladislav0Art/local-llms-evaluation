package org.traccar.protocol;

public class GeneratedTestDecodePosition {

    private Protocol protocol;

    @Before
    public void setUp() {
        protocol = new Gt06ProtocolDecoder("Gt06");
    }

    public static class DecodedPositionTest extends BasePosition {

        @Test
        public void testDecodePosition() throws Exception {
            ByteBuf buf = mock(NettyByteBuf.class);
            Position position = Protocol.decodeGps(position, buf, false, false, false, TimeZone.getDefault());
            Assert.assertEquals(Position.class, position.getClass());
        }
    }

}