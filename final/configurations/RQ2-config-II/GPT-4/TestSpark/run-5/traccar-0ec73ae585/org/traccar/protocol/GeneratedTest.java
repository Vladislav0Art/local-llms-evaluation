package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void WatchProtocolDecoderConstructorTest() {
        Protocol protocol = new Protocol("Watch".getBytes(StandardCharsets.UTF_8));
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Assert.assertNotNull(decoder);
    }

    @Test
    public void getHasIndexTest() {
        Protocol protocol = new Protocol("Watcher".getBytes(StandardCharsets.UTF_8));
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        boolean hasIndex = decoder.getHasIndex();
        Assert.assertNotNull(hasIndex);
    }

    @Test
    public void getManufacturerTest() {
        Protocol protocol = new Protocol("WatchMan".getBytes(StandardCharsets.UTF_8));
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        String manufacturer = decoder.getManufacturer();
        Assert.assertEquals("WatchMan", manufacturer);
    }

    @Test
    public void decodeTest() throws Exception {
        Protocol protocol = new Protocol("DecoderProbe".getBytes(StandardCharsets.UTF_8));
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Object msg = "Protocol Test Message";
        Object object = decoder.decode(channel, remoteAddress, msg);
        Assert.assertNotNull(object);
    }

    @Test
    public void decodeExceptionTest() throws Exception {
        Protocol protocol = new Protocol("DecoderProbe".getBytes(StandardCharsets.UTF_8));
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Object msg = new Object();
        try {
            Object object = decoder.decode(channel, remoteAddress, msg);
            Assert.fail();
        } catch (Exception e) {
            Assert.assertTrue(e instanceof Exception);
        }
    }

}