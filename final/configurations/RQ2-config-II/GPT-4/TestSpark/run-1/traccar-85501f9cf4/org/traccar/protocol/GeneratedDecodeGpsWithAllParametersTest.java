package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeGpsWithAllParametersTest {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @Test
    public void decodeGpsWithAllParametersTest() {
        genDecoderStub();
        Position position = new Position();
        position.setTimeZone(TimeZone.getTimeZone("GMT"));
        position.setProtocol(protocol);
        boolean result = Gt06ProtocolDecoder.decodeGps(position, Unpooled.copiedBuffer("20823189031206053911869250001900420000910060105000601".getBytes(StandardCharsets.UTF_8)), true, true, true, position.getTimeZone());
        assertTrue(result);
    }

}