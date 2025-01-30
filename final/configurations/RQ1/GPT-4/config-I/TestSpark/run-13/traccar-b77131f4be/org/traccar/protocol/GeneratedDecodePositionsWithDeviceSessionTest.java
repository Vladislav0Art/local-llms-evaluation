package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.model.Position;
import org.traccar.protocol.GalileoProtocolDecoder;
import org.traccar.protocol.Protocol;

import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedDecodePositionsWithDeviceSessionTest {

    private GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("galileo"));

    @Test
    public void decodePositionsWithDeviceSessionTest() throws Exception {
        ByteBuf buf = Unpooled.copiedBuffer("01001C0008000A0001000000003030008000A000100000000".getBytes(StandardCharsets.ISO_8859_1));
        Object positions = decoder.decode(null, null, buf);
        assertNotNull(positions);
        assertTrue(positions instanceof List);
        assertFalse(((List) positions).isEmpty());
        assertTrue(((List) positions).get(0) instanceof Position);
    }

}