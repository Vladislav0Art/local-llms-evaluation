package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import org.junit.Assert;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedDecodeNullInputTest {

    @Test
    public void decodeNullInputTest() throws Exception {
        Protocol protocol = new Protocol("galileo", 500, null);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        List<Position> positions = (List<Position>) decoder.decode(null, null, null);
        Assert.assertNull(positions);
    }

}