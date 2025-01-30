package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.lang.reflect.Method;
import java.net.SocketAddress;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.traccar.model.Position;
import org.traccar.protocol.GalileoProtocolDecoder;

import static org.mockito.Mockito.mock;

public class GeneratedDecodeUnknownPositionHeaderTest {

    @Test
    public void decodeUnknownPositionHeaderTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(null);
        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(0x03);
        assertNull(decoder.decode(null, null, buf));
    }

}