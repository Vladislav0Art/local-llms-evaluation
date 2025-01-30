package org.traccar.protocol;

import org.junit.Test;
import org.traccar.session.DeviceSession;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.traccar.BaseProtocolDecoder;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedDecodePositionInvalidDataTest {

    private final Protocol protocol = new Protocol("watch");
    private final WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

    @Test
    public void decodePositionInvalidDataTest() {
        DeviceSession deviceSession = new DeviceSession(1l);
        String data = "Invalid data string for testing";
        Position position = decoder.decodePosition(deviceSession, data);
        assertEquals(null, position);
    }

}