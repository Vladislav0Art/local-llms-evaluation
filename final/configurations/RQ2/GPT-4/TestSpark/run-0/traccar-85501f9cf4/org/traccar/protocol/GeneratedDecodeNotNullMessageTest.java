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
public class GeneratedDecodeNotNullMessageTest {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress socketAddress;

    private ByteBuf byteBuf;

    @Test
    public void decodeNotNullMessageTest() {
        Gt06ProtocolDecoder gt06ProtocolDecoder = new Gt06ProtocolDecoder(protocol);
        byteBuf = Unpooled.buffer();
        byteBuf.writeInt(1); // Write some data to the buffer
        Object msg = byteBuf.array();

        try {
            assertNotNull(gt06ProtocolDecoder.decode(channel, socketAddress, msg));
        } catch (Exception e) {
            fail("Exception should not be thrown");
        }
    }

}