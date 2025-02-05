package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import io.netty.channel.Channel;

import java.net.SocketAddress;

import org.traccar.Protocol;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedDecodeTestWithException {

    @Test
    public void decodeTestWithException() throws Exception {
        Protocol protocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = null;
        decoder.decode(channel, remoteAddress, msg);
    }

}