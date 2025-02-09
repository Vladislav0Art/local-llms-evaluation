package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import org.junit.Assert;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedDecodeEmptyInputTest {

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