package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;

import java.net.InetSocketAddress;

public class GeneratedGalileoProtocolDecoderConstructorTest {

    @Test
    public void galileoProtocolDecoderConstructorTest() {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol());

        Assert.assertNotNull(decoder);
    }

}