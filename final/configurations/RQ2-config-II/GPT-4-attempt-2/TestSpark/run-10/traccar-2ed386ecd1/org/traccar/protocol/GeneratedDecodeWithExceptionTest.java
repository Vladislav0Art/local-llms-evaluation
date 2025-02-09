package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeWithExceptionTest {

    @Mock
    private Channel channel;

    @Mock
    private Protocol protocol;

    @Test
    public void decodeWithExceptionTest() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        String str = "abcd";
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        when(channel.remoteAddress()).thenReturn(null);
        decoder.decode(channel, null, Unpooled.copiedBuffer(bytes));
    }

}