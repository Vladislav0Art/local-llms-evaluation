package org.traccar.protocol;

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

public class GeneratedTest {

    @Test
    public void testDecodeGpsPosition() {
        Position position = new Position();
        position.setLatitude(37.7749);
        position.setLongitude(-122.4194);

        ByteBuf buf = Unpooled.buffer();
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol("GT06"));

        boolean hasLength = false;
        TimeZone timezone = null;

        boolean result1 = decoder.decodeGps(position, buf, hasLength, timezone);
        assertTrue(result1);

        boolean result2 = decoder.decodeGps(position, buf, hasLength, false, true, timezone);
        assertFalse(result2);

        boolean result3 = decoder.decodeGps(position, buf, hasLength, null, true, timezone);
        assertFalse(result3);

        boolean result4 = decoder.decodeGps(position, buf, hasLength, false, false, timezone);
        assertFalse(result4);
    }

    @Test
    public void testDecodeGt06Protocol() {
        ByteBuf buf = Unpooled.buffer();
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol("GT06"));

        boolean result1 = decoder.decode(buf, null, true);
        assertFalse(result1);

        boolean result2 = decoder.decode(buf, null, false);
        assertTrue(result2);
    }

    @Test
    public void testDecodeGt06DecodeBuffer() {
        ByteBuf buf = Unpooled.buffer();
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol("GT06"));

        decoder.decode(buf, null, true);

        Boolean hasLength = false;
        TimeZone timezone = null;

        boolean result1 = decoder.decodeGps(position, buf, hasLength, timezone);
        assertTrue(result1);

        boolean result2 = decoder.decodeGps(position, buf, hasLength, false, true, timezone);
        assertFalse(result2);

        boolean result3 = decoder.decodeGps(position, buf, hasLength, null, true, timezone);
        assertFalse(result3);

        boolean result4 = decoder.decodeGps(position, buf, hasLength, false, false, timezone);
        assertFalse(result4);
    }

    @Test
    public void testDecodeNetworkMessage() {
        Network network = new Network();
        network.setCellTowers(new CellTower[]{new CellTower()});
        network.setPosition(new Position());

        ByteBuf buf = Unpooled.buffer();
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol("GT06"));

        boolean hasLength = false;
        TimeZone timezone = null;

        boolean result1 = decoder.decodeNetwork(network, buf, hasLength, timezone);
        assertTrue(result1);

        boolean result2 = decoder.decodeNetwork(network, buf, true, timezone);
        assertFalse(result2);

        boolean result3 = decoder.decodeNetwork(network, buf, false, null);
        assertFalse(result3);

        boolean result4 = decoder.decodeNetwork(network, buf, false, false);
        assertFalse(result4);
    }

}