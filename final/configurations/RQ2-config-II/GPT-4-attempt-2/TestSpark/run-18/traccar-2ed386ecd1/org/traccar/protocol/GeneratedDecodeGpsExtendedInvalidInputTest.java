package org.traccar.protocol;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import org.traccar.model.Position;
import io.netty.buffer.Unpooled;

import java.util.TimeZone;

public class GeneratedDecodeGpsExtendedInvalidInputTest {

    @Test
    public void decodeGpsExtendedInvalidInputTest() {
        Position mockPosition = Mockito.mock(Position.class);
        TimeZone timeZone = TimeZone.getTimeZone("UTC");

        boolean response = Gt06ProtocolDecoder.decodeGps(mockPosition, null, false, false, false, timeZone);

        Assert.assertFalse(response);
    }

}