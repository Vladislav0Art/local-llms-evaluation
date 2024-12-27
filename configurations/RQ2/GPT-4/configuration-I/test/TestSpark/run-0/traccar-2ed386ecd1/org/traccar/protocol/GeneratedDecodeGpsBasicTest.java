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

public class GeneratedDecodeGpsBasicTest {

    @Test
    public void decodeGpsBasicTest() {
        ByteBuf buf = Unpooled.copiedBuffer("0800", StandardCharsets.US_ASCII);
        Position position = new Position();
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true, TimeZone.getTimeZone(ZoneId.systemDefault()));
        Assert.assertTrue(result);
    }

}