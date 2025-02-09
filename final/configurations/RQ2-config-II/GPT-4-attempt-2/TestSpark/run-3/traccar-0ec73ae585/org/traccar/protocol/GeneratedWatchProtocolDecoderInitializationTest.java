package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedWatchProtocolDecoderInitializationTest {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @Test
    public void watchProtocolDecoderInitializationTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertNotNull(decoder);
    }

}