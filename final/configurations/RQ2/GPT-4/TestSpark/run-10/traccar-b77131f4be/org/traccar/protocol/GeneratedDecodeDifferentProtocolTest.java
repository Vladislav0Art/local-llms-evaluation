package org.traccar.protocol;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.traccar.model.Protocol;
import org.traccar.model.Position;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import io.netty.channel.Channel;

import java.net.SocketAddress;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeDifferentProtocolTest {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @InjectMocks
    private GalileoProtocolDecoder galileoProtocolDecoder;

    @Test
    public void decodeDifferentProtocolTest() {
        try {
            GalileoProtocolDecoder differentDecoder = new GalileoProtocolDecoder(new Protocol("AnotherProtocol"));
            byte[] bytes = {(byte) 0x81, 0x01, 0x02, 0x03, (byte) 0x80};
            assertNotNull(differentDecoder.decode(channel, remoteAddress, bytes));
        } catch (Exception e) {
            fail("Test failed due to exception: " + e.getMessage());
        }
    }

}