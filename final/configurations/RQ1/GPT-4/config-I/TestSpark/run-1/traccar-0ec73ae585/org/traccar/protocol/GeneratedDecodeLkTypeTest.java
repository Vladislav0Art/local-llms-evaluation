package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.session.DeviceSession;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedDecodeLkTypeTest {

    private Protocol protocol = Mockito.mock(Protocol.class);
    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

    private Channel getChannel() {
        Channel channel = Mockito.mock(Channel.class);
        Mockito.when(channel.remoteAddress()).thenReturn(Mockito.mock(SocketAddress.class));
        return channel;
    }

    private ByteBuf getByteBuf(String data) {
        return Unpooled.copiedBuffer(data, StandardCharsets.US_ASCII);
    }

    @Test
    public void decodeLkTypeTest() throws Exception {
        Channel channel = getChannel();
        Position position = (Position) this.decoder.decode(channel, null, getByteBuf("[3G*4700180204*0029*LK,30,100,0,0]"));
        assertTrue(position.getAttributes().get(Position.KEY_BATTERY_LEVEL).equals(100));
        assertTrue(position.getAttributes().get(Position.KEY_STEPS).equals(30));
    }

}