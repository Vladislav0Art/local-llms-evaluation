package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.BaseProtocol;
import org.traccar.NetworkSessionManager;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class GeneratedDecodeTest {

    @Test
    public void decodeTest() throws Exception {
        BaseProtocol protocol = Mockito.mock(BaseProtocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        NetworkSessionManager networkSessionManager = new NetworkSessionManager();
        Mockito.when(protocol.getNetworkSessionManager()).thenReturn(networkSessionManager);

        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);

        ByteBuf buf = Unpooled.buffer();
        buf.writeByte('[');
        buf.writeBytes("123456*0F*1234*WT,19,[".getBytes(StandardCharsets.US_ASCII));
        buf.writeBytes("030101,080000,A,50.9415,N,006.9566,E,2.42,293.6,0.0,6".getBytes(StandardCharsets.US_ASCII));
        buf.writeBytes(",10,3,100,0008,000,0]".getBytes(StandardCharsets.US_ASCII));
        buf.writeByte(']');

        networkSessionManager.addActiveDevice("123456", channel, remoteAddress);

        Object result = decoder.decode(channel, remoteAddress, buf);
        assertNotNull(result);
        verify(channel, times(1)).writeAndFlush(any());

        Position position = (Position) result;
        assertNotNull(position);
        assertEquals((double) position.getNetwork().getWifiAccessPoints().get(0).getSignalStrength(), 0.0, 0.01);
    }

}