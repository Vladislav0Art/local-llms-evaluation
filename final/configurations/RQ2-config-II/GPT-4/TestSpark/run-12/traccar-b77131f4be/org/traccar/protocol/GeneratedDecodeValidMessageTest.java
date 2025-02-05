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
public class GeneratedDecodeValidMessageTest {

    @Mock
    private DeviceSession deviceSession;

    @Mock
    private SocketAddress socketAddress;

    @Test
    public void decodeValidMessageTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("Galileo", "Galileo Protocol"));
        String validMessage = "Valid message content";
        Object decodedObject = decoder.decode(null, socketAddress, Unpooled.copiedBuffer(validMessage, StandardCharsets.UTF_8));

        Assert.assertNotNull(decodedObject);
    }

}