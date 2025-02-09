package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

public class GeneratedTest {

    private static final String HEX_MESSAGE = "1a2b3c4d5e6f";
    private static final String EXPECTED_STRING = "123456";

    @Test
    public void WatchProtocolDecoderConstructorTest() {
        Protocol protocol = new Protocol("watchProtocol");
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(protocol);
        Assert.assertNotNull(watchProtocolDecoder);
    }

    @Test
    public void getHasIndexDefaultConstructorTest() {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(new Protocol("watchProtocol"));
        Assert.assertFalse(watchProtocolDecoder.getHasIndex());
    }

    @Test
    public void getManufacturerEmptyConstructorTest() {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(new Protocol(""));
        Assert.assertNull(watchProtocolDecoder.getManufacturer());
    }

    @Test
    public void getManufacturerTest() {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(new Protocol("watchProtocol"));
        Assert.assertEquals("China", watchProtocolDecoder.getManufacturer());
    }

    @Test
    public void decodeEmptyChannelTest() throws Exception {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(new Protocol("watchProtocol"));
        SocketAddress remoteAddress = new InetSocketAddress("127.0.0.1", 8080);
        String decodedData = (String) watchProtocolDecoder.decode(null, remoteAddress, HEX_MESSAGE);
        Assert.assertNull(decodedData);
    }

    @Test
    public void decodeHexStringTest() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(new Protocol("watchProtocol"));
        SocketAddress remoteAddress = new InetSocketAddress("127.0.0.1", 8080);
        String decodedData = (String) watchProtocolDecoder.decode(channel, remoteAddress, HEX_MESSAGE);
        Assert.assertEquals(EXPECTED_STRING, decodedData);
    }

    @Test
    public void decodeEmptyHexStringTest() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(new Protocol("watchProtocol"));
        SocketAddress remoteAddress = new InetSocketAddress("127.0.0.1", 8080);
        String decodedData = (String) watchProtocolDecoder.decode(channel, remoteAddress, "");
        Assert.assertEquals("", decodedData);
    }

    @Test
    public void decodeInvalidHexStringTest() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(new Protocol("watchProtocol"));
        SocketAddress remoteAddress = new InetSocketAddress("127.0.0.1", 8080);
        watchProtocolDecoder.decode(channel, remoteAddress, "invalid_hex_string");
    }

}