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

public class GeneratedDecodeIridiumPositionTest {

    public GalileoProtocolDecoderTest() {
        super(new GalileoProtocolDecoder(new ProtocolTest()));
    }

    @Test
    public void decodeIridiumPositionTest() throws Exception {
        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(0x01);
        buf.writeMediumLE(0x01001c);
        buf.writeBytes(new byte[]{100, 0, 11, 22, 33, 44, 55, 66, 77, 88, 99, 0, 0});
        Object result = decoder.decode(null, null, buf);
        assertTrue(result instanceof Position);
    }

}