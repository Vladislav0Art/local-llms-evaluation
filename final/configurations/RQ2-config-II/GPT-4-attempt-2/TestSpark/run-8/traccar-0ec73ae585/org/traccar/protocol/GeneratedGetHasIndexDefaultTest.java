package org.traccar.protocol;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.protocol.WatchProtocolDecoder;

import java.net.SocketAddress;
import java.nio.channels.Channel;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedGetHasIndexDefaultTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void getHasIndexDefaultTest() {
        Protocol protocolMock = mock(Protocol.class);
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(protocolMock);
        assertFalse(watchProtocolDecoder.getHasIndex());
    }

}