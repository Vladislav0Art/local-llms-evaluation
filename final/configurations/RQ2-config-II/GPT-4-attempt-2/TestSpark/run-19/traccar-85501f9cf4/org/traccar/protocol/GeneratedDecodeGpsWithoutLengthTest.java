package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.traccar.model.Position;
import org.traccar.Protocol;

import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeGpsWithoutLengthTest {


    @InjectMocks
    private Gt06ProtocolDecoder gt06ProtocolDecoder;

    private Protocol protocol = new Protocol("gt06");

    @Test
    public void decodeGpsWithoutLengthTest() {
        Position position = new Position();
        byte[] rawData = {0x10, 0x20, 0x30, 0x40};
        boolean isDecoded = Gt06ProtocolDecoder.decodeGps(position, Unpooled.wrappedBuffer(rawData), false, TimeZone.getDefault());
        assertTrue(isDecoded);
    }

}