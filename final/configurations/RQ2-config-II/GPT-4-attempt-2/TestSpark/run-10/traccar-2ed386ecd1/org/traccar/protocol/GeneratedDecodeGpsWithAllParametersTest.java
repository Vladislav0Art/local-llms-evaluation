package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeGpsWithAllParametersTest {

    @Mock
    private Channel channel;

    @Mock
    private Protocol protocol;

    @Test
    public void decodeGpsWithAllParametersTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        Position position = new Position();
        String str = "0d010353327020220888120302002859c80010020003e800000000";
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        boolean result = Gt06ProtocolDecoder.decodeGps(position, Unpooled.copiedBuffer(bytes), true, true, true, TimeZone.getDefault());
        assertTrue(result);
    }

}