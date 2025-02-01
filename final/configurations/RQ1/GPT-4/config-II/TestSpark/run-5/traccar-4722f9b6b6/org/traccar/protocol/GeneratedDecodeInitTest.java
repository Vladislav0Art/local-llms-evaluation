package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.helper.Parser;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.mockito.Mockito.verify;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeInitTest {

    @Mock
    private SocketAddress socketAddress;

    @Test
    public void decodeInitTest() {
        Protocol protocol = new Protocol();
        String data = "[3G*4700990105*000E*INIT,1]";
        ByteBuf buf = Unpooled.copiedBuffer(data, StandardCharsets.US_ASCII);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Object result = decoder.decode(null, socketAddress, buf);
        assertNull(result);
    }

}