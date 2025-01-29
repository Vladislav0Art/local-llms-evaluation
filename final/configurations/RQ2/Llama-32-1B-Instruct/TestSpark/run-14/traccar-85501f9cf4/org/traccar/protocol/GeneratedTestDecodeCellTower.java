package org.traccar.protocol;

public class GeneratedTestDecodeCellTower {

    private Protocol protocol;

    @Before
    public void setUp() {
        protocol = new Gt06ProtocolDecoder("Gt06");
    }

    public static class DecodedPositionTest extends BasePosition {

        @Test
        public void testDecodeCellTower() throws Exception {
            ByteBuf buf = mock(NettyByteBuf.class);
            Position position = Protocol.decodeGps(position, buf, false, false, false, TimeZone.getDefault());
            CellTower cellTower = (CellTower) position;
            Assert.assertEquals(CellTower.class, cellTower.getClass());
        }
    }

}