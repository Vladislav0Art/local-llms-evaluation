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
public class GeneratedGetHasIndexTest {

    @Mock
    Channel channel;
    @Mock
    Protocol protocol;

    @Test
    public void getHasIndexTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        boolean result = decoder.getHasIndex();
        assertFalse(result);
    }

}