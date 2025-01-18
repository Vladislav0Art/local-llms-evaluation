package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;
import io.netty.channel.Channel;

import java.net.SocketAddress;

import org.traccar.Protocol;

public class GeneratedDecodeNullMessageTest {

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(Mockito.mock(Protocol.class));

    @Test
    public void decodeNullMessageTest() throws Exception {
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Channel channel = Mockito.mock(Channel.class);
        Object decodedMessage = decoder.decode(channel, remoteAddress, null);

        assertNull(decodedMessage);
    }

}