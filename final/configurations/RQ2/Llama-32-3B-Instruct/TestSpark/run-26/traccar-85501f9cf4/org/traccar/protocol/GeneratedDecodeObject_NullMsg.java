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
public class GeneratedDecodeObject_NullMsg {

    @Mock
    private DeviceSession deviceSession;

    @Test
    public void decodeObject_NullMsg() {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = null;
        Object decodedObject = Gt06ProtocolDecoder.decode(channel, remoteAddress, msg);
        assertEquals(null, decodedObject);
    }

}