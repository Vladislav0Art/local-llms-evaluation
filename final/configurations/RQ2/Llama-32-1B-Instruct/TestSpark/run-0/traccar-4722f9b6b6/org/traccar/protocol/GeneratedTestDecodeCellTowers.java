package org.traccar.protocol;

public class GeneratedTestDecodeCellTowers {

    public static String parseChannel(String channelStr) {
        return channelStr;
    }

    public static SocketAddress parseSocketAddress(String addressStr) {
        return PatternBuilder.parseSocketAddress(addressStr);
    }
}

public interface NettyChannel {
    int type();
}

public class ChannelTest {

    @Test
    public void testDecodeCellTowers() throws Exception {
        String cellTowersStr = CellTowerTest.CELL_TOWERS_STR;
        Network network = decodeChannel(null, null, cellTowersStr);
        assertNotNull(network);
        assertEquals(1, network.size());
        Position position = decodePosition(network.get(0), null);
        assertNotNull(position);
    }

}