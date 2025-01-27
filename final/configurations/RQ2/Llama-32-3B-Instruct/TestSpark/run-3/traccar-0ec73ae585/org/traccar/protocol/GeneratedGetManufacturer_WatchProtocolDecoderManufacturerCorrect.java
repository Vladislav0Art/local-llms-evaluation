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

public class GeneratedGetManufacturer_WatchProtocolDecoderManufacturerCorrect {

    @Test
    public void getManufacturer_WatchProtocolDecoderManufacturerCorrect() {
        Protocol protocol = new Protocol();
        protocol.setManufacturer("Watch");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertEquals("Watch", decoder.getManufacturer());
    }

}