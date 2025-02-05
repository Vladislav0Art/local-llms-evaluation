package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Assert;
import org.junit.Test;
import org.traccar.model.Position;

import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

public class GeneratedDecodeInvalidMessageTest {

    private Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Gt06Protocol());

    @Test
    public void decodeInvalidMessageTest() throws Exception {
        decoder.decode(null, null, "Invalid Message");
    }

}