package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.traccar.model.Position;
import org.traccar.protocol.Gt06ProtocolDecoder;

import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

public class GeneratedDecodeCustomParametersTest {

    @Test
    public void decodeCustomParametersTest() throws Exception {
        MockChannel channel = new MockChannel();
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new MockProtocol());
        String data = "111111111111111111111111";
        decoder.decode(channel, null, data);

        Assert.assertNotNull(channel.readOutbound());
    }
}

class MockChannel implements Channel {
    /* Mocked implementation of the Channel interface */
}

}