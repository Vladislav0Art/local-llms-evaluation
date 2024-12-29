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
public class GeneratedDecode_ResponseWithNetwork_ReturnsCorrectObject {

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @InjectMocks
    private WatchProtocolDecoder watchProtocolDecoder;

    @Test
    public void decode_ResponseWithNetwork_ReturnsCorrectObject() throws Exception {
        ByteBuf response = Unpooled.copiedBuffer("network:1,5,10".getBytes(StandardCharsets.UTF_8));
        when(channel.receive()).thenReturn(response);
        Object decoded = watchProtocolDecoder.decode(channel, remoteAddress, null);
        Network network = (Network) decoded;
        assertEquals(1, network.getId());
        assertEquals(5, network.getLatitude());
        assertEquals(10, network.getLongitude());
    }

}