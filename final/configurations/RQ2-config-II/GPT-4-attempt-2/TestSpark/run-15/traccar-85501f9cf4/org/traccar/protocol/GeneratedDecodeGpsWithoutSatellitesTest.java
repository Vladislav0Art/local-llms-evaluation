package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeGpsWithoutSatellitesTest {

    @Mock
    Protocol protocol;

    @Mock
    SocketAddress remoteAddress;

    @Test
    public void decodeGpsWithoutSatellitesTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);

        Position position = new Position();

        ByteBuf buf = Unpooled.buffer();
        buf.writeBytes(new byte[]{0x00});

        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, true, false, true, TimeZone.getDefault()));
    }

}