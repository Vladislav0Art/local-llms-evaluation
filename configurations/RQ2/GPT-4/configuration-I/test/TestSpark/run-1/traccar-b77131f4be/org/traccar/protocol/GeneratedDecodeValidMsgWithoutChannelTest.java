package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import io.netty.channel.Channel;

import java.net.SocketAddress;

import static org.junit.Assert.*;
import static org.mockito.Mockito.any;

public class GeneratedDecodeValidMsgWithoutChannelTest {

    @Test
    public void decodeValidMsgWithoutChannelTest() throws Exception {
        Protocol protocol = Mockito.mock(Protocol.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        SocketAddress address = Mockito.mock(SocketAddress.class);
        Object msg = "test message";
        Object result = decoder.decode(null, address, msg);
        assertNotNull(result);
    }

}