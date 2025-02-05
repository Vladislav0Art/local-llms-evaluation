package org.traccar.protocol;

import org.junit.Test;
import org.traccar.model.Position;

import static org.junit.Assert.*;

import io.netty.buffer.Unpooled;
import org.traccar.Protocol;

public class GeneratedDecodeWithInvalidMsgTest {

    @Test
    public void decodeWithInvalidMsgTest() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol("gt06"));
        decoder.decode(null, null, new Object());
    }

}