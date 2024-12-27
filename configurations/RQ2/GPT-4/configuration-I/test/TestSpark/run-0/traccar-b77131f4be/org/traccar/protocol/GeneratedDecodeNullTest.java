package org.traccar.protocol;

import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.protocol.GalileoProtocolDecoder;

import java.net.SocketAddress;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import io.netty.channel.Channel;

public class GeneratedDecodeNullTest {

    @Test
    public void decodeNullTest() {
        Protocol protocol = mock(Protocol.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);

        try {
            decoder.decode(channel, remoteAddress, null);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // Expected exception
        }
    }

}