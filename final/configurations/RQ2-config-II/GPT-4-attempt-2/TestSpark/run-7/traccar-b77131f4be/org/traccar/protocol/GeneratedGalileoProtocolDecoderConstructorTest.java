package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.mockito.Mockito.mock;

public class GeneratedGalileoProtocolDecoderConstructorTest {

    @Test
    public void GalileoProtocolDecoderConstructorTest() {
        Protocol protocol = new Protocol("galileo", null, null, null);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Assert.assertNotNull(decoder);
    }

}