package org.traccar.protocol;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import org.traccar.model.Position;
import io.netty.buffer.Unpooled;

import java.util.TimeZone;

public class GeneratedDecodeGpsSuccesfulCaseTest {

    @Test
    public void decodeGpsSuccesfulCaseTest() {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeByte(12);
        buffer.writeByte(34);

        Position mockPosition = Mockito.mock(Position.class);
        TimeZone timeZone = TimeZone.getTimeZone("UTC");

        boolean response = Gt06ProtocolDecoder.decodeGps(mockPosition, buffer, true, timeZone);

        Assert.assertTrue(response);
    }

}