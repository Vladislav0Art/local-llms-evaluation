package org.traccar.protocol;

import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;
import io.netty.channel.Channel;
import org.mockito.Mockito;
import io.netty.buffer.ByteBuf;

import java.net.SocketAddress;

import static org.junit.Assert.*;

public class GeneratedDecodeAlarmTest {

    @Test
    public void decodeAlarmTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("WatchProtocolDecoderTest"));
        assertEquals(decoder.decodeAlarm(16), Position.ALARM_SOS);
    }

}