package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;
import org.traccar.model.WifiAccessPoint;

public class GeneratedTestDecodeGpsPositionWithChecksum {

    @Test
    public void testDecodeGpsPositionWithChecksum() {
        byte[] positionBytes = BcdUtil.encode(Position.CENTER_EAST, 0x12345678);
        ByteBuf buf = Unpooled.buffer(positionBytes);
        Object result = Gt06ProtocolDecoder.decode(buf, null, true, false, false, TimeZone.getStandardTimeZone());
        assertEquals(Position.CENTER_EAST, (Position) result);
    }

}