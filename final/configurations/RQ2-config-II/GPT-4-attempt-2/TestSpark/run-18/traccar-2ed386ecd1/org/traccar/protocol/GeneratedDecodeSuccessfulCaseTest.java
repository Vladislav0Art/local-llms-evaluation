package org.traccar.protocol;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import org.traccar.model.Position;
import io.netty.buffer.Unpooled;

import java.util.TimeZone;

public class GeneratedDecodeSuccessfulCaseTest {

    @Test
    public void decodeSuccessfulCaseTest() throws Exception {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeByte(12);
        buffer.writeByte(34);

        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        Assert.assertNotNull(decoder.decode(null, null, buffer));
    }

}