package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import io.netty.channel.Channel;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class GeneratedDecodeGpsTestNullBuf {

    @Test
    public void decodeGpsTestNullBuf() {
        Position position = new Position();
        Gt06ProtocolDecoder.decodeGps(position, null, true, TimeZone.getDefault());
    }

}