package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.TimeZone;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void decodeGpsTrueWithLengthTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol("GT06-Protocol"));
        Position position = new Position();
        byte[] bytes = {1, 0, 0, 0, 1, 0, 0, 0};
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        boolean result = decoder.decodeGps(position, Unpooled.copiedBuffer(bytes), true, calendar.getTimeZone());
        assertTrue(result);
    }

    @Test
    public void decodeGpsFalseWithoutLengthTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol("GT06-Protocol"));
        Position position = new Position();
        byte[] bytes = {1, 1, 1, 1};
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        boolean result = decoder.decodeGps(position, Unpooled.copiedBuffer(bytes), false, calendar.getTimeZone());
        assertFalse(result);
    }

    @Test
    public void decodeGpsTrueWithParametersTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol("GT06-Protocol"));
        Position position = new Position();
        byte[] bytes = {1, 0, 0, 0, 1, 0, 0, 0};
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        boolean result = decoder.decodeGps(position, Unpooled.copiedBuffer(bytes), true, true, true, calendar.getTimeZone());
        assertTrue(result);
    }

    @Test
    public void decodeGpsFalseWithoutParametersTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol("GT06-Protocol"));
        Position position = new Position();
        byte[] bytes = {1, 0, 0, 0, 1, 0, 0, 0};
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        boolean result = decoder.decodeGps(position, Unpooled.copiedBuffer(bytes), false, false, false, calendar.getTimeZone());
        assertFalse(result);
    }

    @Test
    public void decodeMethodTest() throws Exception {
        Protocol protocol = Mockito.mock(Protocol.class);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        byte[] bytes = "test message".getBytes(StandardCharsets.UTF_8);
        decoder.decode(channel, remoteAddress, Unpooled.wrappedBuffer(bytes));
        Mockito.verify(protocol).identify(null, channel, remoteAddress, "test message");
    }

}