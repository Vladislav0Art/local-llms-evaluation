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
public class GeneratedGalileoProtocolDecoderValidProtocolTest {

    @Mock
    private DeviceSession deviceSession;

    @Mock
    private SocketAddress socketAddress;

    @Test
    public void GalileoProtocolDecoderValidProtocolTest() {
        try {
            new GalileoProtocolDecoder(new Protocol("Galileo", "Galileo Protocol"));
        } catch (Exception exception) {
            Assert.fail("No exception should be thrown for a valid Protocol");
        }
    }

}