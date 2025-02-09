package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGt06ProtocolDecoderInitializationTest {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @Test
    public void Gt06ProtocolDecoderInitializationTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        assertTrue(decoder instanceof Gt06ProtocolDecoder);
    }

}