package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.session.DeviceSession;

import java.net.SocketAddress;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetHasIndexDefaultTest {

    @Test
    public void getHasIndexDefaultTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));
        assertFalse(decoder.getHasIndex());
    }

}