package org.traccar.protocol;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import org.traccar.model.Position;
import io.netty.buffer.Unpooled;

import java.util.TimeZone;

public class GeneratedDecodeGpsInvalidInputTest {

    @Test
    public void decodeGpsInvalidInputTest() {
        Position mockPosition = Mockito.mock(Position.class);
        TimeZone timeZone = TimeZone.getTimeZone("UTC");

        boolean response = Gt06ProtocolDecoder.decodeGps(mockPosition, null, true, timeZone);

        Assert.assertFalse(response);
    }

}