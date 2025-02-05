package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import io.netty.channel.Channel;

import java.net.SocketAddress;

import org.traccar.Protocol;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedWatchProtocolDecoderConstructorTest {

    @Test
    public void watchProtocolDecoderConstructorTest() {
        Protocol protocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertTrue(decoder instanceof WatchProtocolDecoder);
    }

}