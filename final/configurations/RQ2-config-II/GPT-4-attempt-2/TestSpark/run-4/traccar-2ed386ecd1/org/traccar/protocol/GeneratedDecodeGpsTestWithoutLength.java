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

import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeGpsTestWithoutLength {

    private final Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol("gt06"));

    @Mock
    private Channel channel;

    private ByteBuf buf(String data) {
        return Unpooled.copiedBuffer(data.getBytes(StandardCharsets.ISO_8859_1));
    }

    @Test
    public void decodeGpsTestWithoutLength() {
        Position position = new Position();
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf("122.227152,36.681385,060721 064432,2,0,183,8"), false, TimeZone.getDefault()));
    }

}