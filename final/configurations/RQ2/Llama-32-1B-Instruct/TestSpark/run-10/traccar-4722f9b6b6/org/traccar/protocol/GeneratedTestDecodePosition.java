package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

public class GeneratedTestDecodePosition {

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH_PROTOCOL);

    @Test
    public void testDecodePosition() throws Exception {
        Position position = new Position(10.0, 20.0);
        Network network = new Network(new CellTower("TRACCA", "TRACCA"));
        Object msg = Arrays.asList(position, network);
        assertEquals(Arrays.asList(msg), decoder.decode(new Channel(), Unpooled.buffer().SocketAddress(123, 456), msg));
    }

}