package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.Protocol;

import static org.mockito.Mockito.*;

import java.net.InetSocketAddress;

import io.netty.channel.Channel;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void decodeWithValidParamsTest() throws Exception {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        Channel channel = mock(Channel.class);
        InetSocketAddress remoteAddress = new InetSocketAddress("localhost", 5000);
        Object msg = "TestMessage";

        decoder.decode(channel, remoteAddress, msg);
        verify(protocol, times(1)).getId();
    }

    @Test
    public void decodeWithNullChannelTest() throws Exception {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        InetSocketAddress remoteAddress = new InetSocketAddress("localhost", 5000);
        Object msg = "TestMessage";

        decoder.decode(null, remoteAddress, msg);
        verify(protocol, times(1)).getId();
    }

    @Test
    public void decodeWithNullRemoteAddressTest() throws Exception {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        Channel channel = mock(Channel.class);
        Object msg = "TestMessage";

        decoder.decode(channel, null, msg);
        verify(protocol, times(1)).getId();
    }

    @Test
    public void getHasIndexTest() {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        decoder.getHasIndex();
        verify(protocol, times(1)).getId();
    }

    @Test
    public void getManufacturerTest() {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        decoder.getManufacturer();
        verify(protocol, times(1)).getId();
    }

}