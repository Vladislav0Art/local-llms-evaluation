package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

public class GeneratedTest {

    @Test
    public void getHasIndexTest() {
        Protocol protocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Assert.assertFalse(decoder.getHasIndex());
    }

    @Test
    public void getManufacturerTest() {
        Protocol protocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Assert.assertNull(decoder.getManufacturer());
    }

    @Test
    public void decodeReturnNullChannelNullMsgTest() throws Exception {
        Protocol protocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Channel channel = null;
        SocketAddress remoteAddress = new InetSocketAddress("localhost", 8080);
        Object msg = null;
        Assert.assertNull(decoder.decode(channel, remoteAddress, msg));
    }

    @Test
    public void decodeReturnNullMsgEmptyTest() throws Exception {
        Protocol protocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = new InetSocketAddress("localhost", 8080);
        Object msg = "";
        Assert.assertNull(decoder.decode(channel, remoteAddress, msg));
    }

    @Test
    public void decodeReturnPositionTest() throws Exception {
        Protocol protocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = new InetSocketAddress("localhost", 8080);
        Object msg = "[SG*8800001015*0004*LK]";
        Object decoded = decoder.decode(channel, remoteAddress, msg);
        Assert.assertTrue(decoded instanceof Position);
    }

}