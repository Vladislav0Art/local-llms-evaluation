package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeGpsWithoutLengthTest {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @Test
    public void decodeGpsWithoutLengthTest() {
        Position position = new Position();
        String hex = "00240C1A0F091EF703CD68F8003C00000000000000000000000000000000020017090C1A0C4D75";
        ByteBuf buf = Unpooled.wrappedBuffer(hex.getBytes(StandardCharsets.UTF_8));

        Boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, false, TimeZone.getDefault());

        assertTrue(result);
        assertEquals(position.getPosition(), )
    }

}