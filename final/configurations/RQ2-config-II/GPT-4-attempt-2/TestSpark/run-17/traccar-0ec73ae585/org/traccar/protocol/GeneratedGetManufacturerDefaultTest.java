package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import io.netty.channel.Channel;
import io.netty.buffer.Unpooled;

import java.net.InetSocketAddress;

public class GeneratedGetManufacturerDefaultTest {

    @Test
    public void getManufacturerDefaultTest() {
        Protocol protocol = new Protocol("TestProtocol");
        WatchProtocolDecoder watchDecoder = new WatchProtocolDecoder(protocol);
        String result = watchDecoder.getManufacturer();
        assertNull(result);
    }

}