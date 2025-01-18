package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import io.netty.channel.Channel;

import java.net.SocketAddress;

import static org.mockito.Mockito.mock;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeNullalidObjectTest {

    @Mock
    private Protocol protocol;

    @Test
    public void decodeNullalidObjectTest() {
        Channel channel = mock(Channel.class);
        SocketAddress address = mock(SocketAddress.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Object msg = null;
        Object result = null;
        try {
            result = decoder.decode(channel, address, msg);
        } catch (Exception e) {
            assertNull(result);
        }
    }

}