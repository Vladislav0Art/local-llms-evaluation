package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.nio.charset.StandardCharsets;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.util.TimeZone;
import java.net.SocketAddress;

import io.netty.channel.Channel;

import static org.junit.Assert.*;

public class GeneratedGt06ProtocolDecoderConstructorTest {

    @Test
    public void Gt06ProtocolDecoderConstructorTest() {
        Protocol protocolMock = Mockito.mock(Protocol.class);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocolMock);
        assertNotNull(decoder);
    }

}