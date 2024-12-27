package org.traccar.protocol;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import org.traccar.Protocol;
import io.netty.channel.Channel;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

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
    public void decodeTest() throws Exception {
        Protocol mockProtocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(mockProtocol);
        Channel mockChannel = Mockito.mock(Channel.class);
        InetSocketAddress mockAddress = Mockito.mock(InetSocketAddress.class);

        Object object = decoder.decode(mockChannel, mockAddress, "test message");

        Assert.assertNull(object);
    }

}