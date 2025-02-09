package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import io.netty.channel.Channel;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.InetSocketAddress;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeWithMessageTest {

    @Mock
    Channel channel;
    @Mock
    Protocol protocol;

    @Test
    public void decodeWithMessageTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        String msg = "example";
        Object decoded = decoder.decode(channel, new InetSocketAddress(5000), msg);
        assertTrue(decoded instanceof Position);
    }

}