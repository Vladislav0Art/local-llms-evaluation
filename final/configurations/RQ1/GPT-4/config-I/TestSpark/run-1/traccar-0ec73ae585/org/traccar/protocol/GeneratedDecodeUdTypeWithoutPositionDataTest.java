package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.model.Position;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.session.DeviceSession;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class GeneratedDecodeUdTypeWithoutPositionDataTest {

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(Mockito.mock(Protocol.class));

    private Channel getChannel() {
        Channel channel = Mockito.mock(Channel.class);
        Mockito.when(channel.remoteAddress()).thenReturn(Mockito.mock(SocketAddress.class));
        return channel;
    }

    private ByteBuf getByteBuf(String data) {
        return Unpooled.copiedBuffer(data, StandardCharsets.US_ASCII);
    }

    @Test
    public void decodeUdTypeWithoutPositionDataTest() throws Exception {
        assertNull(decoder.decode(null, null, getByteBuf("[3G*4700180204*002C*UD,040258]")));
    }

}