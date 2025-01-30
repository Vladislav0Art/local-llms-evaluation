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

public class GeneratedDecodeIridiumPositionTest {

    private GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("galileo"));

    @Test
    public void decodeIridiumPositionTest() throws Exception {
        ByteBuf buf = Unpooled.copiedBuffer("01001C0008000A0001000000003030008000A000100000000".getBytes(StandardCharsets.ISO_8859_1));
        Position position = decoder.decodeIridiumPosition(null, null, buf);
        assertNotNull(position);
    }

}