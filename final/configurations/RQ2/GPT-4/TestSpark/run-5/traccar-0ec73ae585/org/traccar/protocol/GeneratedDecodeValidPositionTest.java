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

public class GeneratedDecodeValidPositionTest {

    @Test
    public void decodeValidPositionTest() throws Exception {
        Protocol protocol = new Protocol("test");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        IoBuffer buffer = IoBuffer.wrap(new byte[]{ /* valid position data */});

        Position position = (Position) decoder.decode(null, null, buffer);

        Assert.assertNotNull(position);
        Assert.assertEquals(123456, position.getDeviceId());
        // additional asserts for all position parameters
    }

}