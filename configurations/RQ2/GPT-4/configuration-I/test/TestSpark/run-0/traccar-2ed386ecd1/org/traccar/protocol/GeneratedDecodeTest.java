package org.traccar.protocol;

import org.traccar.model.Position;
import org.traccar.protocol.Gt06ProtocolDecoder;
import org.traccar.BaseProtocol;
import org.junit.Assert;
import org.junit.Test;

import java.time.ZoneId;

import io.netty.buffer.Unpooled;
import io.netty.buffer.ByteBuf;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.protocol.Protocol;

public class GeneratedDecodeTest {

    @Test
    public void decodeTest() throws Exception {
        ByteBuf buf = Unpooled.copiedBuffer("0200", StandardCharsets.US_ASCII);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        BaseProtocol protocol = Mockito.mock(BaseProtocol.class);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        Object result = decoder.decode(null, remoteAddress, buf);
        Assert.assertNotNull(result);
    }

}