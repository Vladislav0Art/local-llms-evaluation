package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.BaseProtocolDecoder;
import org.traccar.NetworkMessage;
import org.traccar.Protocol;
import org.traccar.helper.BitBuffer;
import org.traccar.helper.BitUtil;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecode {

    @Mock
    private BaseProtocolDecoder baseProtocolDecoder;

    @Test
    public void decode() {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = Mockito.mock(Object.class);

        BitBuffer bitBuffer = new BitBuffer();
        byte[] decodedBytes = bitBuffer.getBytes();

        Mockito.when(channel.alloc()).thenReturn(Unpooled.buffer(20));
        Mockito.when(remoteAddress).thenReturn("remoteAddress");
        Mockito.when(msg).thenReturn(decodedBytes);

        Object result = new GalileoProtocolDecoder(new Protocol()).decode(channel, remoteAddress, msg);
        Mockito.verify(baseProtocolDecoder).decode(Mockito.any(), Mockito.any(), Mockito.any());
    }

}