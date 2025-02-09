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
public class GeneratedDecodeSuccessfulFlowTest {

    @Mock
    private Position position;
    @Mock
    private ByteBuf buf;

    @Test
    public void decodeSuccessfulFlowTest() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(null);
        Object msg = Unpooled.wrappedBuffer(new byte[]{(byte) 0x79, (byte) 0x79});
        Object result = decoder.decode(null, null, msg);
        assertNull(result);
    }

}