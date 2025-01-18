package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.protocol.WatchProtocolDecoder;

import java.nio.charset.StandardCharsets;
import java.net.SocketAddress;

public class GeneratedDecodeWithChannelTest {

    @Test
    public void decodeWithChannelTest() throws Exception {
        Protocol protocol = new Protocol("test");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        byte[] msg = new byte[]{ /* valid position data */};

        Position position = (Position) decoder.decode(channel, remoteAddress, msg);

        Assert.assertNotNull(position);
        Assert.assertEquals(123456, position.getDeviceId());
        // additional asserts for all position parameters
    }

}