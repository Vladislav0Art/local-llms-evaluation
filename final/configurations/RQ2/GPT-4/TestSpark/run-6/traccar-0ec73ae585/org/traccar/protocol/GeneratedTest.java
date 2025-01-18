package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

public class GeneratedTest {

    private static Protocol protocolMock = Mockito.mock(Protocol.class);

    @Test
    public void WatchProtocolDecoderConstructorTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocolMock);
        Assert.assertNotNull(decoder);
    }

    @Test
    public void getHasIndexTrueTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocolMock);
        Assert.assertTrue(decoder.getHasIndex());
    }

    @Test
    public void getHasIndexFalseTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocolMock);
        Assert.assertFalse(decoder.getHasIndex());
    }

    @Test
    public void getManufacturerDefaultTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocolMock);
        Assert.assertEquals("DefaultManufacturer", decoder.getManufacturer());
    }

    @Test
    public void getManufacturerSpecificTest() {
        Mockito.when(protocolMock.getName()).thenReturn("ManufacturerName");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocolMock);
        Assert.assertEquals("ManufacturerName", decoder.getManufacturer());
    }

    @Test
    public void decodeReturnNullTest() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = new InetSocketAddress("localhost", 8080);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocolMock);
        Object actual = decoder.decode(channel, remoteAddress, "");
        Assert.assertNull(actual);
    }

    @Test
    public void decodeThrowsExceptionTest() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = new InetSocketAddress("localhost", 8080);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocolMock);
        decoder.decode(channel, remoteAddress, new Object());
    }

    @Test
    public void decodeValidObjectTest() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = new InetSocketAddress("localhost", 8080);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocolMock);
        Object actual = decoder.decode(channel, remoteAddress, "validObject");
        Assert.assertNotNull(actual);
    }

}