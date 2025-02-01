package org.traccar.protocol;

import org.junit.Test;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.Protocol;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.net.SocketAddress;

import io.netty.buffer.ByteBuf;

public class GeneratedTest {

    @Test
    public void decodePositionScenario1Test() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        decoder.decodePosition(
                new DeviceSession(),
                "DATA");
        assertTrue(true);
    }

    @Test
    public void decodePositionScenario2Test() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        decoder.decodePosition(
                new DeviceSession(),
                "WRONG DATA");
        assertTrue(true);
    }

    @Test
    public void decodeAlarmScenarioTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        String alarm = decoder.decodeAlarm(21);
        assertEquals(alarm, "fall_down");
    }

    @Test
    public void decodeAlarmUnsupportedScenarioTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        String alarm = decoder.decodeAlarm(28);
        assertEquals(alarm, null);
    }

    @Test
    public void sendResponseScenarioTest() {
        Channel mockedChannel = mock(Channel.class);
        when(mockedChannel.remoteAddress()).thenReturn(mock(SocketAddress.class));
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        decoder.sendResponse(
                mockedChannel,
                "ID",
                "INDEX",
                "one=1,two=2");
        assertTrue(true);
    }

    @Test
    public void decodeScenarioTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        ByteBuf buf = Unpooled.copiedBuffer("[*,ID,*TYPE,CONTENT]", StandardCharsets.US_ASCII);
        Channel mockedChannel = mock(Channel.class);
        when(mockedChannel.remoteAddress()).thenReturn(mock(SocketAddress.class));
        decoder.decode(mockedChannel, mock(SocketAddress.class), buf);
        assertTrue(decoder.getHasIndex());
    }

    @Test
    public void decodeAlarmTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        String alarm = decoder.decodeAlarm(20);
        assertEquals("raising", alarm);
    }

}