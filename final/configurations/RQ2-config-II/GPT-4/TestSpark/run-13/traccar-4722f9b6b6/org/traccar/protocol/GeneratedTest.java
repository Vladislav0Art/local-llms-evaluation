package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.InetSocketAddress;

public class GeneratedTest {

    @Test
    public void WatchProtocolDecoderConstructorTest() {
        Protocol mockProtocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(mockProtocol);
        Assert.assertNotNull(decoder);
    }

    @Test
    public void getHasIndexTest() {
        Protocol mockProtocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(mockProtocol);
        boolean hasIndex = decoder.getHasIndex();
        Assert.assertEquals(false, hasIndex);
    }

    @Test
    public void getManufacturerTest() {
        Protocol mockProtocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(mockProtocol);
        String manufacturer = decoder.getManufacturer();
        Assert.assertEquals("", manufacturer);
    }

    @Test
    public void decodeTest() {
        Protocol mockProtocol = Mockito.mock(Protocol.class);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(mockProtocol);
        Channel mockChannel = Mockito.mock(Channel.class);
        InetSocketAddress remoteAddress = new InetSocketAddress("localhost", 8080);

        Object decoded = null;
        try {
            decoded = decoder.decode(mockChannel, remoteAddress, "sample message");
        } catch (Exception e) {
            Assert.fail("Exception thrown during test: " + e.toString());
        }

        Assert.assertEquals(Position.UNKNOWN, decoded);
    }

    @Test
    public void decodeExceptionTest() {
        Protocol mockProtocol = Mockito.mock(Protocol.class);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(mockProtocol);
        Channel mockChannel = Mockito.mock(Channel.class);
        InetSocketAddress remoteAddress = new InetSocketAddress("localhost", 8080);

        try {
            decoder.decode(mockChannel, remoteAddress, new Object());
            Assert.fail("Exception not thrown");
        } catch (Exception e) {
            Assert.assertTrue(e instanceof IllegalArgumentException);
        }
    }

}