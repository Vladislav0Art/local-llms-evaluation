package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import org.junit.Assert;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedDecodeExceptionTest {

    @Test
    public void decodeExceptionTest() throws Exception {
        Protocol protocol = new Protocol("galileo", 500, null);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        byte[] data = "exceptionTestData".getBytes(StandardCharsets.UTF_8);

        String remoteAddress = "127.0.0.1";
        decoder.decode(null, remoteAddress, Unpooled.copiedBuffer(data));
    }

}