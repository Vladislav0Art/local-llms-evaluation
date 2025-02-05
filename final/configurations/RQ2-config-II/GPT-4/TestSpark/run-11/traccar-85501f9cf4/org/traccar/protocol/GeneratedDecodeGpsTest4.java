package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.traccar.model.Position;

import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.mockito.Matchers.any;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeGpsTest4 {

    @Mock
    org.traccar.Protocol protocol;

    @Test
    public void decodeGpsTest4() {
        Position position = new Position();
        ByteBuf buf = Unpooled.buffer();
        Assert.assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, false, false, false, TimeZone.getDefault()));
    }

}