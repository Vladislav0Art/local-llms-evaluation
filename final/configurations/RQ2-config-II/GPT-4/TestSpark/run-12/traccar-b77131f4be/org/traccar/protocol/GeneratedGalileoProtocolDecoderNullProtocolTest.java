package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGalileoProtocolDecoderNullProtocolTest {

    @Mock
    private DeviceSession deviceSession;

    @Mock
    private SocketAddress socketAddress;

    @Test
    public void GalileoProtocolDecoderNullProtocolTest() {
        try {
            new GalileoProtocolDecoder(null);
            Assert.fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException exception) {
            Assert.assertTrue(exception.getMessage().contains("protocol must not be null"));
        }
    }

}