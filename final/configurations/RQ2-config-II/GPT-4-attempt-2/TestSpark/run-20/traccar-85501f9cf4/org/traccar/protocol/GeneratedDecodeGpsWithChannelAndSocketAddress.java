package org.traccar.protocol;

import org.junit.Test;
import org.junit.Assert;
import io.netty.buffer.Unpooled;

import java.nio.charset.StandardCharsets;
import java.nio.ByteBuffer;

import org.traccar.model.Position;

import java.util.Date;

public class GeneratedDecodeGpsWithChannelAndSocketAddress {

    @Test
    public void decodeGpsWithChannelAndSocketAddress() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Gt06Protocol());
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        buffer.put("Gt06Protocol Test".getBytes(StandardCharsets.UTF_8));
        buffer.flip();

        Assert.assertNull(decoder.decode(null, null, buffer.array()));
    }

}