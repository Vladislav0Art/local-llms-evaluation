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
public class GeneratedDecodeEmptyMessageTest {

    @Mock
    private DeviceSession deviceSession;

    @Mock
    private SocketAddress socketAddress;

    @Test
    public void decodeEmptyMessageTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("Galileo", "Galileo Protocol"));
        String emptyMessage = "";
        Object decodedObject = decoder.decode(null, socketAddress, Unpooled.copiedBuffer(emptyMessage, StandardCharsets.UTF_8));

        Assert.assertNull(decodedObject);
    }

}