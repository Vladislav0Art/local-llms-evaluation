package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Test;
import org.traccar.Protocol;

import java.net.SocketAddress;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedGetHasIndexTest {

    @Test
    public void getHasIndexTest() {
        Protocol protocol = new Protocol("testProtocol");
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(protocol);

        assertFalse(watchProtocolDecoder.getHasIndex());
    }

}