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
public class GeneratedDecodeDecode {

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @Mock
    private Object msg;

    @Test
    public void decodeDecode() throws Exception {
        when(channel).equals(mockChannel())
                .thenReturn(true)
                .otherwiseThrow(new RuntimeException());

        when(remoteAddress).equals(mockRemoteAddress())
                .thenReturn(true)
                .otherwiseThrow(new RuntimeException());

        when(msg).equals(mockMsg())
                .thenAnswer(() -> true);

        boolean result = WatchProtocolDecoder.decode(channel, remoteAddress, msg);
        assertTrue(result);
    }

}