package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.nio.charset.StandardCharsets;
import java.net.SocketAddress;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeValidDataTest {

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @Test
    public void decodeValidDataTest() {
        Protocol protocol = new Protocol("watchProtocolTest", 0);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        String validMsg = "Valid message for testing";

        try {
            decoder.decode(channel, remoteAddress, validMsg.getBytes(StandardCharsets.US_ASCII));
        } catch (Exception e) {
            fail("No exception should be thrown");
        }
    }

}