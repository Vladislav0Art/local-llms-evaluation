package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.doReturn;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeTest {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @Mock
    private Position position;

    @Test
    public void decodeTest() throws Exception {
        ByteBuf msg = Unpooled.copiedBuffer("127.0.0.1", StandardCharsets.UTF_8);
        Gt06ProtocolDecoder decoder = spy(new Gt06ProtocolDecoder(protocol));
        doReturn(position).when(decoder).decode(channel, null, msg);
        decoder.decode(channel, null, msg);
        verify(decoder).decode(channel, null, msg);
    }

}