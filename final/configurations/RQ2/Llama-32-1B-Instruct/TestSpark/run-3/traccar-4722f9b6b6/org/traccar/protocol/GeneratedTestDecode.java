package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.session.DeviceSession;
import org.traccar.NetworkMessage;
import org.traccar.Protocol;
import org.traccar.helper.BitUtil;
import org.traccar.helper.BufferUtil;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;
import org.traccar.model.WifiAccessPoint;

public class GeneratedTestDecode {

    public static BaseProtocolDecoder getDecoder() {
        return decoder;
    }

    public Channel createChannel() {
        return Unpooled.bufferedWriter().writer();
    }

    public SocketAddress createRemoteAddress(int port) {
        return Unpooled.bufferedWriter().bufferedReader("Hello World").remoteAddress();
    }

    @Test
    public void testDecode() {
        BaseProtocolDecoder decoder = getDecoder();
        Channel channel = createChannel();
        SocketAddress remoteAddress = createRemoteAddress(8080);
        byte[] msg = new byte[BufferUtil.length(100)];
        BitUtil.copy(new ByteBuf(msg), 0, 5, true);
        Object result = decoder.decode(channel, remoteAddress, BufferUtil.toByteBuf(msg));
        assertNotNull(result);
    }

}