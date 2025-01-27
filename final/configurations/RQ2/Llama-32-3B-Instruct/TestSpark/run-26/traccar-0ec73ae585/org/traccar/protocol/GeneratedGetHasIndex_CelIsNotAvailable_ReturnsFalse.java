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
public class GeneratedGetHasIndex_CelIsNotAvailable_ReturnsFalse {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    public boolean getHasIndex() {
        // mock implementation
        return false;
    }

    public String getManufacturer() {
        // mock implementation
        return "unknown";
    }

    @Test
    public void getHasIndex_CelIsNotAvailable_ReturnsFalse() {
        boolean result = WatchProtocolDecoder.getHasIndex();
        assert !result;
    }

}