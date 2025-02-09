package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.model.Position;
import org.traccar.protocol.Gt06ProtocolDecoder;

import java.util.TimeZone;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.net.SocketAddress;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeGpsWithLengthTrueTest {

    @Test
    public void decodeGpsWithLengthTrueTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(null);

        Position position = new Position();
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeByte(0);

        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buffer, true, TimeZone.getDefault()));
    }

}