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
public class GeneratedDecodeHeaderPhotoTest {

    @Test
    public void decodeHeaderPhotoTest() {
        ByteBuf buf = Unpooled.buffer().writeByte(0x07);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("test"));

        assertNull(decoder.decode(null, null, msg));
    }

}