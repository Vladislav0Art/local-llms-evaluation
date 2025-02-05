package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.model.Position;
import org.traccar.Protocol;
import org.traccar.NetworkMessage;

import java.nio.charset.StandardCharsets;
import java.util.TimeZone;
import java.util.Date;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.traccar.protocol.Gt06ProtocolDecoder.decodeGps;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Channel channel;

    @Mock
    private Protocol protocol;

    @Test
    public void decodeGpsVendorTest() {
        String content = "$$B120705.2644115010227841001001000001FCC81602EC64F70";
        ByteBuf input = Unpooled.copiedBuffer(content, StandardCharsets.US_ASCII);
        ArgumentCaptor<Object> argument = ArgumentCaptor.forClass(Object.class);

        Position position = new Position();
        assertFalse(decodeGps(position, input, true, TimeZone.getTimeZone("GMT")));

        verify(channel).writeAndFlush(argument.capture(), any());

        ByteBuf output = Unpooled.buffer();
        assertTrue(decodeGps(position, output, true, TimeZone.getTimeZone("GMT")));
    }

    @Test
    public void decodeGpsLengthStructTest() {
        String content = "120705.2644115010227841001001000001FCC81602EC64F70";
        ByteBuf input = Unpooled.copiedBuffer(content, StandardCharsets.US_ASCII);

        Position position = new Position();
        assertFalse(decodeGps(position, input, true, TimeZone.getTimeZone("GMT")));
    }

    @Test
    public void decodeGpsWithoutLengthSignatureTest() {
        String content = "120705.2644115010227841001001000001FCC81602EC64F70";
        ByteBuf input = Unpooled.copiedBuffer(content, StandardCharsets.US_ASCII);

        Position position = new Position();
        assertTrue(decodeGps(position, input, false, TimeZone.getTimeZone("GMT")));
    }

    @Test
    public void decodeGpsWithSatellitesSpeedTest() {
        String content = "$$B100120705.2644115010227841001001000001FCC81602EC64F70";
        ByteBuf input = Unpooled.copiedBuffer(content, StandardCharsets.US_ASCII);

        Position position = new Position();
        assertTrue(decodeGps(position, input, true, true, true, TimeZone.getTimeZone("GMT")));
    }

    @Test
    public void decodeGpsWithEmptyBufferTest() {
        String content = "";
        ByteBuf input = Unpooled.copiedBuffer(content, StandardCharsets.US_ASCII);

        Position position = new Position();
        assertFalse(decodeGps(position, input, true, TimeZone.getTimeZone("GMT")));
    }

}