package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.netty.channel.Channel;

import java.net.SocketAddress;

public class GeneratedDecodeExceptionTest {

    @Test
    public void decodeExceptionTest() throws Exception {
        Protocol protocolMock = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocolMock);
        Object msgMock = new Object();
        Channel channelMock = Mockito.mock(Channel.class);
        SocketAddress remoteAddressMock = Mockito.mock(SocketAddress.class);
        decoder.decode(channelMock, remoteAddressMock, msgMock);
    }

}