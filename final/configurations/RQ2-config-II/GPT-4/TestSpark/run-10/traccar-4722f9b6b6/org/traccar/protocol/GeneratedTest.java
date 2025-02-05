package org.traccar.protocol;

import org.junit.Test;
import org.junit.Assert;
import io.netty.channel.Channel;
import org.traccar.Protocol;

import java.net.SocketAddress;

public class GeneratedTest {

    @Test
    public void WatchProtocolDecoderInstantiationTest() {
        Protocol protocol = new Protocol("Test") {
        };
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Assert.assertNotNull(decoder);
    }

    @Test
    public void getHasIndexTest() {
        Protocol protocol = new Protocol("Test") {
        };
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Assert.assertFalse(decoder.getHasIndex());
    }

    @Test
    public void getManufacturerTest() {
        Protocol protocol = new Protocol("Test") {
        };
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Assert.assertEquals("", decoder.getManufacturer());
    }

    @Test
    public void decodeNullTest() throws Exception {
        Protocol protocol = new Protocol("Test") {
        };
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Channel channel = null;
        SocketAddress remoteAddress = null;
        Object msg = null;
        Assert.assertNull(decoder.decode(channel, remoteAddress, msg));
    }

    @Test
    public void decodeInvalidMsgTest() throws Exception {
        Protocol protocol = new Protocol("Test") {
        };
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Channel channel = null;
        SocketAddress remoteAddress = null;
        Object msg = new Object();
        decoder.decode(channel, remoteAddress, msg);
    }

}