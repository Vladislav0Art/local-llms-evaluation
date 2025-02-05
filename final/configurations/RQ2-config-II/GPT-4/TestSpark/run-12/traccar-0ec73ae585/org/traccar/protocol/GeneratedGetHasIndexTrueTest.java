package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import java.net.InetSocketAddress;
import java.net.ProtocolException;

public class GeneratedGetHasIndexTrueTest {

    @Test
    public void getHasIndexTrueTest() {
        Protocol protocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertTrue(decoder.getHasIndex());
    }

}