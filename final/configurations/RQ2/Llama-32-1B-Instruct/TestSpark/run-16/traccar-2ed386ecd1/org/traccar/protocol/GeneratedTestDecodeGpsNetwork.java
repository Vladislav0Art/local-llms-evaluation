package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;
import org.traccar.model.WifiAccessPoint;

public class GeneratedTestDecodeGpsNetwork {

    @Test
    public void testDecodeGpsNetwork() {
        byte[] networkBytes = BcdUtil.encode(Network.CENTRAL_EAST);
        ByteBuf buf = Unpooled.buffer(networkBytes);
        Object result = Gt06ProtocolDecoder.decode(buf, null, true, false, false, TimeZone.getStandardTimeZone());
        assertEquals(Network.CENTRAL_EAST, (Network) result);
    }

}