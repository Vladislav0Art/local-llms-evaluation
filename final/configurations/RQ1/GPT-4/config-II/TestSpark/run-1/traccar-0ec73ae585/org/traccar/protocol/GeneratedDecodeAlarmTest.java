package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.embedded.EmbeddedChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import org.junit.Assert;
import org.junit.Test;
import org.traccar.ProtocolTest;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class GeneratedDecodeAlarmTest {

    @Test
    public void decodeAlarmTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new WatchProtocol());
        assertNull(decoder.decodeAlarm(5));
        assertNotNull(decoder.decodeAlarm(0));
        assertNotNull(decoder.decodeAlarm(1));
        assertNotNull(decoder.decodeAlarm(14));
        assertNotNull(decoder.decodeAlarm(16));
        assertNotNull(decoder.decodeAlarm(17));
        assertNotNull(decoder.decodeAlarm(18));
        assertNotNull(decoder.decodeAlarm(19));
        assertNotNull(decoder.decodeAlarm(20));
        assertNotNull(decoder.decodeAlarm(21));
        assertNotNull(decoder.decodeAlarm(22));
    }

}