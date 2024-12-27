package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.protocol.BaseProtocolDecoder;
import org.traccar.protocol.Protocol;
import io.netty.channel.Channel;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.nio.channels.SelectionKey;
import java.nio.channels.Channel;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetManufacturer_DefaultValueTest {

    @Mock
    private Protocol protocol;

    @Mock
    private io.netty.channel.Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @InjectMocks
    private WatchProtocolDecoder decoder;

    @Test
    public void getManufacturer_DefaultValueTest() {
        assertEquals("", decoder.getManufacturer());
    }

}