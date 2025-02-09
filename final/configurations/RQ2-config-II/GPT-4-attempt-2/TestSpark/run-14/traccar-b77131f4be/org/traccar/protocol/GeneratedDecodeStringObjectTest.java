package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.InetSocketAddress;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedDecodeStringObjectTest {

    @Test
    public void decodeStringObjectTest() {
        Protocol protocol = new Protocol("testProtocol");
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Channel channel = Mockito.mock(Channel.class);
        when(channel.remoteAddress()).thenReturn(new InetSocketAddress(8080));

        try {
            Object result = decoder.decode(channel, channel.remoteAddress(), "StringObject");
            assertNull(result);
        } catch (Exception ignored) {
        }
    }

}