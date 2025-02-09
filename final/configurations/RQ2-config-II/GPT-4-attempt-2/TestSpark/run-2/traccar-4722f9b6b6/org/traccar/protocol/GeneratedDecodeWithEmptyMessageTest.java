package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.SocketAddress;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeWithEmptyMessageTest {

    @Mock
    private org.traccar.Protocol protocol;
    @Mock
    private Channel channel;
    @Mock
    private SocketAddress socketAddress;

    @Test
    public void decodeWithEmptyMessageTest() throws Exception {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(protocol);
        Object msg = "";
        Object result = watchProtocolDecoder.decode(channel, socketAddress, msg);
        assertEquals(null, result);
        verify(channel, never()).writeAndFlush(any());
    }

}