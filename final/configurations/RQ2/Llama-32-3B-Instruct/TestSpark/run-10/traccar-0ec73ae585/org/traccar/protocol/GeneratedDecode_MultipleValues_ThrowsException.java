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

public class GeneratedDecode_MultipleValues_ThrowsException {

    private static final int WATCH_PROTOCOL = 5;

    @Test
    public void decode_MultipleValues_ThrowsException() throws Exception {
        byte[] data = "000102030405060708090a0b0c".getBytes(StandardCharsets.US_ASCII); // multiple values
        Object msg = new NetworkMessage(data);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol(WATCH_PROTOCOL));
        assertThrows(Exception.class, () -> decoder.decode(null, null, msg));
    }

}