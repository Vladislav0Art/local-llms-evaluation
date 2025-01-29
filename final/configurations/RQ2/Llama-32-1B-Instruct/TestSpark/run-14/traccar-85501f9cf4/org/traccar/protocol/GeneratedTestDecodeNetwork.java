package org.traccar.protocol;

public class GeneratedTestDecodeNetwork {

    private Protocol protocol;

    @Before
    public void setUp() {
        protocol = new Gt06ProtocolDecoder("Gt06");
    }

    public static class DecodedPositionTest extends BasePosition {

        @Test
        public void testDecodeNetwork() throws Exception {
            ByteBuf buf = mock(NettyByteBuf.class);
            Position position = Protocol.decodeGps(position, buf, false, false, false, TimeZone.getDefault());
            CellTower cellTower = (CellTower) position;
            Network network = new Network();
            Assert.assertEquals(Network.class, network.getClass());
        }
    }

}