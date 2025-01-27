package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeInvalidData {

    @Mock
    private Protocol protocol;

    @Mock
    private DeviceSession deviceSession;

    @Mock
    private Channel channel;

    @Mock
    private NetworkMessage networkMessage;

    @Test
    public void decodeInvalidData() throws Exception {
        when(channel.alloc()).thenReturn(Unpooled.buffer(100));
        BufferUtil.writeByte(0, channel.alloc());
        BufferUtil.writeShort(1, channel.alloc());
        when(networkMessage.getBuffer()).thenReturn(PatternBuilder.parse("Invalid Data"));
        Object result = WatchProtocolDecoder.class.getMethod("decode", Channel.class, SocketAddress.class, Object.class).invoke(null, channel, networkMessage.getAddress(), networkMessage);
        assertNull(result);
    }

}