package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.util.TimeZone;

import static org.junit.Assert.*;

public class GeneratedGt06ProtocolDecoderConstructorTest {

    @Test
    public void Gt06ProtocolDecoderConstructorTest() {
        Protocol protocol = new Protocol("gt06") {
        };
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        assertNotNull(decoder);
    }

}