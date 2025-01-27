package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import io.netty.buffer.ByteBuf;
import org.traccar.BaseProtocolDecoder;
import org.traccar.session.DeviceSession;
import org.traccar.NetworkMessage;
import org.traccar.Protocol;
import org.traccar.helper.BcdUtil;
import org.traccar.helper.BitUtil;
import org.traccar.helper.Checksum;
import org.traccar.helper.DateBuilder;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;
import org.traccar.model.WifiAccessPoint;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;

public class GeneratedDecode_WithCorrectValues {

    @Test
    public void decode_WithCorrectValues() throws Exception {
        DeviceSession session = new DeviceSession();
        Channel channel = new Channel();
        SocketAddress remoteAddress = new SocketAddress();
        Object msg = new NetworkMessage("Gt06", "1234");
        Object result = Gt06ProtocolDecoder.decode(channel, remoteAddress, msg);
        assertNotNull(result);
    }

}