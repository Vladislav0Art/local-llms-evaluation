package org.traccar.protocol;

import static org.junit.Assert.*;

import org.junit.Test;
import org.traccar.BaseProtocolDecoder;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;

import static org.mockito.Mockito.*;

public class GeneratedGetHasIndexTrueTest {

    @Test
    public void getHasIndexTrueTest() {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertTrue(decoder.getHasIndex());
    }

}