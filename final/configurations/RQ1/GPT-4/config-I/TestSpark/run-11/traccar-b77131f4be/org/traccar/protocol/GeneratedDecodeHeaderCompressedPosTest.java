package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.model.Position;
import org.traccar.Protocol;
import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeHeaderCompressedPosTest {

    @Test
    public void decodeHeaderCompressedPosTest() {
        ByteBuf buf = Unpooled.buffer().writeByte(0x08);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("test"));

        assertNull(decoder.decode(null, null, msg));
    }

}