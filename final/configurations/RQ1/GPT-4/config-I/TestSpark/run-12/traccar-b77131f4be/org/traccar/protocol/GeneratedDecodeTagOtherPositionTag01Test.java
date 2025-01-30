package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.model.Position;

import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeTagOtherPositionTag01Test {

    @Test
    public void decodeTagOtherPositionTag01Test() {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new GalileoProtocol());
        Position position = new Position();
        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(123);
        decoder.decodeTagOther(position, buf, 0x01);
        assertEquals(123, position.getAttributes().get(Position.KEY_VERSION_HW));
    }

}