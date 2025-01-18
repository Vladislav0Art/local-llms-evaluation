package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.model.Position;
import org.traccar.protocol.Gt06ProtocolDecoder;

import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeInvalidMsgTest {

    @Mock
    Channel channel;

    @Test
    public void decodeInvalidMsgTest() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(null);
        String invalidMsg = "InvalidMsg";
        InetSocketAddress socketAddress = new InetSocketAddress("localhost", 8080);

        Object result = decoder.decode(channel, socketAddress, invalidMsg);
        Assert.assertNull("Result should be null!", result);
    }

}