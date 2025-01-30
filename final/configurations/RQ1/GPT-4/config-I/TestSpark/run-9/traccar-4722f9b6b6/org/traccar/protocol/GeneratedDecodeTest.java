package org.traccar.protocol;

import org.junit.Test;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.session.Session;
import org.traccar.model.Position;
import org.traccar.Protocol;

import java.nio.charset.StandardCharsets;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedDecodeTest {

    @Test
    public void decodeTest() throws Exception {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Channel channel = mock(Channel.class);
        ByteBuf msg = Unpooled.copiedBuffer("[3G*3305887908*0017*LK,101,86,0,0]", StandardCharsets.US_ASCII);
        Position position = (Position) decoder.decode(channel, null, msg);
        assertNotNull(position);
        assertEquals(position.get(Position.KEY_BATTERY_LEVEL), 86);
        assertEquals(position.get(Position.KEY_STEPS), 101);
    }

}