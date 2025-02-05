package org.traccar.protocol;

import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedGetHasIndexFalseTest {

    @Test
    public void getHasIndexFalseTest() {
        Protocol protocol = mock(Protocol.class);
        when(protocol.getDeviceManager()).thenReturn(null);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        boolean result = decoder.getHasIndex();
        assertFalse(result);
    }

}