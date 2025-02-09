package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import org.junit.Assert;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedTest {

    @Test
    public void GalileoProtocolDecoderConstructorTest() {
        Protocol protocol = new Protocol("galileo", 30, null);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Assert.assertNotNull(decoder);
    }

    @Test
    public void decodeNormalInputTest() throws Exception {
        Protocol protocol = new Protocol("galileo", 500, null);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        byte[] data = "sampleTestData".getBytes(StandardCharsets.UTF_8);

        String remoteAddress = "127.0.0.1";
        List<Position> positions = (List<Position>) decoder.decode(null, remoteAddress, Unpooled.copiedBuffer(data));
        Assert.assertNotNull(positions);
        Assert.assertNotEquals(0, positions.size());
    }

    @Test
    public void decodeExceptionTest() throws Exception {
        Protocol protocol = new Protocol("galileo", 500, null);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        byte[] data = "exceptionTestData".getBytes(StandardCharsets.UTF_8);

        String remoteAddress = "127.0.0.1";
        decoder.decode(null, remoteAddress, Unpooled.copiedBuffer(data));
    }

    @Test
    public void decodeNullInputTest() throws Exception {
        Protocol protocol = new Protocol("galileo", 500, null);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        List<Position> positions = (List<Position>) decoder.decode(null, null, null);
        Assert.assertNull(positions);
    }

    @Test
    public void decodeEmptyInputTest() throws Exception {
        Protocol protocol = new Protocol("galileo", 500, null);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        byte[] data = "".getBytes(StandardCharsets.UTF_8);

        String remoteAddress = "127.0.0.1";
        List<Position> positions = (List<Position>) decoder.decode(null, remoteAddress, Unpooled.copiedBuffer(data));
        Assert.assertNull(positions);
    }

}