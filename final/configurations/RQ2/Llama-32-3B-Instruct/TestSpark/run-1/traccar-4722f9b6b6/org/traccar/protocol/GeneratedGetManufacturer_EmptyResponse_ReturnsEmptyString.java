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
public class GeneratedGetManufacturer_EmptyResponse_ReturnsEmptyString {

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @InjectMocks
    private WatchProtocolDecoder watchProtocolDecoder;

    @Test
    public void getManufacturer_EmptyResponse_ReturnsEmptyString() {
        byte[] response = new byte[0];
        when(channel.receive()).thenReturn(response);
        String manufacturer = watchProtocolDecoder.getManufacturer();
        assertEquals("", manufacturer);
    }

}