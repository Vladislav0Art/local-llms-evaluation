package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.junit.Assert.*;
import static org.mockito.Mockito.any;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeGpsTestWhenHasLength {

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress socketAddress;

    @Mock
    private Protocol protocol;

    @Test
    public void decodeGpsTestWhenHasLength() {
        String msg = "78780a13440604000201cc00287d";
        byte[] bytes = msg.getBytes(StandardCharsets.UTF_8);
        ByteBuf buf = Unpooled.buffer(bytes.length);
        buf.writeBytes(bytes);

        Position position = new Position();

        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true, TimeZone.getDefault());
        assertTrue(result);
    }

}