package org.traccar.protocol;

import static org.junit.Assert.*;

import org.junit.Test;
import org.traccar.BaseProtocolDecoder;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;

import static org.mockito.Mockito.*;

public class GeneratedGetHasIndexFalseTest {

    @Test
    public void getHasIndexFalseTest() {
        Protocol protocol = mock(Protocol.class);
        when(protocol.getHasIndex()).thenReturn(false);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertFalse(decoder.getHasIndex());
    }

}