package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Date;

import io.netty.buffer.ByteBuf;
import org.traccar.BaseProtocolDecoder;
import org.traccar.session.DeviceSession;
import org.traccar.NetworkMessage;
import org.traccar.Protocol;
import org.traccar.helper.BitUtil;
import org.traccar.helper.BufferUtil;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.helper.UnitsConverter;

public class GeneratedGetManufacturer_WatchProtocol_MatchesExpectedValue {

    private static final int WATCH_PROTOCOL = 5;

    @Test
    public void getManufacturer_WatchProtocol_MatchesExpectedValue() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol(5));
        assertEquals("Watch", decoder.getManufacturer());
    }

}