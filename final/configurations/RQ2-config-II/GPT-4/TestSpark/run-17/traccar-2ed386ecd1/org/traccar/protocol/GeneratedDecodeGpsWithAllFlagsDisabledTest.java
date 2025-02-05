package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import static org.mockito.Mockito.mock;

import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.model.Position;

import java.util.TimeZone;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeGpsWithAllFlagsDisabledTest {

    private static final ByteBuf TEST_BYTE_BUF = Unpooled.wrappedBuffer(new byte[10]);

    private final Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(mock(Protocol.class));

    @Test
    public void decodeGpsWithAllFlagsDisabledTest() {
        Position position = new Position();
        boolean result = Gt06ProtocolDecoder.decodeGps(position, TEST_BYTE_BUF, false, false, false, TimeZone.getDefault());
        assertTrue(result);
    }

}