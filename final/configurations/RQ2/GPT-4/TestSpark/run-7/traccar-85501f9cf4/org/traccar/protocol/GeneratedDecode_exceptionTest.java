package org.traccar.protocol;

import org.junit.Test;
import org.traccar.protocol.Gt06ProtocolDecoder;
import org.traccar.model.Position;
import io.netty.buffer.Unpooled;

import java.util.TimeZone;

import static org.junit.Assert.*;

public class GeneratedDecode_exceptionTest {

    @Test
    public void decode_exceptionTest() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(null);
        decoder.decode(null, null, null);
    }

}