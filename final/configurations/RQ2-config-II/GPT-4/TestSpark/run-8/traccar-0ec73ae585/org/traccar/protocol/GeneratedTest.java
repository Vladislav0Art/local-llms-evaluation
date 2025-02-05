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
public class GeneratedTest {

    @Mock
    Channel channel;

    @Test
    public void getHasIndexTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watchProtocol"));
        assert !decoder.getHasIndex();
    }

    @Test
    public void getManufacturerTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watchProtocol"));
        assert "watchProtocol".equals(decoder.getManufacturer());
    }

    @Test
    public void decodeWithNullChannelTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watchProtocol"));
        decoder.decode(null, new InetSocketAddress("localhost", 8080), "someMessage");
    }

    @Test
    public void decodeWithNonNullChannelTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watchProtocol"));
        decoder.decode(channel, new InetSocketAddress("localhost", 8080), "someMessage");

        verify(channel, times(2)).writeAndFlush(new NetworkMessage("response", new InetSocketAddress("localhost", 8080)));
    }

    @Test
    public void decodeWithInvalidMessageFormatTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watchProtocol"));
        decoder.decode(channel, new InetSocketAddress("localhost", 8080), 123); // passing an integer instead of string
    }

}