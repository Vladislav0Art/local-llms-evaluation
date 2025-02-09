package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.net.SocketAddress;

import junit.framework.TestCase;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedDecodeWrongObjectTypeCaseTest {

    @Test
    public void decodeWrongObjectTypeCaseTest() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress socketAddress = Mockito.mock(SocketAddress.class);
        WatchProtocolDecoder protocolDecoder = new WatchProtocolDecoder(new Protocol("WatchProtocol"));

        try {
            protocolDecoder.decode(channel, socketAddress, "WrongType");
            fail("Expected Exception not thrown");
        } catch (Exception ex) {
            assertEquals("Input is not of correct type", ex.getMessage());
        }
    }

}