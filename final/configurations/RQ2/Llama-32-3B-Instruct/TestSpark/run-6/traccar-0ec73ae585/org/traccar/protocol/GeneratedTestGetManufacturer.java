package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Date;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestGetManufacturer {

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);

    public static final int WATCH_MESSAGE_ID = 1;
    public static final byte[] WATCH_MESSAGE = { /* watch message */};
    public static final long WATCH_POSITION_X = 1L;
    public static final long WATCH_POSITION_Y = 2L;

    @Test
    public void testGetManufacturer() {
        Mockito.when(channel.getClass()).thenReturn(WatchProtocolDecoder.class);
        Mockito.when(channel.getProtocol().getManufacturer()).thenReturn("manufacturer");
        String manufacturer = decoder.getManufacturer();
        assertEquals("manufacturer", manufacturer);
    }

}