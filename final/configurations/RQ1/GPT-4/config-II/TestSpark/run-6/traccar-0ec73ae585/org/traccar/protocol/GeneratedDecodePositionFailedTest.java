package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedDecodePositionFailedTest {

    @Test
    public void decodePositionFailedTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));
        DeviceSession deviceSession = mock(DeviceSession.class);
        assertNull(decoder.decodePosition(deviceSession, ""));
    }

}