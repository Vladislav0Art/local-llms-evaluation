package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.netty.channel.Channel;

import java.net.SocketAddress;

public class GeneratedDecodeTest {

    @Test
    public void decodeTest() throws Exception {
        Protocol protocolMock = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocolMock);
        Object msgMock = Mockito.mock(Object.class);
        Channel channelMock = Mockito.mock(Channel.class);
        SocketAddress remoteAddressMock = Mockito.mock(SocketAddress.class);
        Object expected = decoder.decode(channelMock, remoteAddressMock, msgMock);
        assertEquals(expected, decoder.decode(channelMock, remoteAddressMock, msgMock));
    }

}