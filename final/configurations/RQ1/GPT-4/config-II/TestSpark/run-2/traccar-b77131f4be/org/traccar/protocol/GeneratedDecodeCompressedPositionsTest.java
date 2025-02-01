package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import org.traccar.BaseProtocolDecoderTest;
import org.traccar.ProtocolTest;
import org.traccar.model.Position;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;

public class GeneratedDecodeCompressedPositionsTest {

    public GalileoProtocolDecoderTest() {
        super(new GalileoProtocolDecoder(new ProtocolTest()));
    }

    @Test
    public void decodeCompressedPositionsTest() throws Exception {
        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(0x08);
        buf.writeBytes(new byte[]{5, 15, 25, 35, 45, 55, 65, 75, 85, 95, 0, 0});
        Object result = decoder.decode(null, null, buf);
        assertTrue(result instanceof Position);
    }

}