package org.traccar.protocol;

import org.junit.Test;
import org.traccar.BaseProtocol;

import static org.junit.Assert.*;

import java.net.InetSocketAddress;

import io.netty.channel.Channel;

import static org.mockito.Mockito.*;

public class GeneratedGetHasIndexTest {

    @Test
    public void getHasIndexTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new BaseProtocol("watch"));
        assertFalse(decoder.getHasIndex());
    }

}