package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.SocketAddress;
import java.util.Date;
import java.util.regex.Pattern;

public class GeneratedGetHasIndex_false {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    public static final Byte[] EMPTY_BYTE_ARRAY = new byte[0];

    @Test
    public void getHasIndex_false() {
        assertFalse(WatchProtocolDecoder.getHasIndex(protocol));
    }

}