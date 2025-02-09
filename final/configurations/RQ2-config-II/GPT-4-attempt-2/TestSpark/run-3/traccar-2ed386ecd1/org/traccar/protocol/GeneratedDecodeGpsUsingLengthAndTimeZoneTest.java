package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.traccar.model.Position;
import org.traccar.Protocol;

import static org.junit.Assert.*;

import java.net.SocketAddress;
import java.util.TimeZone;

import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
public class GeneratedDecodeGpsUsingLengthAndTimeZoneTest {

    Gt06ProtocolDecoder .class,Protocol .class
})

public class Gt06ProtocolDecoderTest {

    @Test
    public void decodeGpsUsingLengthAndTimeZoneTest() {
        ByteBuf buf = Unpooled.copiedBuffer(new byte[]{0, 1, 2});
        Position position = new Position();
        boolean hasLength = true;
        TimeZone timezone = TimeZone.getDefault();
        boolean res = Gt06ProtocolDecoder.decodeGps(position, buf, hasLength, timezone);
        assertNotNull(res);
    }

}