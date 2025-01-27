package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;

import java.net.SocketAddress;
import java.util.Date;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetHasIndex CellIsNotAvailable ReturnsFalse {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @Test
    public void getHasIndex

    CellIsNotAvailable ReturnsFalse() {
        boolean result = WatchProtocolDecoder.getHasIndex();
        assert !result;
    }

}