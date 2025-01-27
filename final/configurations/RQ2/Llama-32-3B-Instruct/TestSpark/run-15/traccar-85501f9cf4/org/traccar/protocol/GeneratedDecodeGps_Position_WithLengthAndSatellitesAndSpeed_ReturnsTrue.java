package org.traccar.protocol;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
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

public class GeneratedDecodeGps_Position_WithLengthAndSatellitesAndSpeed_ReturnsTrue {

    @BeforeClass
    public static void setup() {
        Protocol protocol = new Protocol();
        // initialization
    }

    @Test
    public void decodeGps_Position_WithLengthAndSatellitesAndSpeed_ReturnsTrue() {
        Position position = new Position(1, 2, 3);
        boolean result = Gt06ProtocolDecoder.decodeGps(position, ByteBufUtil.content(), true, false, true, TimeZone.getTimeZone("UTC"));
        assertTrue(result);
    }

}