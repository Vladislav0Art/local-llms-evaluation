package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.regex.Pattern;

import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;
import org.traccar.model.WifiAccessPoint;
import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;

public class GeneratedDecode_WatchCellTowerMessage Test {

    @Test
    public void decode_WatchCellTowerMessage

    Test() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = null;
        Date date = new Date();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH CellTower Protocol);
        byte[] result = decoder.decode(channel, remoteAddress, msg);
        assertNotNull(result);
    }

}