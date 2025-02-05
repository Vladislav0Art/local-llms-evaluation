package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.nio.ByteBuffer;

import org.traccar.model.Position;

import java.util.TimeZone;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeTest {

    @Test
    public void decodeTest() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol("GT06R"));
        ByteBuf buf = Unpooled.buffer();
        buf.writeBytes(ByteBuffer.allocate(12).putShort((short) 24).array());

        assertNotNull(decoder.decode(Mockito.mock(Channel.class), Mockito.mock(SocketAddress.class), buf));
    }

}