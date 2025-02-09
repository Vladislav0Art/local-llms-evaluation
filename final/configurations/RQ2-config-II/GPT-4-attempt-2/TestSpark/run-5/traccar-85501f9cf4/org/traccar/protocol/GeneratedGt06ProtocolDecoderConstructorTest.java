package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Context;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGt06ProtocolDecoderConstructorTest {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @Test
    public void Gt06ProtocolDecoderConstructorTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        assertTrue(decoder instanceof Gt06ProtocolDecoder);
    }

}