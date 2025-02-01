package org.traccar.protocol;

import static org.junit.Assert.*;

import org.junit.Test;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.helper.UnitsConverter;
import org.traccar.Protocol;
import org.traccar.Context;
import org.traccar.protocol.ProtocolDecoderTest;
import org.traccar.model.Position;
import org.traccar.helper.TestIdentityManager;
import org.traccar.model.Network;

import java.nio.charset.StandardCharsets;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class GeneratedTest {

    @Test
    public void initProtocolDecoder() {
        assertNotNull(new WatchProtocolDecoder(new Protocol("watch")));
    }

    @Test
    public void sendResponseTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));
        decoder.sendResponse(channel, "123456", "abc", "testing");
        assertEquals(decoder.getHasIndex(), true);
        assertEquals(decoder.getManufacturer(), null);
    }

    @Test
    public void decodeAlarmTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));
        assertNull(decoder.decodeAlarm(10));
        assertEquals(decoder.decodeAlarm(0), Position.ALARM_LOW_BATTERY);
        assertEquals(decoder.decodeAlarm(1), Position.ALARM_GEOFENCE_EXIT);
        assertEquals(decoder.decodeAlarm(21), Position.ALARM_FALL_DOWN);
    }

    @Test
    public void decodePositionTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));
        assertNull(decoder.decodePosition(null, "bad data"));
    }

    @Test
    public void decodeTest() throws Exception {
        Context.init(new TestIdentityManager());
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));
        ByteBuf buf = Unpooled.copiedBuffer("INIT", StandardCharsets.US_ASCII);
        assertNull(decoder.decode(null, null, buf));
    }

    @Test
    public void decodeValidData() throws Exception {
        Context.init(new TestIdentityManager());
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));
        ByteBuf buf = Unpooled.copiedBuffer("[3G*123456*0007*LK]", StandardCharsets.US_ASCII);
        Position position = decoder.decode(null, null, buf);
        assertNotNull(position);
    }

    @Test
    public void decodeInvalidData() throws Exception {
        Context.init(new TestIdentityManager());
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));
        ByteBuf buf = Unpooled.copiedBuffer("[3G*123456*0007*XX]", StandardCharsets.US_ASCII);
        Position position = decoder.decode(null, null, buf);
        assertNull(position);
    }

}