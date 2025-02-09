package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.SocketAddress;
import java.util.TimeZone;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeWithExceptionTest {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress address;

    private Gt06ProtocolDecoder getDecoder() {
        return new Gt06ProtocolDecoder(protocol);
    }

    @Test
    public void decodeWithExceptionTest() throws Exception {
        Gt06ProtocolDecoder decoder = getDecoder();

        ByteBuf msg = Mockito.mock(ByteBuf.class);
        Mockito.when(msg.readableBytes()).thenThrow(new Exception());

        decoder.decode(channel, address, msg);
    }

}