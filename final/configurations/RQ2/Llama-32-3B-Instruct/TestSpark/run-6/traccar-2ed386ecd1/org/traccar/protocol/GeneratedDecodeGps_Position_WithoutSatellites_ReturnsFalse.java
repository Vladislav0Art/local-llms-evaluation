package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeGps_Position_WithoutSatellites_ReturnsFalse {

    @Mock
    private ByteBuf buf;

    public ByteBuf getMockByteBuf() {
        return Unpooled.buffer(1024);
    }

    @Test
    public void decodeGps_Position_WithoutSatellites_ReturnsFalse() {
        when(buf.readByte()).thenReturn((byte) 0x00);
        boolean result = Gt06ProtocolDecoder.decodeGps(null, getMockByteBuf(), true, false);
        assertFalse(result);
    }

}