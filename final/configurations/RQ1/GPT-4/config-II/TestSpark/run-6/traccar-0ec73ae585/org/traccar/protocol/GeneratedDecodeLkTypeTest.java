package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedDecodeLkTypeTest {

    @Test
    public void decodeLkTypeTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));
        Channel channel = mock(Channel.class);
        ByteBuf byteBuf = Unpooled.wrappedBuffer("[3G*1234567890*0002*LK]".getBytes(StandardCharsets.US_ASCII));
        decoder.decode(channel, null, byteBuf);
        assertEquals("3G", decoder.getManufacturer());
        assertTrue(decoder.getHasIndex());
    }

}