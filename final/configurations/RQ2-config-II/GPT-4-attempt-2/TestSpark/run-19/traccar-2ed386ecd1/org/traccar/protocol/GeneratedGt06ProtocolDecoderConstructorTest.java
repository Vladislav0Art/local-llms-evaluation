package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.model.Position;
import org.traccar.Protocol;

import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGt06ProtocolDecoderConstructorTest {

    private static final Protocol PROTOCOL = new Protocol("gt06");

    @Test
    public void Gt06ProtocolDecoderConstructorTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(PROTOCOL);

        assertNotNull(decoder);
        assertEquals(PROTOCOL, decoder.getProtocol());
    }

}