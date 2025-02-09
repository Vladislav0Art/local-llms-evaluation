package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.helper.UnitConverter;

import java.net.InetSocketAddress;

import io.netty.channel.Channel;
import io.netty.buffer.Unpooled;
import io.netty.buffer.ByteBuf;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedDecodeNullMessageReturnsNullTest {

    private GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("galileo", 0, null, null, null, null, null, null, null, null, null, null));

    @Test
    public void decodeNullMessageReturnsNullTest() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        String remoteAddress = "10.0.0.1:12345";

        Object result = decoder.decode(channel, new InetSocketAddress(remoteAddress), null);

        assertNull(result);
    }

}