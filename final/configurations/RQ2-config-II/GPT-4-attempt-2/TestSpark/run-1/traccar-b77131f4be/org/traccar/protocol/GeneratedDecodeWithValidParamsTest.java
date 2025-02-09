package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.helper.TestDataManager;
import org.traccar.model.Position;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeWithValidParamsTest {

    @Mock
    private Protocol protocol;

    @Mock
    private Position position;

    @Test
    public void decodeWithValidParamsTest() throws Exception {
        when(protocol.getDeviceSession(null, null)).thenReturn(null);

        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Object msg = "valid message";

        Object result = decoder.decode(channel, remoteAddress, msg);

        verify(channel, times(1)).writeAndFlush(any(NetworkMessage.class));
        assertEquals(position, result);
    }

}