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
public class GeneratedDecodeTagOtherTest {

    @Test
    public void decodeTagOtherTest() throws Exception {
        Protocol protocol = new Protocol("TEST");
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        Position position = new Position(protocol.getName());
        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(10);
        decoder.decodeTagOther(position, buf, 10);
        assertNotNull(position);
    }

}