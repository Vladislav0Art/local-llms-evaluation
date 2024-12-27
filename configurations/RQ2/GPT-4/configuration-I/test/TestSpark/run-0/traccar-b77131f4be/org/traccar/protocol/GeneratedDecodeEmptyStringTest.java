package org.traccar.protocol;

import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.protocol.GalileoProtocolDecoder;

import java.net.SocketAddress;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import io.netty.channel.Channel;

public class GeneratedDecodeEmptyStringTest {

    @Test
    public void decodeEmptyStringTest() {
        Protocol protocol = mock(Protocol.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);

        try {
            Object result = decoder.decode(channel, remoteAddress, "");
            assertNull(result);
        } catch (Exception e) {
            fail("No exception was expected");
        }
    }

}