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
public class GeneratedTest {

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

    @Test
    public void decodeEmptyMessageTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("Galileo", "Galileo Protocol"));
        String emptyMessage = "";
        Object decodedObject = decoder.decode(null, socketAddress, Unpooled.copiedBuffer(emptyMessage, StandardCharsets.UTF_8));

        Assert.assertNull(decodedObject);
    }

    @Test
    public void decodeNullMessageTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("Galileo", "Galileo Protocol"));
        Object decodedObject = decoder.decode(null, socketAddress, Unpooled.copiedBuffer(new byte[0]));

        Assert.assertNull(decodedObject);
    }

    @Test
    public void decodeInvalidMessageTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("Galileo", "Galileo Protocol"));
        String invalidMessage = "Invalid message content";
        decoder.decode(null, socketAddress, Unpooled.copiedBuffer(invalidMessage, StandardCharsets.UTF_8));
    }

    @Test
    public void GalileoProtocolDecoderNullProtocolTest() {
        try {
            new GalileoProtocolDecoder(null);
            Assert.fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException exception) {
            Assert.assertTrue(exception.getMessage().contains("protocol must not be null"));
        }
    }

    @Test
    public void GalileoProtocolDecoderValidProtocolTest() {
        try {
            new GalileoProtocolDecoder(new Protocol("Galileo", "Galileo Protocol"));
        } catch (Exception exception) {
            Assert.fail("No exception should be thrown for a valid Protocol");
        }
    }

}