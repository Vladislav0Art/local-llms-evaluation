package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.traccar.Model;
import org.traccar.Protocol;
import org.traccar.dao.ServerManager;
import org.traccar.model.Position;
import org.traccar.protocol.WatchProtocolDecoder;
import org.mockito.Mockito;
import org.traccar.session.Session;
import org.traccar.session.SessionManager;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class GeneratedDecodeAlarmRemovingTest {

    @Test
    public void decodeAlarmRemovingTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("name"));
        String alarm = decoder.decodeAlarm(1048576);
        assertEquals(Position.ALARM_REMOVING, alarm);
    }

}