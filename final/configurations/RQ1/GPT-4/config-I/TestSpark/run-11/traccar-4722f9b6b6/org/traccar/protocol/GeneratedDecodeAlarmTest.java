package org.traccar.protocol;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.junit.Test;
import org.traccar.model.Command;

import static org.junit.Assert.assertNotNull;

public class GeneratedDecodeAlarmTest {

    @Test
    public void decodeAlarmTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new WatchProtocol());

        assertNotNull(decoder.decodeAlarm(1));
        assertNotNull(decoder.decodeAlarm(2));
        assertNotNull(decoder.decodeAlarm(14));
        assertNotNull(decoder.decodeAlarm(16));
        assertNotNull(decoder.decodeAlarm(17));
        assertNotNull(decoder.decodeAlarm(18));
        assertNotNull(decoder.decodeAlarm(19));
        assertNotNull(decoder.decodeAlarm(20));
        assertNotNull(decoder.decodeAlarm(21));
    }

}