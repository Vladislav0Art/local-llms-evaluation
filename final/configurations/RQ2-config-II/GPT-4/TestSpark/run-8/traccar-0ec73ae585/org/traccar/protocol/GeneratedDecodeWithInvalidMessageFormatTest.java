package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.InetSocketAddress;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeWithInvalidMessageFormatTest {

    @Mock
    Channel channel;

    @Test
    public void decodeWithInvalidMessageFormatTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watchProtocol"));
        decoder.decode(channel, new InetSocketAddress("localhost", 8080), 123); // passing an integer instead of string
    }

}