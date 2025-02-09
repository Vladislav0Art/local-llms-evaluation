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

public class GeneratedDecodeNullSocketAddressTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void decodeNullSocketAddressTest() throws Exception {
        Protocol protocolMock = mock(Protocol.class);
        Channel channelMock = mock(Channel.class);
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(protocolMock);
        expectedException.expect(Exception.class);
        watchProtocolDecoder.decode(channelMock, null, "Test Message");
    }

}