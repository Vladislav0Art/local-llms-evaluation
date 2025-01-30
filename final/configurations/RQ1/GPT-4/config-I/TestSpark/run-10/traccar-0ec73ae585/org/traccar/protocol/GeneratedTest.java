package org.traccar.protocol;

import io.netty.channel.Channel;
import io.netty.buffer.Unpooled;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.net.SocketAddress;

import io.netty.buffer.ByteBuf;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.Protocol;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    private final WatchProtocolDecoder decoder;

    public WatchProtocolDecoderTest() {
        Protocol protocolMock = mock(Protocol.class);
        when(protocolMock.getName()).thenReturn("testWatchProtocol");
        decoder = new WatchProtocolDecoder(protocolMock);
    }

}