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

public class GeneratedDecodeCellTowerNoDataTest {

    @Test
    public void decodeCellTowerNoDataTest() {
        CellTower cellTower = new CellTower();
        boolean result = Gt06ProtocolDecoder.decodeCellTower(cellTower, Unpooled.copiedBuffer());
        assertFalse(result);
    }

}