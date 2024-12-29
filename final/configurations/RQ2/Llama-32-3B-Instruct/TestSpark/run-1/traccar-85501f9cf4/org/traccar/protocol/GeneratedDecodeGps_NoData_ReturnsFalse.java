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

public class GeneratedDecodeGps_NoData_ReturnsFalse {

    @Test
    public void decodeGps_NoData_ReturnsFalse() {
        ByteBuf buf = Unpooled.copiedBuffer(0);
        assertFalse(Gt06ProtocolDecoder.decodeGps(null, buf, false, null));
    }

}