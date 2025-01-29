package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

public class GeneratedTestDecodeCellTower {

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH_PROTOCOL);

    @Test
    public void testDecodeCellTower() throws Exception {
        CellTower cellTower = new CellTower("TRACCA", "TRACCA");
        Network network = new Network(cellTower);
        Object msg = Arrays.asList(cellTower, network);
        assertEquals(Arrays.asList(msg), decoder.decode(new Channel(), Unpooled.buffer().SocketAddress(123, 456), msg));
    }

}