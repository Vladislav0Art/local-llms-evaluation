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
public class GeneratedDecodeGpsWithoutLengthAndInvalidInputTest {

    @Mock
    Channel channel;

    @Test
    public void decodeGpsWithoutLengthAndInvalidInputTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(null);
        ByteBuf buf = Unpooled.copiedBuffer("InvalidBuffer", StandardCharsets.UTF_8);

        try {
            boolean result = Gt06ProtocolDecoder.decodeGps(new Position(), buf, false, TimeZone.getDefault());
            Assert.assertFalse("Expecting false but result is " + result, result);

        } finally {
            buf.release();
        }
    }

}