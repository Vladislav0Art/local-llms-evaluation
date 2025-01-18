package org.traccar.protocol;

import org.junit.Test;
import org.traccar.BaseProtocol;

import static org.junit.Assert.*;

import java.net.InetSocketAddress;

import io.netty.channel.Channel;

import static org.mockito.Mockito.*;

public class GeneratedDecodeWithoutChannelTest {

    @Test
    public void decodeWithoutChannelTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new BaseProtocol("watch"));
        assertNull(decoder.decode(null, new InetSocketAddress("localhost", 0), "test message"));
    }

}