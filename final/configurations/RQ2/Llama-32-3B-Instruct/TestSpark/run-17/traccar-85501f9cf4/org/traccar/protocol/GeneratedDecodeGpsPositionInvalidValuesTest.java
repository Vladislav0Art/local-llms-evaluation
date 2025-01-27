package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.traccar.model.Position;
import org.traccar.model.CellTower;

import java.net.SocketAddress;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.traccar.helper.BcdUtil;
import org.traccar.helper.Parser;
import org.traccar.protocol.Gt06ProtocolDecoder;

public class GeneratedDecodeGpsPositionInvalidValuesTest {

    @Test
    public void decodeGpsPositionInvalidValuesTest() {
        Position position = new Position(37.7749, -122.4194, 0, 36000, "GPS", "", "");
        byte[] data = {0x01, 0x02, 0x03, 0x04};
        boolean result = Gt06ProtocolDecoder.decodeGps(position, Unpooled.copiedBuffer(data));
        assertFalse(result);
    }

}