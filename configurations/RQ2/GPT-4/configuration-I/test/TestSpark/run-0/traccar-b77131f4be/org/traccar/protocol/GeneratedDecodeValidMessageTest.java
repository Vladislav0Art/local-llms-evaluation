package org.traccar.protocol;

import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.protocol.GalileoProtocolDecoder;

import java.net.SocketAddress;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import io.netty.channel.Channel;

public class GeneratedDecodeValidMessageTest {

    @Test
    public void decodeValidMessageTest() {
        Protocol protocol = mock(Protocol.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        String validMessage = "ExampleValidMessage";

        try {
            Object result = decoder.decode(channel, remoteAddress, validMessage);
            // if a class of the returned object is known,
            // we can use specific assertions here, e.g.:
            // assertTrue(result instanceof ExpectedReturnType);
            assertNotNull(result);
        } catch (Exception e) {
            fail("No exception was expected");
        }
    }

}