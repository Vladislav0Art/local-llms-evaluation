package org.traccar.protocol;

import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedDecodeMinimalDataSetTest {

    @Test
    public void decodeMinimalDataSetTest() {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("gl200"));
        Position position = new Position("gl200");
        ByteBuf buf = Unpooled.buffer();
        buf.writeLong(1000);

        decoder.decodeMinimalDataSet(position, buf);
        assertEquals(new Date(1000), position.getFixTime());
    }

}