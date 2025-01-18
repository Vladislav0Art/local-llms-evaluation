package org.traccar.protocol;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import io.netty.channel.Channel;

import java.net.SocketAddress;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeNullTest {

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @InjectMocks
    private GalileoProtocolDecoder galileoProtocolDecoder;

    @Test
    public void decodeNullTest() {
        try {
            assertNull(galileoProtocolDecoder.decode(channel, remoteAddress, null));
        } catch (Exception e) {
            fail("Test failed due to exception: " + e.getMessage());
        }
    }

}