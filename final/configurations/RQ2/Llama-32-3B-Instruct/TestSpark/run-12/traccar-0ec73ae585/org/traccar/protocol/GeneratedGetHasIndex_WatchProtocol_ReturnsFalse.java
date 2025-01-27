package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetHasIndex_WatchProtocol_ReturnsFalse {

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @Mock
    private Object msg;

    @Test
    public void getHasIndex_WatchProtocol_ReturnsFalse() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);

        boolean hasIndex = decoder.getHasIndex();
        assertTrue(hasIndex == false);
    }

}