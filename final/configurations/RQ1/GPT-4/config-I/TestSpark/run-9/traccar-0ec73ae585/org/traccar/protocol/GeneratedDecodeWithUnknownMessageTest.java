package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.session.DeviceSession;

import java.nio.charset.StandardCharsets;
import java.net.SocketAddress;

import static org.mockito.Mockito.*;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertThat;

public class GeneratedDecodeWithUnknownMessageTest {

    @Test
    public void decodeWithUnknownMessageTest() throws Exception {
        Protocol protocol = new Protocol("test");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        ByteBuf msg = Unpooled.wrappedBuffer("UNK*1234*567".getBytes(StandardCharsets.US_ASCII));
        Object result = decoder.decode(null, null, msg);

        Mockito.verify(protocol, times(1)).identify(any(), any());
        Mockito.verify(protocol, times(0)).getLastLocation(any(), anyLong());

        assertFalse(result == null);
    }

}