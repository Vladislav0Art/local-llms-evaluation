package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import io.netty.channel.Channel;

import java.net.SocketAddress;

import org.traccar.Protocol;

public class GeneratedTest {

    @Test
    public void watchProtocolDecoderConstructorTest() {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(new Protocol("watch"));
        Assert.assertNotNull(watchProtocolDecoder);
    }

    @Test
    public void getHasIndexDefaultsToFalseTest() {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(new Protocol("watch"));
        Assert.assertFalse(watchProtocolDecoder.getHasIndex());
    }

    @Test
    public void getManufacturerShouldReturnNullTest() {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(new Protocol("watch"));
        Assert.assertNull(watchProtocolDecoder.getManufacturer());
    }

    @Test
    public void decodeReturnsNullWithInvalidMessageTest() throws Exception {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(new Protocol("watch"));
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object message = "invalid_message";

        Assert.assertNull(watchProtocolDecoder.decode(channel, remoteAddress, message));
    }

    @Test
    public void decodeReturnsNullWithNoChannelTest() throws Exception {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(new Protocol("watch"));
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object message = "valid_message";

        Assert.assertNull(watchProtocolDecoder.decode(null, remoteAddress, message));
    }

    @Test
    public void decodeReturnsNullWithNoRemoteAddressTest() throws Exception {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(new Protocol("watch"));
        Channel channel = Mockito.mock(Channel.class);
        Object message = "valid_message";

        Assert.assertNull(watchProtocolDecoder.decode(channel, null, message));
    }

    @Test
    public void decodeReturnsNullWithNoMessageTest() throws Exception {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(new Protocol("watch"));
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);

        Assert.assertNull(watchProtocolDecoder.decode(channel, remoteAddress, null));
    }

}