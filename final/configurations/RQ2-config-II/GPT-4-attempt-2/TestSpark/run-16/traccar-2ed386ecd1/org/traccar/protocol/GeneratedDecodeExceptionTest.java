package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import io.netty.buffer.Unpooled;
import org.traccar.model.Position;
import org.traccar.protocol.Gt06ProtocolDecoder;

import java.util.TimeZone;

public class GeneratedDecodeExceptionTest {

    @Test
    public void decodeExceptionTest() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(null);
        decoder.decode(null, null, new Object());
    }

}