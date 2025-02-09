package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import org.junit.Assert;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedGalileoProtocolDecoderConstructorTest {

    @Test
    public void GalileoProtocolDecoderConstructorTest() {
        Protocol protocol = new Protocol("galileo", 30, null);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Assert.assertNotNull(decoder);
    }

}