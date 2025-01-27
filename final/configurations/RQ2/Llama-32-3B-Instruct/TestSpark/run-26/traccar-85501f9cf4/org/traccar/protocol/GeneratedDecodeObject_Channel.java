package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeObject_Channel {

    @Mock
    private DeviceSession deviceSession;

    @Test
    public void decodeObject_Channel() {
        Channel channel = Mockito.mock(Channel.class);
        Object msg = null;
        Object decodedObject = Gt06ProtocolDecoder.decode(channel, Mockito.any(SocketAddress.class), msg);
        assertEquals(null, decodedObject);
    }

}