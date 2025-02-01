package org.traccar.protocol;

import org.junit.Test;
import org.traccar.network.DataProtocol;
import org.traccar.model.Position;
import org.traccar.protocol.GalileoProtocolDecoder;

import java.net.SocketAddress;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedDecodeUnknownTagTest {

    @Test
    public void decodeUnknownTagTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new GalileoProtocol());
        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(0xff);
        decoder.decode(null, mock(SocketAddress.class), buf);
    }

}