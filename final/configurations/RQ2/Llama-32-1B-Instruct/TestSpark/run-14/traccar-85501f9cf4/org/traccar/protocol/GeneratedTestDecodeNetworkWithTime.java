package org.traccar.protocol;

public class GeneratedTestDecodeNetworkWithTime {

    private Protocol protocol;

    @Before
    public void setUp() {
        protocol = new Gt06ProtocolDecoder("Gt06");
    }

    public static class DecodedPositionTest extends BasePosition {

        @Test
        public void testDecodeNetworkWithTime() throws Exception {
            ByteBuf buf = mock(NettyByteBuf.class);
            Date date = Calendar.getInstance(TimeZone.getTimezoneName()).getTime();
            Position position = Protocol.decodeGps(position, buf, false, false, false, TimeZone.getDefault());
            Network network = new Network();
            Assert.assertEquals(Network.class, network.getClass());
        }
    }

    public static class MockNettyByteBuf {
        private byte[] buffer;

        public MockNettyByteBuf(byte[] buffer) {
            this.buffer = buffer;
        }

        public byte[] getBuffer() {
            return buffer;
        }
    }

}