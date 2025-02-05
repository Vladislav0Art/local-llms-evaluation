package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.traccar.Protocol;

import java.net.SocketAddress;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeIllegalArgumentExceptionTest {

    @Mock
    Protocol protocol;

    @Mock
    Channel channel;

    @Mock
    SocketAddress remoteAddress;

    @Test
    public void decodeIllegalArgumentExceptionTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        decoder.decode(channel, remoteAddress, null);
    }

}