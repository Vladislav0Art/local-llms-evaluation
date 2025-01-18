package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;
import io.netty.channel.Channel;

import java.net.SocketAddress;

import org.traccar.Protocol;

public class GeneratedGetHasIndexTest {

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(Mockito.mock(Protocol.class));

    @Test
    public void getHasIndexTest() {
        assertFalse(decoder.getHasIndex());
    }

}