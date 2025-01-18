package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.traccar.Protocol;
import io.netty.channel.Channel;

import java.net.SocketAddress;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeValidObjectTest {

    @Test
    public void decodeValidObjectTest() throws Exception {
        Channel channel = mock(Channel.class);
        SocketAddress address = mock(SocketAddress.class);
        Protocol protocol = new Protocol("Galileo");
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Object msg = "valid_dummy_message";
        Object result = decoder.decode(channel, address, msg);
        assertNotNull(result);
    }

}