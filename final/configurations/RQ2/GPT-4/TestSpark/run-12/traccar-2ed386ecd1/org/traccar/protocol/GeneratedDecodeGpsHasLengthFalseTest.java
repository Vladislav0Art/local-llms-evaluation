package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import io.netty.buffer.Unpooled;

import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeGpsHasLengthFalseTest {

    @Test
    public void decodeGpsHasLengthFalseTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol("gt06", new OneNetProtocol()));
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("0006090B0D0002030405060708090B0D00020304", StandardCharsets.ISO_8859_1);
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, false, TimeZone.getDefault()));
    }

}