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

public class GeneratedDecodeGps_MissingChecksum_ReturnsFalse {

    @Test
    public void decodeGps_MissingChecksum_ReturnsFalse() {
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer(1);
        Checksum checksum = new Checksum();
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, false, null);
        assertFalse(result);
    }

}