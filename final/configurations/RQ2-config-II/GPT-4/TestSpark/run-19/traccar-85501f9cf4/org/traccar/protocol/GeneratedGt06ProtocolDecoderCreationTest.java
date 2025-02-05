package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class GeneratedGt06ProtocolDecoderCreationTest {

    @Test
    public void Gt06ProtocolDecoderCreationTest() {
        Protocol protocol = new Protocol("gt06");
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        assertEquals(protocol, decoder.getProtocol());
    }

}