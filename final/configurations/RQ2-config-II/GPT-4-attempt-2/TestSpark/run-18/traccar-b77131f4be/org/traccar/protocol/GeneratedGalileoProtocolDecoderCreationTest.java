package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.SocketAddress;

import io.netty.channel.Channel;
import org.traccar.Protocol;
import org.traccar.model.Position;

public class GeneratedGalileoProtocolDecoderCreationTest {

    @Test
    public void GalileoProtocolDecoderCreationTest() {
        Protocol protocol = new Protocol("test");
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Assert.assertNotNull(decoder);
    }

}