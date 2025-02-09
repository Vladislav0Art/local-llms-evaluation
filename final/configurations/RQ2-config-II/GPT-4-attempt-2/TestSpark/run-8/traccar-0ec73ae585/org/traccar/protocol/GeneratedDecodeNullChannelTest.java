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

public class GeneratedDecodeNullChannelTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void decodeNullChannelTest() throws Exception {
        Protocol protocolMock = mock(Protocol.class);
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(protocolMock);
        SocketAddress socketAddressMock = mock(SocketAddress.class);
        expectedException.expect(Exception.class);
        watchProtocolDecoder.decode(null, socketAddressMock, "Test Message");
    }

}