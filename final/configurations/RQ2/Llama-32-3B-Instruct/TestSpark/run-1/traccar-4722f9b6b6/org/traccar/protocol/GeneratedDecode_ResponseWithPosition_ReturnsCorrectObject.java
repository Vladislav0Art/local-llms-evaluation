package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;

import java.net.SocketAddress;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecode_ResponseWithPosition_ReturnsCorrectObject {

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @InjectMocks
    private WatchProtocolDecoder watchProtocolDecoder;

    @Test
    public void decode_ResponseWithPosition_ReturnsCorrectObject() throws Exception {
        ByteBuf response = Unpooled.copiedBuffer("position:1,5,10".getBytes(StandardCharsets.UTF_8));
        when(channel.receive()).thenReturn(response);
        Object decoded = watchProtocolDecoder.decode(channel, remoteAddress, null);
        Position position = (Position) decoded;
        assertEquals(1, position.getId());
        assertEquals(5, position.getLatitude());
        assertEquals(10, position.getLongitude());
    }

}