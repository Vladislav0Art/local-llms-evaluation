package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.TimeZone;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeGpsFalseWithoutLengthTest {

    @Test
    public void decodeGpsFalseWithoutLengthTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol("GT06-Protocol"));
        Position position = new Position();
        byte[] bytes = {1, 1, 1, 1};
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        boolean result = decoder.decodeGps(position, Unpooled.copiedBuffer(bytes), false, calendar.getTimeZone());
        assertFalse(result);
    }

}