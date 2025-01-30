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

public class GeneratedDecodePositionTest {

    @Test
    public void decodePositionTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("test"));
        DeviceSession deviceSession = mock(DeviceSession.class);
        when(deviceSession.getDeviceId()).thenReturn(1l);

        String data = "170821,084122,A,22.572645,N,88.363895,E,10,100,50,7,5,6,100,0,00000000,1,0,100,01,00,04,5100,BB,2590,62031,0,5100,BB,2590,62032,-71";
        // decodePosition is a private method and not directly testable.
        // You would need to add some test hook methods or make the method package-protected or public.
    }

}