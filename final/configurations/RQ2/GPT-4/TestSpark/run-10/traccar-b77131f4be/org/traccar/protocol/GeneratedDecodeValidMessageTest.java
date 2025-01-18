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
public class GeneratedDecodeValidMessageTest {

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @InjectMocks
    private GalileoProtocolDecoder galileoProtocolDecoder;

    @Test
    public void decodeValidMessageTest() {
        try {
            assertNotNull(galileoProtocolDecoder.decode(channel, remoteAddress, new byte[]{(byte) 0x81, 0x01, 0x02, 0x03, (byte) 0x80}));
        } catch (Exception e) {
            fail("Test failed due to exception: " + e.getMessage());
        }
    }

}