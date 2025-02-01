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

public class GeneratedDecodePositionsTest {

    public GalileoProtocolDecoderTest() {
        super(new GalileoProtocolDecoder(new ProtocolTest()));
    }

    @Test
    public void decodePositionsTest() throws Exception {
        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(0x01);
        buf.writeBytes(new byte[]{5, 10, 20, 25, 40, 5, 3, 2, 1, 0, 0});
        Object result = decoder.decode(null, null, buf);
        assertTrue(result instanceof Position);
    }

}