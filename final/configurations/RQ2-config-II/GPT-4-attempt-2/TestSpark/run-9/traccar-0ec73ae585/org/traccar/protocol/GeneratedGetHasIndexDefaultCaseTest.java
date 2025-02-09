package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.net.SocketAddress;

import junit.framework.TestCase;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedGetHasIndexDefaultCaseTest {

    @Test
    public void getHasIndexDefaultCaseTest() {
        WatchProtocolDecoder protocolDecoder = new WatchProtocolDecoder(new Protocol("WatchProtocol"));
        assertEquals(false, protocolDecoder.getHasIndex());
    }

}