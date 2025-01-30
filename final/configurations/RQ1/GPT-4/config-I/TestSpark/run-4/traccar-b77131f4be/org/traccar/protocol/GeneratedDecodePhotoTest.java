package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodePhotoTest {

    @Test
    public void decodePhotoTest() throws Exception {
        Protocol protocol = new Protocol("TEST");
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        ByteBuf buf = Unpooled.buffer();
        buf.writeShortLE(0);
        assertNull(decoder.decodePhoto(null, null, buf));
    }

}