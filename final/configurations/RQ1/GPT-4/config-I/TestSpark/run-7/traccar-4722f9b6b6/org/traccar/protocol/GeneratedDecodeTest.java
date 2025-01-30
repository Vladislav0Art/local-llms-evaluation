package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.BaseProtocolDecoder;
import org.traccar.Protocol;
import org.traccar.session.DeviceSession;
import io.netty.channel.Channel;
import io.netty.buffer.ByteBuf;

import java.net.SocketAddress;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedDecodeTest {

    @Test
    public void DecodeTest() throws Exception {
        Protocol protocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        ByteBuf buf = Mockito.mock(ByteBuf.class);
        when(buf.readSlice(2)).thenReturn(buf);
        when(buf.toString(java.nio.charset.StandardCharsets.US_ASCII)).thenReturn("UDTEST,TEST");
        when(buf.readerIndex()).thenReturn(0);
        when(buf.indexOf(Mockito.anyInt(), Mockito.anyInt(), Mockito.anyByte())).thenReturn(1);

        DeviceSession deviceSession = Mockito.mock(DeviceSession.class);
        when(deviceSession.getDeviceId()).thenReturn(1L);
        when(decoder.getDeviceSession(Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(deviceSession);

        Object result = decoder.decode(Mockito.mock(Channel.class), Mockito.mock(SocketAddress.class), buf);
        assertNotNull(result);
    }

}