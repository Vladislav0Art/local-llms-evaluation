package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.InetSocketAddress;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @Test
    public void getHasIndexDefaultStateTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Assert.assertFalse(decoder.getHasIndex());
    }

    @Test
    public void getManufacturerDefaultStateTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Assert.assertNull(decoder.getManufacturer());
    }

    @Test
    public void decodeNullChannelTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        String msg = "sample message";
        InetSocketAddress address = InetSocketAddress.createUnresolved("localhost", 5050);
        Object result = decoder.decode(null, address, msg);
        Assert.assertNull(result);
    }

    @Test
    public void decodeNullAddressTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        String msg = "sample message";
        Object result = decoder.decode(channel, null, msg);
        Assert.assertNull(result);
    }

    @Test
    public void decodeNullMessageTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        InetSocketAddress address = InetSocketAddress.createUnresolved("localhost", 5050);
        Object result = decoder.decode(channel, address, null);
        Assert.assertNull(result);
    }

    @Test
    public void decodeAllParametersNotNull() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        String msg = "sample message";
        InetSocketAddress address = InetSocketAddress.createUnresolved("localhost", 5050);
        Object result = decoder.decode(channel, address, msg);
        Assert.assertNotNull(result);
    }

}