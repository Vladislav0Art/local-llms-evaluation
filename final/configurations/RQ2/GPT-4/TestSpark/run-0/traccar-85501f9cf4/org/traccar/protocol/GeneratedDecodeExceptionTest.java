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

import java.net.SocketAddress;
import java.util.TimeZone;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeExceptionTest {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress socketAddress;

    private ByteBuf byteBuf;

    @Test
    public void decodeExceptionTest() {
        Gt06ProtocolDecoder gt06ProtocolDecoder = new Gt06ProtocolDecoder(protocol);
        byteBuf = Unpooled.buffer();
        Object msg = byteBuf.array();

        try {
            assertNull(gt06ProtocolDecoder.decode(channel, socketAddress, msg));
        } catch (Exception e) {
            fail("Exception should not be thrown");
        }
    }

}