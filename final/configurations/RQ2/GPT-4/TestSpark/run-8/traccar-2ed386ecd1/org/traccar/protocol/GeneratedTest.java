package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.protocol.Gt06ProtocolDecoder;

import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void decodeGpsHasLengthTest() {
        Gt06ProtocolDecoder decoder = Mockito.mock(Gt06ProtocolDecoder.class);
        Position position = new Position();
        String hex = "1100000000";
        ByteBuf buf = Unpooled.wrappedBuffer(ByteBufUtil.decodeHexDump(hex));
        TimeZone timezone = TimeZone.getTimeZone("Asia/Kolkata");

        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true, timezone);
        assertTrue(result);
    }

    @Test
    public void decodeGpsHasLengthFalseTest() {
        Gt06ProtocolDecoder decoder = Mockito.mock(Gt06ProtocolDecoder.class);
        Position position = new Position();
        String hex = "1100000000";
        ByteBuf buf = Unpooled.wrappedBuffer(ByteBufUtil.decodeHexDump(hex));
        TimeZone timezone = TimeZone.getTimeZone("Asia/Kolkata");

        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, false, timezone);
        assertFalse(result);
    }

    @Test
    public void decodeGpsWithFlagsTest() {
        Gt06ProtocolDecoder decoder = Mockito.mock(Gt06ProtocolDecoder.class);
        Position position = new Position();
        String hex = "1100000000";
        ByteBuf buf = Unpooled.wrappedBuffer(ByteBufUtil.decodeHexDump(hex));
        TimeZone timezone = TimeZone.getTimeZone("Asia/Kolkata");

        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true,
                true, true, timezone);
        assertTrue(result);
    }

    @Test
    public void decodeNetworkMessageTest() throws Exception {
        Gt06ProtocolDecoder decoder = Mockito.mock(Gt06ProtocolDecoder.class);
        byte[] array = ByteBufUtil.decodeHexDump("1100000000");
        Object msg = Unpooled.copiedBuffer(array).toString(StandardCharsets.UTF_8);

        assertNotNull(decoder.decode(null, null, msg));
    }

}