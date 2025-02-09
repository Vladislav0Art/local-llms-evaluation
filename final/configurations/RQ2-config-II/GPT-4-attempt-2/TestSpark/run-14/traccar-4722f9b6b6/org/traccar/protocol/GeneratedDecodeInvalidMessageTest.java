package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;

import static org.junit.Assert.*;

import java.net.InetSocketAddress;

import io.netty.channel.Channel;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeInvalidMessageTest {

    @Test
    public void decodeInvalidMessageTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));

        Channel channel = Mockito.mock(Channel.class);
        InetSocketAddress address = new InetSocketAddress("localhost", 5002);

        decoder.decode(channel, address, "invalid_message");
    }

}