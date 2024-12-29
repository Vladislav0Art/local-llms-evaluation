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

public class GeneratedDecodeGps_Length0_NoData_ReturnsFalse {

    @Test
    public void decodeGps_Length0_NoData_ReturnsFalse() {
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer(0);
        boolean hasLength = 0;
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, hasLength, null));
    }

}