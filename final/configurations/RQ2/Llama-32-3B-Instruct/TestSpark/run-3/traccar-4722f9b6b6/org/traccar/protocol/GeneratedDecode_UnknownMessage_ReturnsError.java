package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecode_UnknownMessage_ReturnsError {

    @Mock
    private DeviceSession deviceSession;

    @Mock
    private NetworkMessage networkMessage;

    @Mock
    private Channel channel;

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);

    @Test
    public void decode_UnknownMessage_ReturnsError() throws Exception {
        Object msg = new Object();
        Object result = decoder.decode(channel, "localhost", msg);
        assertTrue(result instanceof Exception);
    }

}