package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.regex.Pattern;

import org.mockito.Mockito;
import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.BitUtil;
import org.traccar.helper.BufferUtil;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;
import org.traccar.model.WifiAccessPoint;

import java.net.SocketAddress;

public class GeneratedDecode_ValidMessage_ReturnsNetworkMessage {

    @Test
    public void decode_ValidMessage_ReturnsNetworkMessage() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = Unpooled.buffer().retain(10).retainedData("test", "test");
        NetworkMessage expected = new NetworkMessage();
        expected.setProtocolId(1);
        expected.setProtocolName("test");
        assertEquals(expected, new WatchProtocolDecoder(Mockito.mock(Protocol.class)).decode(channel, remoteAddress, msg));
    }

}