package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.Map;
import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import io.netty.buffer.ByteBuf;
import org.traccar.helper.Checksum;
import org.traccar.model.Position;
import org.traccar.model.CellTower;

public class GeneratedDecodeGps_MissingLength_ReturnsFalse {

    @Test
    public void decodeGps_MissingLength_ReturnsFalse() {
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer(1);
        boolean hasLength = 0;
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, hasLength, null));
    }

}