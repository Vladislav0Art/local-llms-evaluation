package org.traccar.protocol;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import org.traccar.model.Position;
import io.netty.buffer.Unpooled;

import java.util.TimeZone;

public class GeneratedDecodeExceptionCaseTest {

    @Test
    public void decodeExceptionCaseTest() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        decoder.decode(null, null, null);
    }

}