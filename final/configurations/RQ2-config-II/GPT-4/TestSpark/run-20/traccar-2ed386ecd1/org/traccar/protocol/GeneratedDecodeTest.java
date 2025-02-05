package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.model.WifiAccessPoint;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeTest {

    private Protocol protocol = new Protocol("gt06");
    private Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
    private ByteBuf buf;

    @Test
    public void decodeTest() throws Exception {
        Channel channel = mock(Channel.class);
        String data = "0100000786160902122837000100000000";
        buf = Unpooled.copiedBuffer(data.getBytes());

        Object result = decoder.decode(channel, new InetSocketAddress(5000), buf);

        assertNull(result);
    }

}