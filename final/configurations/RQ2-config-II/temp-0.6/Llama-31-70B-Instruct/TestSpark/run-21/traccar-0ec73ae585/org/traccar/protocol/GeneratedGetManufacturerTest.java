package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.BaseProtocolDecoder;
import org.traccar.NetworkMessage;
import org.traccar.Protocol;
import org.traccar.helper.BufferUtil;
import org.traccar.helper.PatternBuilder;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;
import org.traccar.model.WifiAccessPoint;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.regex.Pattern;

public class GeneratedGetManufacturerTest {

    private WatchProtocolDecoder watchProtocolDecoder;

    @org.junit.Before
    public void setUp() {
        Protocol protocol = Mockito.mock(Protocol.class);
        watchProtocolDecoder = new WatchProtocolDecoder(protocol);
    }

    @Test
    public void getManufacturerTest() {
        assertEquals("Watch", watchProtocolDecoder.getManufacturer());
    }

}