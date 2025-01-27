package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeNetworkTest {

    @Mock
    private ByteBuf buf;

    @Mock
    private Channel channel;

    @Mock
    private DeviceSession deviceSession;

    @Mock
    private NetworkMessage networkMessage;

    @Test
    public void decodeNetworkTest() throws Exception {
        Object msg = new NetworkMessage(deviceSession);
        Object result = Gt06ProtocolDecoder.decode(channel, deviceSession, msg);
        assertNotNull(result);
    }

}