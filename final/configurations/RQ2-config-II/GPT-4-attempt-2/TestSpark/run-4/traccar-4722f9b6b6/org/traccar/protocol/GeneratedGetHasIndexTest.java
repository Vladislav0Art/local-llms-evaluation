package org.traccar.protocol;

import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.Protocol;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedGetHasIndexTest {

    @Test
    public void getHasIndexTest() {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertFalse(decoder.getHasIndex());
    }

}