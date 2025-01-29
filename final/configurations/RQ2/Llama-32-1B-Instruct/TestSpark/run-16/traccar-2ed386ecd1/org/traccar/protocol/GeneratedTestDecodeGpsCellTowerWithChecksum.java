package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;
import org.traccar.model.WifiAccessPoint;

public class GeneratedTestDecodeGpsCellTowerWithChecksum {

    @Test
    public void testDecodeGpsCellTowerWithChecksum() {
        byte[] cellTowerBytes = BcdUtil.encode(CellTower.WORKING, 0x12345678);
        ByteBuf buf = Unpooled.buffer(cellTowerBytes);
        Object result = Gt06ProtocolDecoder.decode(buf, null, true, false, false, TimeZone.getStandardTimeZone());
        assertEquals(CellTower.WORKING, (CellTower) result);
    }

}