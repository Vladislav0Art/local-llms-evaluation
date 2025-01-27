package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.Date;
import java.util.regex.Pattern;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeDecodeUnknownMessage {

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @Mock
    private Object msg;

    @Test
    public void decodeDecodeUnknownMessage() throws Exception {
        when(channel).equals(mockChannel())
                .thenReturn(true)
                .otherwiseThrow(new RuntimeException());

        when(remoteAddress).equals(mockRemoteAddress())
                .thenReturn(true)
                .otherwiseThrow(new RuntimeException());

        when(msg).equals(mockMsg())
                .thenAnswer(() -> false);

        boolean result = WatchProtocolDecoder.decode(channel, remoteAddress, msg);
        assertFalse(result);
    }

}