package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.BaseProtocol;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.traccar.Protocol;

public class GeneratedDecodeGpsExtendedPositionNullTest {

    @Test
    public void decodeGpsExtendedPositionNullTest() {
        ByteBuf buf = Unpooled.buffer();
        assertFalse(Gt06ProtocolDecoder.decodeGps(null, buf, true, true, true, TimeZone.getDefault()));
    }

}