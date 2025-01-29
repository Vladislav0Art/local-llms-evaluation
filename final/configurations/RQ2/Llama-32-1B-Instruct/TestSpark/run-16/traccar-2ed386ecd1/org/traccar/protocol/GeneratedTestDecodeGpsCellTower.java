package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;
import org.traccar.model.WifiAccessPoint;

public class GeneratedTestDecodeGpsCellTower {

    @Test
    public void testDecodeGpsCellTower() {
        byte[] cellTowerBytes = BcdUtil.encode(CellTower.WORKING);
        ByteBuf buf = Unpooled.buffer(cellTowerBytes);
        Object result = Gt06ProtocolDecoder.decode(buf, null, true, false, false, TimeZone.getStandardTimeZone());
        assertEquals(CellTower.WORKING, (CellTower) result);
    }

}