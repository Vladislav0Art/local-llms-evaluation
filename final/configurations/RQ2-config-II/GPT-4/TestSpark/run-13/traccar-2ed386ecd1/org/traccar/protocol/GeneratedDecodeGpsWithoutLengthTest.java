package org.traccar.protocol;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import io.netty.channel.socket.SocketAddressImpl;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.util.TimeZone;

public class GeneratedDecodeGpsWithoutLengthTest {

    @Test
    public void decodeGpsWithoutLengthTest() {
        ByteBuf buf = mock(ByteBuf.class);
        when(buf.readableBytes()).thenReturn(0);

        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol(""));

        Position position = new Position();
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, false, TimeZone.getDefault());

        assertTrue(result);
        verify(buf, times(2)).readableBytes();
    }

}