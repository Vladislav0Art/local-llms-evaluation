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
public class GeneratedTestDecode_WifiAccessPoint {

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
    public void testDecode_WifiAccessPoint() {
        ByteBuf buf = Unpooled.buffer();
        Mockito.when(channel.getProtocolId()).thenReturn(WATCH_MESSAGE_ID);
        Mockito.when(channel.getBuffer()).thenReturn(buf);
        WifiAccessPoint wifiAccessPoint = new WifiAccessPoint();
        Position position = new Position();
        Date date = new Date();
        Pattern pattern = Pattern.compile(".*");
        UnitsConverter unitsConverter = new UnitsConverter();
        BitUtil bitUtil = new BitUtil();
        BufferUtil bufferUtil = new BufferUtil();
        Mockito.when(bufferUtil.getBytes()).thenReturn(WATCH_MESSAGE);
        decoder.decode(channel, remoteAddress, null);
    }

}