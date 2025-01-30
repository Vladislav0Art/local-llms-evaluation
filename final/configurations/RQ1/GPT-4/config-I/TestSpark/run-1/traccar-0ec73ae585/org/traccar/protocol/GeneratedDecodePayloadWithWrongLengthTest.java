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

public class GeneratedDecodePayloadWithWrongLengthTest {

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
    public void decodePayloadWithWrongLengthTest() throws Exception {
        assertNull(decoder.decode(null, null, getByteBuf("[3G*4700180204*002B*UD2,040258,A,22.574374,N,113.930856,E,0.00,343.15,18,8,87,100,70839,,062c240001d108,HTC6525LVW,04:9f:c2:7b:d5:be,-73#]")));
    }

}