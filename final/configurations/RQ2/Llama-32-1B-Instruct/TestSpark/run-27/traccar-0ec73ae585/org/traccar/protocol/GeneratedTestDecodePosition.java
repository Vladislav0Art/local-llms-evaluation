package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestDecodePosition {

    @Test
    public void testDecodePosition() {
        MockWatchProtocolDecoder mockDecode = new MockWatchProtocolDecoder();
        Position position = new Position(37.7749, -122.4194);
        Network network = mockDecode.decode(new Channel(Unpooled.buffer().writeObject(position).channel()), "UnknownAddress", null);
        assertTrue(network != null);
    }

}