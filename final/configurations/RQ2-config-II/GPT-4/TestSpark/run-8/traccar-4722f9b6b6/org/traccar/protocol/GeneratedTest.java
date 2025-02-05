package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.traccar.Protocol;

import java.net.SocketAddress;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    Protocol protocol;

    @Mock
    Channel channel;

    @Mock
    SocketAddress remoteAddress;

    @Test
    public void WatchProtocolDecoderCreationTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Assert.assertNotNull(decoder);
    }

    @Test
    public void getHasIndexTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        boolean hasIndex = decoder.getHasIndex();
        Assert.assertFalse(hasIndex);
    }

    @Test
    public void getManufacturerTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        String manufacturer = decoder.getManufacturer();
        Assert.assertEquals("Unknown", manufacturer);
    }

    @Test
    public void decodeUnsupportedOperationExceptionTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        decoder.decode(channel, remoteAddress, "UnsupportedMessage");
    }

    @Test
    public void decodeIllegalArgumentExceptionTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        decoder.decode(channel, remoteAddress, null);
    }

}