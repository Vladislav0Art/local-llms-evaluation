package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeNoData {

    @Mock
    private Protocol protocol;

    @Mock
    private DeviceSession deviceSession;

    @Mock
    private Channel channel;

    @Mock
    private NetworkMessage networkMessage;

    @Test
    public void decodeNoData() throws Exception {
        when(channel.alloc()).thenReturn(Unpooled.buffer(0));
        when(networkMessage.getBuffer()).thenReturn(Unpooled.buffer());
        Object result = WatchProtocolDecoder.class.getMethod("decode", Channel.class, SocketAddress.class, Object.class).invoke(null, channel, networkMessage.getAddress(), networkMessage);
        assertNull(result);
    }

}