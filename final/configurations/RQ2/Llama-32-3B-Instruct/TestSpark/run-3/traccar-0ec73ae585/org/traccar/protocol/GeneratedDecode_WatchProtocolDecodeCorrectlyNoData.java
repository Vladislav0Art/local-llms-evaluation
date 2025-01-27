package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
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

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.regex.Pattern;

public class GeneratedDecode_WatchProtocolDecodeCorrectlyNoData {

    @Test
    public void decode_WatchProtocolDecodeCorrectlyNoData() throws Exception {
        Channel channel = null;
        SocketAddress remoteAddress = null;
        Object msg = null;

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        NetworkMessage networkMessage = (NetworkMessage) decoder.decode(channel, remoteAddress, msg);
        assertNull(networkMessage.getData());
    }

}