package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import io.netty.channel.Channel;
import org.traccar.Protocol;
import org.traccar.helper.Parser;
import org.traccar.model.Position;

import java.net.SocketAddress;

public class GeneratedDecodeNullMessageTest {

    @Test
    public void decodeNullMessageTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));
        Channel channel = null;
        SocketAddress remoteAddress = null;
        String msg = null;
        assertNull(decoder.decode(channel, remoteAddress, msg));
    }

}