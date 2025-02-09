package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.TimeZone;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeGpsWithParametersTest {

    @Mock
    private Position position;
    @Mock
    private ByteBuf buf;

    @Test
    public void decodeGpsWithParametersTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(null);
        ByteBuf buf = Unpooled.wrappedBuffer(new byte[]{(byte) 0x01});
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true, true, true, TimeZone.getDefault());
        assertTrue(result);
    }

}