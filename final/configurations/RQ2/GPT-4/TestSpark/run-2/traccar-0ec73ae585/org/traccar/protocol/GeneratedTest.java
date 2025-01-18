package org.traccar.protocol;

import org.traccar.protocol.WatchProtocolDecoder;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import io.netty.channel.Channel;
import org.traccar.Protocol;

public class GeneratedTest {

    @Mock
    private Channel channel;
    @Mock
    private Protocol protocol;

    @Test
    public void WatchProtocolDecoderConstructorTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Assert.assertNotNull(decoder);
    }

    @Test
    public void getHasIndexTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        boolean result = decoder.getHasIndex();
        Assert.assertFalse(result);
    }

    @Test
    public void getManufacturerTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        String result = decoder.getManufacturer();
        Assert.assertNull(result);
    }

    @Test
    public void decodeThrowsExceptionTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        decoder.decode(channel, null, "test message");
    }

    @Test
    public void decodeReturnsObjectTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Object result = decoder.decode(channel, Mockito.any(), "test message");
        Assert.assertNull(result);
    }

}