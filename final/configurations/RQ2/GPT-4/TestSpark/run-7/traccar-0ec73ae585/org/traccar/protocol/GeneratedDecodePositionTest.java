package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.Helper;

import static org.mockito.Mockito.*;

public class GeneratedDecodePositionTest {

    @Test
    public void decodePositionTest() throws Exception {
        Protocol protocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        ByteBuf buf = Unpooled.copiedBuffer("this is a test message".getBytes());
        Position position = (Position) decoder.decode(null, null, buf);

        Assert.assertNotNull(position);
        Assert.assertEquals("this is a test message", position.getPayload());
    }

}