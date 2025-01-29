package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

public class GeneratedTestDecodeCellTower_Invalid {

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH_PROTOCOL);

    @Test
    public void testDecodeCellTower_Invalid() {
        CellTower cellTower = null;
        Network network = new Network(cellTower);
        Object msg = Arrays.asList(cellTower, network);
        assertEquals(Arrays.asList(msg), decoder.decode(new Channel(), Unpooled.buffer().SocketAddress(123, 456), msg));
    }

}